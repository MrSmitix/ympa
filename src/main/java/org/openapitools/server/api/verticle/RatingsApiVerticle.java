package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetQualityRatingDetailsResponse;
import org.openapitools.server.api.model.GetQualityRatingRequest;
import org.openapitools.server.api.model.GetQualityRatingResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class RatingsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(RatingsApiVerticle.class);

    static final String GETQUALITYRATINGDETAILS_SERVICE_ID = "getQualityRatingDetails";
    static final String GETQUALITYRATINGS_SERVICE_ID = "getQualityRatings";
    
    final RatingsApi service;

    public RatingsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.RatingsApiImpl");
            service = (RatingsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("RatingsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getQualityRatingDetails
        vertx.eventBus().<JsonObject> consumer(GETQUALITYRATINGDETAILS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getQualityRatingDetails";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getQualityRatingDetails(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getQualityRatingDetails");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getQualityRatingDetails", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getQualityRatings
        vertx.eventBus().<JsonObject> consumer(GETQUALITYRATINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getQualityRatings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getQualityRatingRequestParam = message.body().getJsonObject("GetQualityRatingRequest");
                if (getQualityRatingRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQualityRatingRequest is required"), serviceId);
                    return;
                }
                GetQualityRatingRequest getQualityRatingRequest = Json.mapper.readValue(getQualityRatingRequestParam.encode(), GetQualityRatingRequest.class);
                service.getQualityRatings(businessId, getQualityRatingRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getQualityRatings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getQualityRatings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
