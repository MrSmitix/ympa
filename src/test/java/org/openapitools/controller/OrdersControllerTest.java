package org.openapitools.controller;

import org.openapitools.model.AcceptOrderCancellationRequest;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetOrderResponse;
import org.openapitools.model.GetOrdersResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.model.OrderBuyerType;
import org.openapitools.model.OrderDeliveryDispatchType;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import org.openapitools.model.SetOrderBoxLayoutRequest;
import org.openapitools.model.SetOrderBoxLayoutResponse;
import org.openapitools.model.SetOrderShipmentBoxesRequest;
import org.openapitools.model.SetOrderShipmentBoxesResponse;
import org.openapitools.model.UpdateOrderItemRequest;
import org.openapitools.model.UpdateOrderStatusRequest;
import org.openapitools.model.UpdateOrderStatusResponse;
import org.openapitools.model.UpdateOrderStatusesRequest;
import org.openapitools.model.UpdateOrderStatusesResponse;
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
 * API tests for OrdersController
 */
@MicronautTest
public class OrdersControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OrdersController controller;

    /**
     * This test is used to validate the implementation of acceptOrderCancellation() method
     *
     * The method should: Отмена заказа покупателем
     *
     * Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.  Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.  Если заказ уже передан службе доставки (принимает статус &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.  Чтобы узнать, какие заказы были отменены в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр &#x60;onlyWaitingForCancellationApprove&#x3D;true&#x60;. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.  Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.  |**⚙️ Лимит:** 500 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void acceptOrderCancellationMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        AcceptOrderCancellationRequest acceptOrderCancellationRequest = new AcceptOrderCancellationRequest(false);

        // when
        EmptyApiResponse result = controller.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/cancellation/accept' to the features of acceptOrderCancellation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void acceptOrderCancellationClientApiTest() throws IOException {
        // given
        AcceptOrderCancellationRequest body = new AcceptOrderCancellationRequest(false);
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@142409b4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOrder() method
     *
     * The method should: Информация об одном заказе
     *
     * Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderResponse result = controller.getOrder(campaignId, orderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}' to the features of getOrder() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@56ed0511");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOrderResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOrders() method
     *
     * The method should: Информация о нескольких заказах
     *
     * Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrdersMethodTest() {
        // given
        Long campaignId = 56L;
        List<Long> orderIds = Arrays.asList();
        Set<OrderStatusType> status = new HashSet<>();
        Set<OrderSubstatusType> substatus = new HashSet<>();
        LocalDate fromDate = LocalDate.of(2001, 2, 3);
        LocalDate toDate = LocalDate.of(2001, 2, 3);
        LocalDate supplierShipmentDateFrom = LocalDate.of(2001, 2, 3);
        LocalDate supplierShipmentDateTo = LocalDate.of(2001, 2, 3);
        OffsetDateTime updatedAtFrom = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime updatedAtTo = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OrderDeliveryDispatchType dispatchType = OrderDeliveryDispatchType.fromValue("UNKNOWN");
        Boolean fake = false;
        Boolean hasCis = false;
        Boolean onlyWaitingForCancellationApprove = false;
        Boolean onlyEstimatedDelivery = false;
        OrderBuyerType buyerType = OrderBuyerType.fromValue("PERSON");
        Integer page = 1;
        Integer pageSize = 56;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetOrdersResponse result = controller.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders' to the features of getOrders() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrdersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1d2c5d75");
        request.getParameters()
            .add("orderIds", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("status", String.valueOf(new HashSet<>())) // The query parameter format should be csv
            .add("substatus", String.valueOf(new HashSet<>())) // The query parameter format should be csv
            .add("fromDate", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("toDate", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("supplierShipmentDateFrom", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("supplierShipmentDateTo", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("updatedAtFrom", String.valueOf(OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00")))) // The query parameter format should be 
            .add("updatedAtTo", String.valueOf(OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00")))) // The query parameter format should be 
            .add("dispatchType", String.valueOf(OrderDeliveryDispatchType.fromValue("UNKNOWN"))) // The query parameter format should be 
            .add("fake", String.valueOf(false)) // The query parameter format should be 
            .add("hasCis", String.valueOf(false)) // The query parameter format should be 
            .add("onlyWaitingForCancellationApprove", String.valueOf(false)) // The query parameter format should be 
            .add("onlyEstimatedDelivery", String.valueOf(false)) // The query parameter format should be 
            .add("buyerType", String.valueOf(OrderBuyerType.fromValue("PERSON"))) // The query parameter format should be 
            .add("page", String.valueOf(1)) // The query parameter format should be 
            .add("pageSize", String.valueOf(56)) // The query parameter format should be 
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOrdersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of provideOrderDigitalCodes() method
     *
     * The method should: Передача ключей цифровых товаров
     *
     * Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус &#x60;DELIVERED&#x60;.  Ключ нужно передать в течение 30 минут после перехода заказа в статус &#x60;PROCESSING&#x60;.  Если в один заказ входят несколько ключей, передавайте их все в одном запросе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void provideOrderDigitalCodesMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest = new ProvideOrderDigitalCodesRequest(Arrays.asList());

        // when
        EmptyApiResponse result = controller.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods' to the features of provideOrderDigitalCodes() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void provideOrderDigitalCodesClientApiTest() throws IOException {
        // given
        ProvideOrderDigitalCodesRequest body = new ProvideOrderDigitalCodesRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@401835ac");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of provideOrderItemIdentifiers() method
     *
     * The method should: Передача кодов маркировки единиц товара
     *
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void provideOrderItemIdentifiersMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest = new ProvideOrderItemIdentifiersRequest(Arrays.asList());

        // when
        ProvideOrderItemIdentifiersResponse result = controller.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/identifiers' to the features of provideOrderItemIdentifiers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void provideOrderItemIdentifiersClientApiTest() throws IOException {
        // given
        ProvideOrderItemIdentifiersRequest body = new ProvideOrderItemIdentifiersRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/identifiers").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@4a3ebba6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProvideOrderItemIdentifiersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setOrderBoxLayout() method
     *
     * The method should: Подготовка заказа
     *
     * {% note tip \&quot;Подходит и для DBS\&quot; %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос &#x60;allowRemove: true&#x60;. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \&quot;Удаление нельзя отменить\&quot; %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий &#x60;OrderBoxLayoutItemDTO&#x60;. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле &#x60;fullCount&#x60;.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.  {% note info \&quot;Увеличить заказ нельзя\&quot; %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \&quot;Товар умещается в коробку\&quot; %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;fullCount\&quot;: 3,                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           },                           {                               \&quot;cis\&quot;: \&quot;010304109478gftJ14545762!\\u001dhGt264\&quot;                           },                           {                               \&quot;cis\&quot;: \&quot;010304109478fRs28323ks23!\\u001dhet201\&quot;                           }                       ]                   },                   {                       \&quot;id\&quot;: 654321,                       \&quot;fullCount\&quot;: 1                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  {% cut \&quot;Товар едет в разных коробках\&quot; %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  {% cut \&quot;Одинаковые товары, где каждый едет в нескольких коробках\&quot; %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderBoxLayoutMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        SetOrderBoxLayoutRequest setOrderBoxLayoutRequest = new SetOrderBoxLayoutRequest(Arrays.asList());

        // when
        SetOrderBoxLayoutResponse result = controller.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/boxes' to the features of setOrderBoxLayout() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderBoxLayoutClientApiTest() throws IOException {
        // given
        SetOrderBoxLayoutRequest body = new SetOrderBoxLayoutRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/boxes").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@35069061");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SetOrderBoxLayoutResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setOrderShipmentBoxes() method
     *
     * The method should: Передача количества грузовых мест в заказе
     *
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \&quot;Как было раньше\&quot; %}  Структура тела PUT-запроса:  &#x60;&#x60;&#x60; {   \&quot;boxes\&quot;:   [     {       \&quot;fulfilmentId\&quot;: \&quot;{string}\&quot;,       \&quot;weight\&quot;: {int64},       \&quot;width\&quot;: {int64},       \&quot;height\&quot;: {int64},       \&quot;depth\&quot;: {int64},       \&quot;items\&quot;:       [         {           \&quot;id\&quot;: {int64},           \&quot;count\&quot;: {int32}         },         ...       ]     },     ...   ] } &#x60;&#x60;&#x60; | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;boxes&#x60;       |           | Список грузовых мест.       |  **Параметры, вложенные в &#x60;boxes&#x60;** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;fulfilmentId&#x60;       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: &#x60;номер заказа на Маркете-номер грузового места&#x60;. Например, &#x60;7206821‑1, 7206821‑2&#x60; и т. д. | | &#x60;weight&#x60;       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | &#x60;width&#x60;       | Int64   | Ширина грузового места в сантиметрах.       | | &#x60;height&#x60;       | Int64   | Высота грузового места в сантиметрах.       | | &#x60;depth&#x60;       | Int64   | Глубина грузового места в сантиметрах.        | | &#x60;items&#x60;       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в &#x60;items&#x60;** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;id&#x60;       | Int64     | Идентификатор товара в рамках заказа.   | | &#x60;count&#x60;    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderShipmentBoxesMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long shipmentId = 56L;
        SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = new SetOrderShipmentBoxesRequest();

        // when
        SetOrderShipmentBoxesResponse result = controller.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes' to the features of setOrderShipmentBoxes() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setOrderShipmentBoxesClientApiTest() throws IOException {
        // given
        SetOrderShipmentBoxesRequest body = new SetOrderShipmentBoxesRequest();
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@34327638");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SetOrderShipmentBoxesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOrderItems() method
     *
     * The method should: Удаление товара из заказа или уменьшение числа единиц
     *
     * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60;. После передачи статуса &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте &#x60;count&#x60; параметра &#x60;item&#x60;.  Чтобы полностью удалить товар из заказа:  * передайте значение &#x60;0&#x60;; или * не передавайте параметр &#x60;item&#x60;.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.  {% note info \&quot;Увеличить заказ нельзя\&quot; %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус &#x60;SHIPPED&#x60;;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderItemsMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        UpdateOrderItemRequest updateOrderItemRequest = new UpdateOrderItemRequest(Arrays.asList());

        // when
        controller.updateOrderItems(campaignId, orderId, updateOrderItemRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/items' to the features of updateOrderItems() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderItemsClientApiTest() throws IOException {
        // given
        UpdateOrderItemRequest body = new UpdateOrderItemRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/items").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@6fc1a561");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOrderStatus() method
     *
     * The method should: Изменение статуса одного заказа
     *
     * Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этап обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60;. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStatusMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        UpdateOrderStatusRequest updateOrderStatusRequest = new UpdateOrderStatusRequest(null);

        // when
        UpdateOrderStatusResponse result = controller.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/status' to the features of updateOrderStatus() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStatusClientApiTest() throws IOException {
        // given
        UpdateOrderStatusRequest body = new UpdateOrderStatusRequest(null);
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/status").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@501dd0b4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateOrderStatusResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOrderStatuses() method
     *
     * The method should: Изменение статусов нескольких заказов
     *
     * Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60;и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этап обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60;. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStatusesMethodTest() {
        // given
        Long campaignId = 56L;
        UpdateOrderStatusesRequest updateOrderStatusesRequest = new UpdateOrderStatusesRequest(Arrays.asList());

        // when
        UpdateOrderStatusesResponse result = controller.updateOrderStatuses(campaignId, updateOrderStatusesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/status-update' to the features of updateOrderStatuses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOrderStatusesClientApiTest() throws IOException {
        // given
        UpdateOrderStatusesRequest body = new UpdateOrderStatusesRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/status-update").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5199d74e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateOrderStatusesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
