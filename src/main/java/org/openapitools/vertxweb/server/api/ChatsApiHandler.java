package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CreateChatRequest;
import org.openapitools.vertxweb.server.model.CreateChatResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetChatHistoryRequest;
import org.openapitools.vertxweb.server.model.GetChatHistoryResponse;
import org.openapitools.vertxweb.server.model.GetChatsRequest;
import org.openapitools.vertxweb.server.model.GetChatsResponse;
import org.openapitools.vertxweb.server.model.SendMessageToChatRequest;

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

public class ChatsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ChatsApiHandler.class);

    private final ChatsApi api;

    public ChatsApiHandler(ChatsApi api) {
        this.api = api;
    }

    @Deprecated
    public ChatsApiHandler() {
        this(new ChatsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createChat").handler(this::createChat);
        builder.operation("getChatHistory").handler(this::getChatHistory);
        builder.operation("getChats").handler(this::getChats);
        builder.operation("sendFileToChat").handler(this::sendFileToChat);
        builder.operation("sendMessageToChat").handler(this::sendMessageToChat);
    }

    private void createChat(RoutingContext routingContext) {
        logger.info("createChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        CreateChatRequest createChatRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateChatRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter createChatRequest is {}", createChatRequest);

        api.createChat(businessId, createChatRequest)
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

    private void getChatHistory(RoutingContext routingContext) {
        logger.info("getChatHistory()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetChatHistoryRequest getChatHistoryRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetChatHistoryRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter getChatHistoryRequest is {}", getChatHistoryRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
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

    private void getChats(RoutingContext routingContext) {
        logger.info("getChats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetChatsRequest getChatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetChatsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getChatsRequest is {}", getChatsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getChats(businessId, getChatsRequest, pageToken, limit)
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

    private void sendFileToChat(RoutingContext routingContext) {
        logger.info("sendFileToChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter _file is {}", _file);

        api.sendFileToChat(businessId, chatId, _file)
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

    private void sendMessageToChat(RoutingContext routingContext) {
        logger.info("sendMessageToChat()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        Long chatId = requestParameters.queryParameter("chatId") != null ? requestParameters.queryParameter("chatId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SendMessageToChatRequest sendMessageToChatRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SendMessageToChatRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter chatId is {}", chatId);
        logger.debug("Parameter sendMessageToChatRequest is {}", sendMessageToChatRequest);

        api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
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
