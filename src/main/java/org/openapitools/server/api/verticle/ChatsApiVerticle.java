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
import org.openapitools.server.api.model.CreateChatRequest;
import org.openapitools.server.api.model.CreateChatResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.api.model.GetChatHistoryRequest;
import org.openapitools.server.api.model.GetChatHistoryResponse;
import org.openapitools.server.api.model.GetChatsRequest;
import org.openapitools.server.api.model.GetChatsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SendMessageToChatRequest;

import java.util.List;
import java.util.Map;

public class ChatsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ChatsApiVerticle.class);

    static final String CREATECHAT_SERVICE_ID = "createChat";
    static final String GETCHATHISTORY_SERVICE_ID = "getChatHistory";
    static final String GETCHATS_SERVICE_ID = "getChats";
    static final String SENDFILETOCHAT_SERVICE_ID = "sendFileToChat";
    static final String SENDMESSAGETOCHAT_SERVICE_ID = "sendMessageToChat";
    
    final ChatsApi service;

    public ChatsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ChatsApiImpl");
            service = (ChatsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ChatsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createChat
        vertx.eventBus().<JsonObject> consumer(CREATECHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject createChatRequestParam = message.body().getJsonObject("CreateChatRequest");
                if (createChatRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateChatRequest is required"), serviceId);
                    return;
                }
                CreateChatRequest createChatRequest = Json.mapper.readValue(createChatRequestParam.encode(), CreateChatRequest.class);
                service.createChat(businessId, createChatRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createChat", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getChatHistory
        vertx.eventBus().<JsonObject> consumer(GETCHATHISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getChatHistory";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                JsonObject getChatHistoryRequestParam = message.body().getJsonObject("GetChatHistoryRequest");
                if (getChatHistoryRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetChatHistoryRequest is required"), serviceId);
                    return;
                }
                GetChatHistoryRequest getChatHistoryRequest = Json.mapper.readValue(getChatHistoryRequestParam.encode(), GetChatHistoryRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getChatHistory");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getChatHistory", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getChats
        vertx.eventBus().<JsonObject> consumer(GETCHATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getChats";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getChatsRequestParam = message.body().getJsonObject("GetChatsRequest");
                if (getChatsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetChatsRequest is required"), serviceId);
                    return;
                }
                GetChatsRequest getChatsRequest = Json.mapper.readValue(getChatsRequestParam.encode(), GetChatsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getChats(businessId, getChatsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getChats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getChats", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for sendFileToChat
        vertx.eventBus().<JsonObject> consumer(SENDFILETOCHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sendFileToChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                String _fileParam = message.body().getString("file");
                if(_fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File _file = Json.mapper.readValue(_fileParam, File.class);
                service.sendFileToChat(businessId, chatId, _file, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sendFileToChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sendFileToChat", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for sendMessageToChat
        vertx.eventBus().<JsonObject> consumer(SENDMESSAGETOCHAT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sendMessageToChat";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String chatIdParam = message.body().getString("chatId");
                if(chatIdParam == null) {
                    manageError(message, new MainApiException(400, "chatId is required"), serviceId);
                    return;
                }
                Long chatId = Json.mapper.readValue(chatIdParam, Long.class);
                JsonObject sendMessageToChatRequestParam = message.body().getJsonObject("SendMessageToChatRequest");
                if (sendMessageToChatRequestParam == null) {
                    manageError(message, new MainApiException(400, "SendMessageToChatRequest is required"), serviceId);
                    return;
                }
                SendMessageToChatRequest sendMessageToChatRequest = Json.mapper.readValue(sendMessageToChatRequestParam.encode(), SendMessageToChatRequest.class);
                service.sendMessageToChat(businessId, chatId, sendMessageToChatRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sendMessageToChat");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sendMessageToChat", e);
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
