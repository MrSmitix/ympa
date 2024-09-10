package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for OrderDeliveryController
 */
@MicronautTest
public class OrderDeliveryControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OrderDeliveryController controller;

    /**
     * This test is used to validate the implementation of getOrderBuyerInfo() method
     *
     * The method should: Информация о покупателе — физическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBuyerInfoMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderBuyerInfoResponse result = controller.getOrderBuyerInfo(campaignId, orderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/buyer' to the features of getOrderBuyerInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderBuyerInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/buyer").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@d1a17cc");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOrderBuyerInfoResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setOrderDeliveryDate() method
     *
     * The method should: Изменение даты доставки заказа
     *
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderDeliveryDateMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        SetOrderDeliveryDateRequest setOrderDeliveryDateRequest = new SetOrderDeliveryDateRequest(null, org.openapitools.model.OrderDeliveryDateReasonType.fromValue("USER_MOVED_DELIVERY_DATES"));

        // when
        EmptyApiResponse result = controller.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/date' to the features of setOrderDeliveryDate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderDeliveryDateClientApiTest() throws IOException {
        // given
        SetOrderDeliveryDateRequest body = new SetOrderDeliveryDateRequest(null, org.openapitools.model.OrderDeliveryDateReasonType.fromValue("USER_MOVED_DELIVERY_DATES"));
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/date").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@71fd650b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setOrderDeliveryTrackCode() method
     *
     * The method should: Передача трек‑номера посылки
     *
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderDeliveryTrackCodeMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest = new SetOrderDeliveryTrackCodeRequest("example", 56L);

        // when
        EmptyApiResponse result = controller.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/track' to the features of setOrderDeliveryTrackCode() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderDeliveryTrackCodeClientApiTest() throws IOException {
        // given
        SetOrderDeliveryTrackCodeRequest body = new SetOrderDeliveryTrackCodeRequest("example", 56L);
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/track").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6a9f41ff");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOrderStorageLimit() method
     *
     * The method should: Продление срока хранения заказа
     *
     * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStorageLimitMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = new UpdateOrderStorageLimitRequest(LocalDate.of(2001, 2, 3));

        // when
        EmptyApiResponse result = controller.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit' to the features of updateOrderStorageLimit() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStorageLimitClientApiTest() throws IOException {
        // given
        UpdateOrderStorageLimitRequest body = new UpdateOrderStorageLimitRequest(LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@ad92442");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of verifyOrderEac() method
     *
     * The method should: Передача кода подтверждения
     *
     * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void verifyOrderEacMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        VerifyOrderEacRequest verifyOrderEacRequest = new VerifyOrderEacRequest();

        // when
        VerifyOrderEacResponse result = controller.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/verifyEac' to the features of verifyOrderEac() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void verifyOrderEacClientApiTest() throws IOException {
        // given
        VerifyOrderEacRequest body = new VerifyOrderEacRequest();
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/verifyEac").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@57a0f6a2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VerifyOrderEacResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
