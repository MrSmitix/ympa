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
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCategoryContentParametersResponse;
import org.openapitools.server.api.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.api.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferContentRequest;
import org.openapitools.server.api.model.UpdateOfferContentResponse;

import java.util.List;
import java.util.Map;

public class ContentApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ContentApiVerticle.class);

    static final String GETCATEGORYCONTENTPARAMETERS_SERVICE_ID = "getCategoryContentParameters";
    static final String GETOFFERCARDSCONTENTSTATUS_SERVICE_ID = "getOfferCardsContentStatus";
    static final String UPDATEOFFERCONTENT_SERVICE_ID = "updateOfferContent";
    
    final ContentApi service;

    public ContentApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ContentApiImpl");
            service = (ContentApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ContentApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getCategoryContentParameters
        vertx.eventBus().<JsonObject> consumer(GETCATEGORYCONTENTPARAMETERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoryContentParameters";
                String categoryIdParam = message.body().getString("categoryId");
                if(categoryIdParam == null) {
                    manageError(message, new MainApiException(400, "categoryId is required"), serviceId);
                    return;
                }
                Long categoryId = Json.mapper.readValue(categoryIdParam, Long.class);
                service.getCategoryContentParameters(categoryId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoryContentParameters");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoryContentParameters", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferCardsContentStatus
        vertx.eventBus().<JsonObject> consumer(GETOFFERCARDSCONTENTSTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferCardsContentStatus";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getOfferCardsContentStatusRequestParam = message.body().getJsonObject("GetOfferCardsContentStatusRequest");
                if (getOfferCardsContentStatusRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferCardsContentStatusRequest is required"), serviceId);
                    return;
                }
                GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = Json.mapper.readValue(getOfferCardsContentStatusRequestParam.encode(), GetOfferCardsContentStatusRequest.class);
                service.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferCardsContentStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferCardsContentStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferContent
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERCONTENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferContent";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateOfferContentRequestParam = message.body().getJsonObject("UpdateOfferContentRequest");
                if (updateOfferContentRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferContentRequest is required"), serviceId);
                    return;
                }
                UpdateOfferContentRequest updateOfferContentRequest = Json.mapper.readValue(updateOfferContentRequestParam.encode(), UpdateOfferContentRequest.class);
                service.updateOfferContent(businessId, updateOfferContentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferContent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferContent", e);
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
