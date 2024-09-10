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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
@Path("/businesses/{businessId}/chats")
@Api(value = "/", description = "")
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
    @ApiOperation(value = "Создание нового чата с покупателем", tags={ "chats", "dbs", "fbs", "fby", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Все получилось: чат создан. ", response = CreateChatResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public CreateChatResponse createChat(@PathParam("businessId") Long businessId, @Valid CreateChatRequest createChatRequest);

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
    @ApiOperation(value = "Получение истории сообщений в чате", tags={ "chats", "dbs", "fbs", "fby", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "История сообщений успешно получена. ", response = GetChatHistoryResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetChatHistoryResponse getChatHistory(@PathParam("businessId") Long businessId, @QueryParam("chatId") @NotNull Long chatId, @Valid GetChatHistoryRequest getChatHistoryRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);

    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Получение доступных чатов", tags={ "chats", "dbs", "fbs", "fby", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список чатов. ", response = GetChatsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetChatsResponse getChats(@PathParam("businessId") Long businessId, @Valid GetChatsRequest getChatsRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);

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
    @ApiOperation(value = "Отправка файла в чат", tags={ "chats", "dbs", "fbs", "fby", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ. Означает, что файл отправлен.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse sendFileToChat(@PathParam("businessId") Long businessId, @QueryParam("chatId") @NotNull Long chatId,  @Multipart(value = "file" ) Attachment _fileDetail);

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
    @ApiOperation(value = "Отправка сообщения в чат", tags={ "chats", "dbs", "fbs", "fby", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ. Означает, что сообщение отправлено.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse sendMessageToChat(@PathParam("businessId") Long businessId, @QueryParam("chatId") @NotNull Long chatId, @Valid SendMessageToChatRequest sendMessageToChatRequest);
}
