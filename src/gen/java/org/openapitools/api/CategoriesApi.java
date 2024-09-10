package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;

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
@Path("/categories")
@Api(value = "/", description = "")
public interface CategoriesApi  {

    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/max-sale-quantum")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Лимит на установку кванта продажи и минимального количества товаров в заказе", tags={ "categories", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Лимит на установку кванта и минимального количества товаров.", response = GetCategoriesMaxSaleQuantumResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(@Valid @NotNull GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest);

    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     */
    @POST
    @Path("/tree")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Дерево категорий", tags={ "categories", "fby", "fbs", "dbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Категории Маркета.", response = GetCategoriesResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetCategoriesResponse getCategoriesTree(@Valid GetCategoriesRequest getCategoriesRequest);
}
