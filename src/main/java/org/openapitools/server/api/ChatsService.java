package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.CreateChatRequest;
import org.openapitools.server.model.CreateChatResponse;
import org.openapitools.server.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.model.GetChatHistoryRequest;
import org.openapitools.server.model.GetChatHistoryResponse;
import org.openapitools.server.model.GetChatsRequest;
import org.openapitools.server.model.GetChatsResponse;
import java.util.HexFormat;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import org.openapitools.server.model.SendMessageToChatRequest;
import io.helidon.http.Status;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Chats'",
                             version = "7.8.0")
public interface ChatsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/new", this::createChat);
        rules.post("/history", this::getChatHistory);
        rules.post("/", this::getChats);
        rules.post("/file/send", this::sendFileToChat);
        rules.post("/message", this::sendMessageToChat);
    }


    /**
     * POST /businesses/{businessId}/chats/new : Создание нового чата с покупателем.
     *
     * @param request the server request
     * @param response the server response
     */
    void createChat(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/history : Получение истории сообщений в чате.
     *
     * @param request the server request
     * @param response the server response
     */
    void getChatHistory(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats : Получение доступных чатов.
     *
     * @param request the server request
     * @param response the server response
     */
    void getChats(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/file/send : Отправка файла в чат.
     *
     * @param request the server request
     * @param response the server response
     */
    void sendFileToChat(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{businessId}/chats/message : Отправка сообщения в чат.
     *
     * @param request the server request
     * @param response the server response
     */
    void sendMessageToChat(ServerRequest request, ServerResponse response);
}
