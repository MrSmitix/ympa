package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetBidsInfoRequest;
import org.openapitools.vertxweb.server.model.GetBidsInfoResponse;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetBidsRecommendationsResponse;
import org.openapitools.vertxweb.server.model.PutSkuBidsRequest;

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

public class BidsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BidsApiHandler.class);

    private final BidsApi api;

    public BidsApiHandler(BidsApi api) {
        this.api = api;
    }

    @Deprecated
    public BidsApiHandler() {
        this(new BidsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getBidsInfoForBusiness").handler(this::getBidsInfoForBusiness);
        builder.operation("getBidsRecommendations").handler(this::getBidsRecommendations);
        builder.operation("putBidsForBusiness").handler(this::putBidsForBusiness);
        builder.operation("putBidsForCampaign").handler(this::putBidsForCampaign);
    }

    private void getBidsInfoForBusiness(RoutingContext routingContext) {
        logger.info("getBidsInfoForBusiness()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetBidsInfoRequest getBidsInfoRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetBidsInfoRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getBidsInfoRequest is {}", getBidsInfoRequest);

        api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
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

    private void getBidsRecommendations(RoutingContext routingContext) {
        logger.info("getBidsRecommendations()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetBidsRecommendationsRequest getBidsRecommendationsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetBidsRecommendationsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getBidsRecommendationsRequest is {}", getBidsRecommendationsRequest);

        api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)
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

    private void putBidsForBusiness(RoutingContext routingContext) {
        logger.info("putBidsForBusiness()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        PutSkuBidsRequest putSkuBidsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PutSkuBidsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter putSkuBidsRequest is {}", putSkuBidsRequest);

        api.putBidsForBusiness(businessId, putSkuBidsRequest)
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

    private void putBidsForCampaign(RoutingContext routingContext) {
        logger.info("putBidsForCampaign()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        PutSkuBidsRequest putSkuBidsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<PutSkuBidsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter putSkuBidsRequest is {}", putSkuBidsRequest);

        api.putBidsForCampaign(campaignId, putSkuBidsRequest)
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
