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
import org.openapitools.server.model.SendMessageToChatRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;


import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */

@RegisterProvider(ApiExceptionMapper.class)
@Path("/businesses/{businessId}/chats")
public interface ChatsApi  {

    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/new")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    CreateChatResponse createChat(@PathParam("businessId") Long businessId, CreateChatRequest createChatRequest) throws ApiException, ProcessingException;

    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    GetChatHistoryResponse getChatHistory(@PathParam("businessId") Long businessId, @QueryParam("chatId") Long chatId, GetChatHistoryRequest getChatHistoryRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit) throws ApiException, ProcessingException;

    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    GetChatsResponse getChats(@PathParam("businessId") Long businessId, GetChatsRequest getChatsRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit) throws ApiException, ProcessingException;

    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/file/send")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    EmptyApiResponse sendFileToChat(@PathParam("businessId") Long businessId, @QueryParam("chatId") Long chatId,  @Multipart(value = "file" ) Attachment _fileDetail) throws ApiException, ProcessingException;

    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/message")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse sendMessageToChat(@PathParam("businessId") Long businessId, @QueryParam("chatId") Long chatId, SendMessageToChatRequest sendMessageToChatRequest) throws ApiException, ProcessingException;
}
