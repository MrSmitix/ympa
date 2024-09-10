/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.CreateChatRequest;
import org.openapitools.client.model.CreateChatResponse;
import org.openapitools.client.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.client.model.GetChatHistoryRequest;
import org.openapitools.client.model.GetChatHistoryResponse;
import org.openapitools.client.model.GetChatsRequest;
import org.openapitools.client.model.GetChatsResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapitools.client.model.SendMessageToChatRequest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Партнерский API Маркета Test
 *
 * API tests for ChatsApi
 */
public class ChatsApiTest {

    private static ChatsApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(ChatsApi.class);
    }

    
    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChatTest() throws Exception {
        //CreateChatResponse response = client.createChat(businessId, createChatRequest);
        //assertNotNull(response);
    }
    
    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChatHistoryTest() throws Exception {
        //GetChatHistoryResponse response = client.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit);
        //assertNotNull(response);
    }
    
    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChatsTest() throws Exception {
        //GetChatsResponse response = client.getChats(businessId, getChatsRequest, pageToken, limit);
        //assertNotNull(response);
    }
    
    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendFileToChatTest() throws Exception {
        //EmptyApiResponse response = client.sendFileToChat(businessId, chatId, _file);
        //assertNotNull(response);
    }
    
    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMessageToChatTest() throws Exception {
        //EmptyApiResponse response = client.sendMessageToChat(businessId, chatId, sendMessageToChatRequest);
        //assertNotNull(response);
    }
    
}
