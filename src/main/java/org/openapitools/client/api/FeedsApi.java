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
import org.openapitools.client.model.FeedIndexLogsStatusType;
import org.openapitools.client.model.GetFeedIndexLogsResponse;
import org.openapitools.client.model.GetFeedResponse;
import org.openapitools.client.model.GetFeedsResponse;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.client.model.SetFeedParamsRequest;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/campaigns/{campaignId}/feeds")
public interface FeedsApi  {

    /**
     * Информация о прайс-листе
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/{feedId}")
    @Produces({ "application/json" })
    GetFeedResponse getFeed(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId) throws ApiException, ProcessingException;

    /**
     * Отчет по индексации прайс-листа
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     * @deprecated
     */
    @Deprecated
    @GET
    @Path("/{feedId}/index-logs")
    @Produces({ "application/json" })
    GetFeedIndexLogsResponse getFeedIndexLogs(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId, @QueryParam("limit") Integer limit, @QueryParam("published_time_from") OffsetDateTime publishedTimeFrom, @QueryParam("published_time_to") OffsetDateTime publishedTimeTo, @QueryParam("status") FeedIndexLogsStatusType status) throws ApiException, ProcessingException;

    /**
     * Список прайс-листов магазина
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     * @deprecated
     */
    @Deprecated
    @GET
    
    @Produces({ "application/json" })
    GetFeedsResponse getFeeds(@PathParam("campaignId") Long campaignId) throws ApiException, ProcessingException;

    /**
     * Сообщить, что прайс-лист обновился
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * @deprecated
     */
    @Deprecated
    @POST
    @Path("/{feedId}/refresh")
    @Produces({ "application/json" })
    EmptyApiResponse refreshFeed(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId) throws ApiException, ProcessingException;

    /**
     * Изменение параметров прайс-листа
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     * @deprecated
     */
    @Deprecated
    @POST
    @Path("/{feedId}/params")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse setFeedParams(@PathParam("campaignId") Long campaignId, @PathParam("feedId") Long feedId, SetFeedParamsRequest setFeedParamsRequest) throws ApiException, ProcessingException;
}
