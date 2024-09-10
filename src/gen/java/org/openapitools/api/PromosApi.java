package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;

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
@Path("/businesses/{businessId}/promos")
@Api(value = "/", description = "")
public interface PromosApi  {

    /**
     * Удаление товаров из акции
     *
     * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/offers/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Удаление товаров из акции", tags={ "promos", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Результат удаления товаров из акции.", response = DeletePromoOffersResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public DeletePromoOffersResponse deletePromoOffers(@PathParam("businessId") Long businessId, @Valid DeletePromoOffersRequest deletePromoOffersRequest);

    /**
     * Получение списка товаров, которые участвуют или могут участвовать в акции
     *
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/offers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Получение списка товаров, которые участвуют или могут участвовать в акции", tags={ "promos", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список товаров, которые участвуют или могут участвовать в акции.", response = GetPromoOffersResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetPromoOffersResponse getPromoOffers(@PathParam("businessId") Long businessId, @Valid GetPromoOffersRequest getPromoOffersRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);

    /**
     * Получение списка акций
     *
     * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Получение списка акций", tags={ "promos", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список акций Маркета.", response = GetPromosResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetPromosResponse getPromos(@PathParam("businessId") Long businessId, @Valid GetPromosRequest getPromosRequest);

    /**
     * Добавление товаров в акцию или изменение их цен
     *
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/offers/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Добавление товаров в акцию или изменение их цен", tags={ "promos", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Результат добавления товаров в акцию или обновления их цен.", response = UpdatePromoOffersResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public UpdatePromoOffersResponse updatePromoOffers(@PathParam("businessId") Long businessId, @Valid UpdatePromoOffersRequest updatePromoOffersRequest);
}
