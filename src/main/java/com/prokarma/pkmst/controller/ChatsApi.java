/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.CreateChatRequest;
import com.prokarma.pkmst.model.CreateChatResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import java.io.File;
import com.prokarma.pkmst.model.GetChatHistoryRequest;
import com.prokarma.pkmst.model.GetChatHistoryResponse;
import com.prokarma.pkmst.model.GetChatsRequest;
import com.prokarma.pkmst.model.GetChatsResponse;
import com.prokarma.pkmst.model.SendMessageToChatRequest;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Api(value = "Chats", description = "the Chats API")
public interface ChatsApi {

    @ApiOperation(value = "Создание нового чата с покупателем", notes = "Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = CreateChatResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "chats","dbs","fbs","fby","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Все получилось: чат создан. ", response = CreateChatResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/businesses/{businessId}/chats/new",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CreateChatResponse> createChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,@ApiParam(value = "description" ,required=true )   @RequestBody CreateChatRequest createChatRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Получение истории сообщений в чате", notes = "Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetChatHistoryResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "chats","dbs","fbs","fby","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "История сообщений успешно получена. ", response = GetChatHistoryResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/businesses/{businessId}/chats/history",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GetChatHistoryResponse> getChatHistory(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,@ApiParam(value = "Идентификатор чата.", required = true)  @RequestParam(value = "chatId", required = true) Long chatId,@ApiParam(value = "description" ,required=true )   @RequestBody GetChatHistoryRequest getChatHistoryRequest,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,@ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Получение доступных чатов", notes = "Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| ", response = GetChatsResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "chats","dbs","fbs","fby","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список чатов. ", response = GetChatsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/businesses/{businessId}/chats",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GetChatsResponse> getChats(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,@ApiParam(value = "description" ,required=true )   @RequestBody GetChatsRequest getChatsRequest,@ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,@ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отправка файла в чат", notes = "Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "chats","dbs","fbs","fby","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ. Означает, что файл отправлен.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/businesses/{businessId}/chats/file/send",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<EmptyApiResponse> sendFileToChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,@ApiParam(value = "Идентификатор чата.", required = true)  @RequestParam(value = "chatId", required = true) Long chatId,@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отправка сообщения в чат", notes = "Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = EmptyApiResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "chats","dbs","fbs","fby","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Пустой ответ. Означает, что сообщение отправлено.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/businesses/{businessId}/chats/message",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<EmptyApiResponse> sendMessageToChat(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,@ApiParam(value = "Идентификатор чата.", required = true)  @RequestParam(value = "chatId", required = true) Long chatId,@ApiParam(value = "description" ,required=true )   @RequestBody SendMessageToChatRequest sendMessageToChatRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
