package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOutletLicensesResponse;
import java.util.Set;
import org.openapitools.vertxweb.server.model.UpdateOutletLicenseRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class OutletLicensesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OutletLicensesApiHandler.class);

    private final OutletLicensesApi api;

    public OutletLicensesApiHandler(OutletLicensesApi api) {
        this.api = api;
    }

    @Deprecated
    public OutletLicensesApiHandler() {
        this(new OutletLicensesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteOutletLicenses").handler(this::deleteOutletLicenses);
        builder.operation("getOutletLicenses").handler(this::getOutletLicenses);
        builder.operation("updateOutletLicenses").handler(this::updateOutletLicenses);
    }

    private void deleteOutletLicenses(RoutingContext routingContext) {
        logger.info("deleteOutletLicenses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Set<Long> ids = requestParameters.queryParameter("ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ids").get(), new TypeReference<Set<Long>>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter ids is {}", ids);

        api.deleteOutletLicenses(campaignId, ids)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getOutletLicenses(RoutingContext routingContext) {
        logger.info("getOutletLicenses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Set<Long> outletIds = requestParameters.queryParameter("outletIds") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("outletIds").get(), new TypeReference<Set<Long>>(){}) : null;
        Set<Long> ids = requestParameters.queryParameter("ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("ids").get(), new TypeReference<Set<Long>>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter outletIds is {}", outletIds);
        logger.debug("Parameter ids is {}", ids);

        api.getOutletLicenses(campaignId, outletIds, ids)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateOutletLicenses(RoutingContext routingContext) {
        logger.info("updateOutletLicenses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOutletLicenseRequest updateOutletLicenseRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOutletLicenseRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateOutletLicenseRequest is {}", updateOutletLicenseRequest);

        api.updateOutletLicenses(campaignId, updateOutletLicenseRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
