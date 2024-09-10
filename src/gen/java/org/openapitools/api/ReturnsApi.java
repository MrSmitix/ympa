package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetReturnResponse;
import org.openapitools.model.GetReturnsResponse;
import org.joda.time.LocalDate;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SetReturnDecisionRequest;

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
@Path("/campaigns/{campaignId}")
@Api(value = "/", description = "")
public interface ReturnsApi  {

    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/orders/{orderId}/returns/{returnId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Информация о невыкупе или возврате", tags={ "returns", "fbs", "dbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Детали возврата.", response = GetReturnResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetReturnResponse getReturn(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, @PathParam("returnId") Long returnId);

    /**
     * Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/orders/{orderId}/returns/{returnId}/application")
    @Produces({ "application/octet-stream", "application/json" })
    @ApiOperation(value = "Получение заявления на возврат", tags={ "returns", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Заявление на возврат.", response = File.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public File getReturnApplication(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, @PathParam("returnId") Long returnId);

    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")
    @Produces({ "application/octet-stream", "application/json" })
    @ApiOperation(value = "Получение фотографии возврата", tags={ "returns", "fbs", "dbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Фотография возврата.", response = File.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public File getReturnPhoto(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, @PathParam("returnId") Long returnId, @PathParam("itemId") Long itemId, @PathParam("imageHash") String imageHash);

    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @GET
    @Path("/returns")
    @Produces({ "application/json" })
    @ApiOperation(value = "Список невыкупов и возвратов", tags={ "returns", "fbs", "dbs", "express", "fby" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Постраничные возвраты партнера.", response = GetReturnsResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetReturnsResponse getReturns(@PathParam("campaignId") Long campaignId, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit, @QueryParam("orderIds") @Size(max=50) List<Long> orderIds, @QueryParam("statuses") List<RefundStatusType> statuses, @QueryParam("type") ReturnType type, @QueryParam("fromDate") LocalDate fromDate, @QueryParam("toDate") LocalDate toDate, @QueryParam("from_date") LocalDate fromDate2, @QueryParam("to_date") LocalDate toDate2);

    /**
     * Принятие или изменение решения по возврату
     *
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/orders/{orderId}/returns/{returnId}/decision")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Принятие или изменение решения по возврату", tags={ "returns", "dbs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Детали возврата.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse setReturnDecision(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, @PathParam("returnId") Long returnId, @Valid @NotNull SetReturnDecisionRequest setReturnDecisionRequest);

    /**
     * Подтверждение решения по возврату
     *
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/orders/{orderId}/returns/{returnId}/decision/submit")
    @Produces({ "application/json" })
    @ApiOperation(value = "Подтверждение решения по возврату", tags={ "returns", "dbs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Статус выполнения операции.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse submitReturnDecision(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, @PathParam("returnId") Long returnId);
}
