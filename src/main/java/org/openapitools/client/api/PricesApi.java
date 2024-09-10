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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiLockedErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.EmptyApiResponse;
import org.openapitools.client.model.GetPricesByOfferIdsRequest;
import org.openapitools.client.model.GetPricesByOfferIdsResponse;
import org.openapitools.client.model.GetPricesResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapitools.client.model.SuggestPricesRequest;
import org.openapitools.client.model.SuggestPricesResponse;
import org.openapitools.client.model.UpdateBusinessPricesRequest;
import org.openapitools.client.model.UpdatePricesRequest;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface PricesApi  {

    /**
     * Список цен
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/campaigns/{campaignId}/offer-prices")
    @Produces({ "application/json" })
    GetPricesResponse getPrices(@PathParam("campaignId") Long campaignId, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit, @QueryParam("archived") @DefaultValue("false") Boolean archived) throws ApiException, ProcessingException;

    /**
     * Просмотр цен на указанные товары в магазине
     * Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
     */
    @POST
    @Path("/campaigns/{campaignId}/offer-prices")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    GetPricesByOfferIdsResponse getPricesByOfferIds(@PathParam("campaignId") Long campaignId, @QueryParam("page_token") String pageToken, @QueryParam("limit") Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest) throws ApiException, ProcessingException;

    /**
     * Цены для продвижения товаров
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     * @deprecated
     */
    @Deprecated
    @POST
    @Path("/campaigns/{campaignId}/offer-prices/suggestions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    SuggestPricesResponse getSuggestedPrices(@PathParam("campaignId") Long campaignId, SuggestPricesRequest suggestPricesRequest) throws ApiException, ProcessingException;

    /**
     * Установка цен на товары во всех магазинах
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @POST
    @Path("/businesses/{businessId}/offer-prices/updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse updateBusinessPrices(@PathParam("businessId") Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest) throws ApiException, ProcessingException;

    /**
     * Установка цен на товары в конкретном магазине
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @POST
    @Path("/campaigns/{campaignId}/offer-prices/updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse updatePrices(@PathParam("campaignId") Long campaignId, UpdatePricesRequest updatePricesRequest) throws ApiException, ProcessingException;
}
