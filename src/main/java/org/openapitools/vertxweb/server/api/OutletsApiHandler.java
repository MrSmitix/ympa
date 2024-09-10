package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.ChangeOutletRequest;
import org.openapitools.vertxweb.server.model.CreateOutletResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOutletResponse;
import org.openapitools.vertxweb.server.model.GetOutletsResponse;

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

public class OutletsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OutletsApiHandler.class);

    private final OutletsApi api;

    public OutletsApiHandler(OutletsApi api) {
        this.api = api;
    }

    @Deprecated
    public OutletsApiHandler() {
        this(new OutletsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createOutlet").handler(this::createOutlet);
        builder.operation("deleteOutlet").handler(this::deleteOutlet);
        builder.operation("getOutlet").handler(this::getOutlet);
        builder.operation("getOutlets").handler(this::getOutlets);
        builder.operation("updateOutlet").handler(this::updateOutlet);
    }

    private void createOutlet(RoutingContext routingContext) {
        logger.info("createOutlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ChangeOutletRequest changeOutletRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ChangeOutletRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter changeOutletRequest is {}", changeOutletRequest);

        api.createOutlet(campaignId, changeOutletRequest)
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

    private void deleteOutlet(RoutingContext routingContext) {
        logger.info("deleteOutlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long outletId = requestParameters.pathParameter("outletId") != null ? requestParameters.pathParameter("outletId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter outletId is {}", outletId);

        api.deleteOutlet(campaignId, outletId)
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

    private void getOutlet(RoutingContext routingContext) {
        logger.info("getOutlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long outletId = requestParameters.pathParameter("outletId") != null ? requestParameters.pathParameter("outletId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter outletId is {}", outletId);

        api.getOutlet(campaignId, outletId)
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

    private void getOutlets(RoutingContext routingContext) {
        logger.info("getOutlets()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Long regionId = requestParameters.queryParameter("region_id") != null ? requestParameters.queryParameter("region_id").getLong() : null;
        String shopOutletCode = requestParameters.queryParameter("shop_outlet_code") != null ? requestParameters.queryParameter("shop_outlet_code").getString() : null;
        Long regionId2 = requestParameters.queryParameter("regionId") != null ? requestParameters.queryParameter("regionId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter regionId is {}", regionId);
        logger.debug("Parameter shopOutletCode is {}", shopOutletCode);
        logger.debug("Parameter regionId2 is {}", regionId2);

        api.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)
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

    private void updateOutlet(RoutingContext routingContext) {
        logger.info("updateOutlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long outletId = requestParameters.pathParameter("outletId") != null ? requestParameters.pathParameter("outletId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ChangeOutletRequest changeOutletRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ChangeOutletRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter outletId is {}", outletId);
        logger.debug("Parameter changeOutletRequest is {}", changeOutletRequest);

        api.updateOutlet(campaignId, outletId, changeOutletRequest)
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
