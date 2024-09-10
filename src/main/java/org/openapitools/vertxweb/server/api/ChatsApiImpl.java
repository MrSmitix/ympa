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

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ChatsApiImpl implements ChatsApi {
    public Future<ApiResponse<CreateChatResponse>> createChat(Long businessId, CreateChatRequest createChatRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetChatHistoryResponse>> getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetChatsResponse>> getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> sendFileToChat(Long businessId, Long chatId, FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
