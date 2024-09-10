package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AddHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteHiddenOffersRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetHiddenOffersResponse;

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

public class HiddenOffersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(HiddenOffersApiHandler.class);

    private final HiddenOffersApi api;

    public HiddenOffersApiHandler(HiddenOffersApi api) {
        this.api = api;
    }

    @Deprecated
    public HiddenOffersApiHandler() {
        this(new HiddenOffersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addHiddenOffers").handler(this::addHiddenOffers);
        builder.operation("deleteHiddenOffers").handler(this::deleteHiddenOffers);
        builder.operation("getHiddenOffers").handler(this::getHiddenOffers);
    }

    private void addHiddenOffers(RoutingContext routingContext) {
        logger.info("addHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        AddHiddenOffersRequest addHiddenOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AddHiddenOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter addHiddenOffersRequest is {}", addHiddenOffersRequest);

        api.addHiddenOffers(campaignId, addHiddenOffersRequest)
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

    private void deleteHiddenOffers(RoutingContext routingContext) {
        logger.info("deleteHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteHiddenOffersRequest deleteHiddenOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteHiddenOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter deleteHiddenOffersRequest is {}", deleteHiddenOffersRequest);

        api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)
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

    private void getHiddenOffers(RoutingContext routingContext) {
        logger.info("getHiddenOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<String> offerId = requestParameters.queryParameter("offer_id") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("offer_id").get(), new TypeReference<List<String>>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter offerId is {}", offerId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)
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
