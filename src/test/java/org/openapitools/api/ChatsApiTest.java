package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.SendMessageToChatRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ChatsApi
 */
@MicronautTest
public class ChatsApiTest {

    @Inject
    ChatsApi api;

    
    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void createChatTest() {
        // given
        Long businessId = 56L;
        CreateChatRequest createChatRequest = new CreateChatRequest(56L);

        // when
        CreateChatResponse body = api.createChat(businessId, createChatRequest).block();

        // then
        // TODO implement the createChatTest()
    }

    
    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getChatHistoryTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        GetChatHistoryRequest getChatHistoryRequest = new GetChatHistoryRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatHistoryResponse body = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit).block();

        // then
        // TODO implement the getChatHistoryTest()
    }

    
    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getChatsTest() {
        // given
        Long businessId = 56L;
        GetChatsRequest getChatsRequest = new GetChatsRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatsResponse body = api.getChats(businessId, getChatsRequest, pageToken, limit).block();

        // then
        // TODO implement the getChatsTest()
    }

    
    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void sendFileToChatTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        File _file = null;

        // when
        EmptyApiResponse body = api.sendFileToChat(businessId, chatId, _file).block();

        // then
        // TODO implement the sendFileToChatTest()
    }

    
    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void sendMessageToChatTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        SendMessageToChatRequest sendMessageToChatRequest = new SendMessageToChatRequest("example");

        // when
        EmptyApiResponse body = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest).block();

        // then
        // TODO implement the sendMessageToChatTest()
    }

    
}
