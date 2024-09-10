package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetQualityRatingDetailsResponse;
import org.openapitools.vertxweb.server.model.GetQualityRatingRequest;
import org.openapitools.vertxweb.server.model.GetQualityRatingResponse;

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

public class RatingsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(RatingsApiHandler.class);

    private final RatingsApi api;

    public RatingsApiHandler(RatingsApi api) {
        this.api = api;
    }

    @Deprecated
    public RatingsApiHandler() {
        this(new RatingsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getQualityRatingDetails").handler(this::getQualityRatingDetails);
        builder.operation("getQualityRatings").handler(this::getQualityRatings);
    }

    private void getQualityRatingDetails(RoutingContext routingContext) {
        logger.info("getQualityRatingDetails()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getQualityRatingDetails(campaignId)
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

    private void getQualityRatings(RoutingContext routingContext) {
        logger.info("getQualityRatings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQualityRatingRequest getQualityRatingRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQualityRatingRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getQualityRatingRequest is {}", getQualityRatingRequest);

        api.getQualityRatings(businessId, getQualityRatingRequest)
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
