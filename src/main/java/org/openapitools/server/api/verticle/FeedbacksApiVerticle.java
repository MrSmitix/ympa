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
import org.openapitools.server.api.model.GetFeedbackListResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class FeedbacksApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(FeedbacksApiVerticle.class);

    static final String GETFEEDBACKANDCOMMENTUPDATES_SERVICE_ID = "getFeedbackAndCommentUpdates";
    
    final FeedbacksApi service;

    public FeedbacksApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FeedbacksApiImpl");
            service = (FeedbacksApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FeedbacksApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getFeedbackAndCommentUpdates
        vertx.eventBus().<JsonObject> consumer(GETFEEDBACKANDCOMMENTUPDATES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeedbackAndCommentUpdates";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String fromDateParam = message.body().getString("from_date");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                service.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeedbackAndCommentUpdates");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeedbackAndCommentUpdates", e);
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
