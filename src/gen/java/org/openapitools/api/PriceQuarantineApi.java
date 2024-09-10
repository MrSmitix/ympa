package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;

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
@Path("")
@Api(value = "/", description = "")
public interface PriceQuarantineApi  {

    /**
     * Удаление товара из карантина по цене в кабинете
     *
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     */
    @POST
    @Path("/businesses/{businessId}/price-quarantine/confirm")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Удаление товара из карантина по цене в кабинете", tags={ "price-quarantine", "dbs", "fby", "fbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ответ 200 обозначает, что цены подтверждены.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = ApiLockedErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse confirmBusinessPrices(@PathParam("businessId") Long businessId, @Valid @NotNull ConfirmPricesRequest confirmPricesRequest);

    /**
     * Удаление товара из карантина по цене в магазине
     *
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     */
    @POST
    @Path("/campaigns/{campaignId}/price-quarantine/confirm")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Удаление товара из карантина по цене в магазине", tags={ "price-quarantine", "dbs", "fby", "fbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ответ 200 обозначает, что цены подтверждены.", response = EmptyApiResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 423, message = "К ресурсу нельзя применить указанный метод.", response = ApiLockedErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public EmptyApiResponse confirmCampaignPrices(@PathParam("campaignId") Long campaignId, @Valid @NotNull ConfirmPricesRequest confirmPricesRequest);

    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     *
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     */
    @POST
    @Path("/businesses/{businessId}/price-quarantine")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Список товаров, находящихся в карантине по цене в кабинете", tags={ "price-quarantine", "dbs", "fby", "fbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список товаров в карантине.", response = GetQuarantineOffersResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetQuarantineOffersResponse getBusinessQuarantineOffers(@PathParam("businessId") Long businessId, @Valid @NotNull GetQuarantineOffersRequest getQuarantineOffersRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);

    /**
     * Список товаров, находящихся в карантине по цене в магазине
     *
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     */
    @POST
    @Path("/campaigns/{campaignId}/price-quarantine")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Список товаров, находящихся в карантине по цене в магазине", tags={ "price-quarantine", "dbs", "fby", "fbs", "express" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Список товаров в карантине.", response = GetQuarantineOffersResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public GetQuarantineOffersResponse getCampaignQuarantineOffers(@PathParam("campaignId") Long campaignId, @Valid @NotNull GetQuarantineOffersRequest getQuarantineOffersRequest, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit);
}
