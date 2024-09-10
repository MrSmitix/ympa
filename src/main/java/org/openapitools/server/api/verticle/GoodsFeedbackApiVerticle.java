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
import org.openapitools.server.api.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentResponse;

import java.util.List;
import java.util.Map;

public class GoodsFeedbackApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(GoodsFeedbackApiVerticle.class);

    static final String DELETEGOODSFEEDBACKCOMMENT_SERVICE_ID = "deleteGoodsFeedbackComment";
    static final String GETGOODSFEEDBACKCOMMENTS_SERVICE_ID = "getGoodsFeedbackComments";
    static final String GETGOODSFEEDBACKS_SERVICE_ID = "getGoodsFeedbacks";
    static final String SKIPGOODSFEEDBACKSREACTION_SERVICE_ID = "skipGoodsFeedbacksReaction";
    static final String UPDATEGOODSFEEDBACKCOMMENT_SERVICE_ID = "updateGoodsFeedbackComment";
    
    final GoodsFeedbackApi service;

    public GoodsFeedbackApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.GoodsFeedbackApiImpl");
            service = (GoodsFeedbackApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GoodsFeedbackApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteGoodsFeedbackComment
        vertx.eventBus().<JsonObject> consumer(DELETEGOODSFEEDBACKCOMMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteGoodsFeedbackComment";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteGoodsFeedbackCommentRequestParam = message.body().getJsonObject("DeleteGoodsFeedbackCommentRequest");
                if (deleteGoodsFeedbackCommentRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteGoodsFeedbackCommentRequest is required"), serviceId);
                    return;
                }
                DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = Json.mapper.readValue(deleteGoodsFeedbackCommentRequestParam.encode(), DeleteGoodsFeedbackCommentRequest.class);
                service.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteGoodsFeedbackComment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteGoodsFeedbackComment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getGoodsFeedbackComments
        vertx.eventBus().<JsonObject> consumer(GETGOODSFEEDBACKCOMMENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsFeedbackComments";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getGoodsFeedbackCommentsRequestParam = message.body().getJsonObject("GetGoodsFeedbackCommentsRequest");
                if (getGoodsFeedbackCommentsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsFeedbackCommentsRequest is required"), serviceId);
                    return;
                }
                GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = Json.mapper.readValue(getGoodsFeedbackCommentsRequestParam.encode(), GetGoodsFeedbackCommentsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsFeedbackComments");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsFeedbackComments", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getGoodsFeedbacks
        vertx.eventBus().<JsonObject> consumer(GETGOODSFEEDBACKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsFeedbacks";
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
                JsonObject getGoodsFeedbackRequestParam = message.body().getJsonObject("GetGoodsFeedbackRequest");
                if (getGoodsFeedbackRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsFeedbackRequest is required"), serviceId);
                    return;
                }
                GetGoodsFeedbackRequest getGoodsFeedbackRequest = Json.mapper.readValue(getGoodsFeedbackRequestParam.encode(), GetGoodsFeedbackRequest.class);
                service.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsFeedbacks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsFeedbacks", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for skipGoodsFeedbacksReaction
        vertx.eventBus().<JsonObject> consumer(SKIPGOODSFEEDBACKSREACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "skipGoodsFeedbacksReaction";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject skipGoodsFeedbackReactionRequestParam = message.body().getJsonObject("SkipGoodsFeedbackReactionRequest");
                if (skipGoodsFeedbackReactionRequestParam == null) {
                    manageError(message, new MainApiException(400, "SkipGoodsFeedbackReactionRequest is required"), serviceId);
                    return;
                }
                SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = Json.mapper.readValue(skipGoodsFeedbackReactionRequestParam.encode(), SkipGoodsFeedbackReactionRequest.class);
                service.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "skipGoodsFeedbacksReaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("skipGoodsFeedbacksReaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateGoodsFeedbackComment
        vertx.eventBus().<JsonObject> consumer(UPDATEGOODSFEEDBACKCOMMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateGoodsFeedbackComment";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateGoodsFeedbackCommentRequestParam = message.body().getJsonObject("UpdateGoodsFeedbackCommentRequest");
                if (updateGoodsFeedbackCommentRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateGoodsFeedbackCommentRequest is required"), serviceId);
                    return;
                }
                UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = Json.mapper.readValue(updateGoodsFeedbackCommentRequestParam.encode(), UpdateGoodsFeedbackCommentRequest.class);
                service.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateGoodsFeedbackComment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateGoodsFeedbackComment", e);
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
