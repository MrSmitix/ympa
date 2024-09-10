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

public final class ChatsApiException extends MainApiException {
    public ChatsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ChatsApiException Chats_createChat_200_Exception = new ChatsApiException(200, "Все получилось: чат создан. ");
    public static final ChatsApiException Chats_createChat_400_Exception = new ChatsApiException(400, "Запрос содержит неправильные данные.");
    public static final ChatsApiException Chats_createChat_401_Exception = new ChatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ChatsApiException Chats_createChat_403_Exception = new ChatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ChatsApiException Chats_createChat_404_Exception = new ChatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ChatsApiException Chats_createChat_420_Exception = new ChatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ChatsApiException Chats_createChat_500_Exception = new ChatsApiException(500, "Внутренняя ошибка сервера.");
    public static final ChatsApiException Chats_getChatHistory_200_Exception = new ChatsApiException(200, "История сообщений успешно получена. ");
    public static final ChatsApiException Chats_getChatHistory_400_Exception = new ChatsApiException(400, "Запрос содержит неправильные данные.");
    public static final ChatsApiException Chats_getChatHistory_401_Exception = new ChatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ChatsApiException Chats_getChatHistory_403_Exception = new ChatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ChatsApiException Chats_getChatHistory_404_Exception = new ChatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ChatsApiException Chats_getChatHistory_420_Exception = new ChatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ChatsApiException Chats_getChatHistory_500_Exception = new ChatsApiException(500, "Внутренняя ошибка сервера.");
    public static final ChatsApiException Chats_getChats_200_Exception = new ChatsApiException(200, "Список чатов. ");
    public static final ChatsApiException Chats_getChats_400_Exception = new ChatsApiException(400, "Запрос содержит неправильные данные.");
    public static final ChatsApiException Chats_getChats_401_Exception = new ChatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ChatsApiException Chats_getChats_403_Exception = new ChatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ChatsApiException Chats_getChats_404_Exception = new ChatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ChatsApiException Chats_getChats_420_Exception = new ChatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ChatsApiException Chats_getChats_500_Exception = new ChatsApiException(500, "Внутренняя ошибка сервера.");
    public static final ChatsApiException Chats_sendFileToChat_200_Exception = new ChatsApiException(200, "Пустой ответ. Означает, что файл отправлен.");
    public static final ChatsApiException Chats_sendFileToChat_400_Exception = new ChatsApiException(400, "Запрос содержит неправильные данные.");
    public static final ChatsApiException Chats_sendFileToChat_401_Exception = new ChatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ChatsApiException Chats_sendFileToChat_403_Exception = new ChatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ChatsApiException Chats_sendFileToChat_404_Exception = new ChatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ChatsApiException Chats_sendFileToChat_420_Exception = new ChatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ChatsApiException Chats_sendFileToChat_500_Exception = new ChatsApiException(500, "Внутренняя ошибка сервера.");
    public static final ChatsApiException Chats_sendMessageToChat_200_Exception = new ChatsApiException(200, "Пустой ответ. Означает, что сообщение отправлено.");
    public static final ChatsApiException Chats_sendMessageToChat_400_Exception = new ChatsApiException(400, "Запрос содержит неправильные данные.");
    public static final ChatsApiException Chats_sendMessageToChat_401_Exception = new ChatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ChatsApiException Chats_sendMessageToChat_403_Exception = new ChatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ChatsApiException Chats_sendMessageToChat_404_Exception = new ChatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ChatsApiException Chats_sendMessageToChat_420_Exception = new ChatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ChatsApiException Chats_sendMessageToChat_500_Exception = new ChatsApiException(500, "Внутренняя ошибка сервера.");
    

}