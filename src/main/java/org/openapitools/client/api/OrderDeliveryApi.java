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
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.EmptyApiResponse;
import org.openapitools.client.model.GetOrderBuyerInfoResponse;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.SetOrderDeliveryDateRequest;
import org.openapitools.client.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.client.model.UpdateOrderStorageLimitRequest;
import org.openapitools.client.model.VerifyOrderEacRequest;
import org.openapitools.client.model.VerifyOrderEacResponse;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/campaigns/{campaignId}/orders/{orderId}")
public interface OrderDeliveryApi  {

    /**
     * Информация о покупателе — физическом лице
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @GET
    @Path("/buyer")
    @Produces({ "application/json" })
    GetOrderBuyerInfoResponse getOrderBuyerInfo(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId) throws ApiException, ProcessingException;

    /**
     * Изменение даты доставки заказа
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @PUT
    @Path("/delivery/date")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse setOrderDeliveryDate(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest) throws ApiException, ProcessingException;

    /**
     * Передача трек‑номера посылки
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @POST
    @Path("/delivery/track")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse setOrderDeliveryTrackCode(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest) throws ApiException, ProcessingException;

    /**
     * Продление срока хранения заказа
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @PUT
    @Path("/delivery/storage-limit")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    EmptyApiResponse updateOrderStorageLimit(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest) throws ApiException, ProcessingException;

    /**
     * Передача кода подтверждения
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @PUT
    @Path("/verifyEac")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    VerifyOrderEacResponse verifyOrderEac(@PathParam("campaignId") Long campaignId, @PathParam("orderId") Long orderId, VerifyOrderEacRequest verifyOrderEacRequest) throws ApiException, ProcessingException;
}