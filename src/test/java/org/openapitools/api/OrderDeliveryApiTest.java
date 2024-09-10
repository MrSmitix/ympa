package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetOrderBuyerInfoResponse;
import org.openapitools.model.SetOrderDeliveryDateRequest;
import org.openapitools.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.model.UpdateOrderStorageLimitRequest;
import org.openapitools.model.VerifyOrderEacRequest;
import org.openapitools.model.VerifyOrderEacResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for OrderDeliveryApi
 */
@MicronautTest
public class OrderDeliveryApiTest {

    @Inject
    OrderDeliveryApi api;

    
    /**
     * Информация о покупателе — физическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderBuyerInfoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderBuyerInfoResponse body = api.getOrderBuyerInfo(campaignId, orderId).block();

        // then
        // TODO implement the getOrderBuyerInfoTest()
    }

    
    /**
     * Изменение даты доставки заказа
     *
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setOrderDeliveryDateTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        SetOrderDeliveryDateRequest setOrderDeliveryDateRequest = new SetOrderDeliveryDateRequest(null, org.openapitools.model.OrderDeliveryDateReasonType.fromValue("USER_MOVED_DELIVERY_DATES"));

        // when
        EmptyApiResponse body = api.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest).block();

        // then
        // TODO implement the setOrderDeliveryDateTest()
    }

    
    /**
     * Передача трек‑номера посылки
     *
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setOrderDeliveryTrackCodeTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest = new SetOrderDeliveryTrackCodeRequest("example", 56L);

        // when
        EmptyApiResponse body = api.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest).block();

        // then
        // TODO implement the setOrderDeliveryTrackCodeTest()
    }

    
    /**
     * Продление срока хранения заказа
     *
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOrderStorageLimitTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = new UpdateOrderStorageLimitRequest(LocalDate.of(2001, 2, 3));

        // when
        EmptyApiResponse body = api.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest).block();

        // then
        // TODO implement the updateOrderStorageLimitTest()
    }

    
    /**
     * Передача кода подтверждения
     *
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void verifyOrderEacTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        VerifyOrderEacRequest verifyOrderEacRequest = new VerifyOrderEacRequest();

        // when
        VerifyOrderEacResponse body = api.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest).block();

        // then
        // TODO implement the verifyOrderEacTest()
    }

    
}
