package org.openapitools.server.api.verticle;

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

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ChatsApi  {
    //createChat
    void createChat(Long businessId, CreateChatRequest createChatRequest, Handler<AsyncResult<CreateChatResponse>> handler);

    //getChatHistory
    void getChatHistory(Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit, Handler<AsyncResult<GetChatHistoryResponse>> handler);

    //getChats
    void getChats(Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetChatsResponse>> handler);

    //sendFileToChat
    void sendFileToChat(Long businessId, Long chatId, File _file, Handler<AsyncResult<EmptyApiResponse>> handler);

    //sendMessageToChat
    void sendMessageToChat(Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

}
