package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.ConfirmShipmentRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetShipmentOrdersInfoResponse;
import org.openapitools.model.GetShipmentResponse;
import org.openapitools.model.SearchShipmentsRequest;
import org.openapitools.model.SearchShipmentsResponse;
import org.openapitools.model.SetShipmentPalletsCountRequest;
import org.openapitools.model.ShipmentPalletLabelPageFormatType;
import org.openapitools.model.TransferOrdersFromShipmentRequest;
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
 * API tests for ShipmentsController
 */
@MicronautTest
public class ShipmentsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ShipmentsController controller;

    /**
     * This test is used to validate the implementation of confirmShipment() method
     *
     * The method should: Подтверждение отгрузки
     *
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmShipmentMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        ConfirmShipmentRequest confirmShipmentRequest = new ConfirmShipmentRequest();

        // when
        EmptyApiResponse result = controller.confirmShipment(campaignId, shipmentId, confirmShipmentRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm' to the features of confirmShipment() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmShipmentClientApiTest() throws IOException {
        // given
        ConfirmShipmentRequest body = new ConfirmShipmentRequest();
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2b152527");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentAct() method
     *
     * The method should: Получение акта приема-передачи
     *
     * {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentActMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        CompletedFileUpload result = controller.downloadShipmentAct(campaignId, shipmentId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act' to the features of downloadShipmentAct() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentActClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5f2cccc0")
            .accept("[Ljava.lang.String;@5f2cccc0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentDiscrepancyAct() method
     *
     * The method should: Получение акта расхождений
     *
     * Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentDiscrepancyActMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        CompletedFileUpload result = controller.downloadShipmentDiscrepancyAct(campaignId, shipmentId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act' to the features of downloadShipmentDiscrepancyAct() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentDiscrepancyActClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4738db0f")
            .accept("[Ljava.lang.String;@4738db0f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentInboundAct() method
     *
     * The method should: Получение фактического акта приема-передачи
     *
     * Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentInboundActMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        CompletedFileUpload result = controller.downloadShipmentInboundAct(campaignId, shipmentId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act' to the features of downloadShipmentInboundAct() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentInboundActClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7e4b55e4")
            .accept("[Ljava.lang.String;@7e4b55e4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentPalletLabels() method
     *
     * The method should: Ярлыки для доверительной приемки (FBS)
     *
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentPalletLabelsMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        ShipmentPalletLabelPageFormatType _format = ShipmentPalletLabelPageFormatType.fromValue("A8");

        // when
        CompletedFileUpload result = controller.downloadShipmentPalletLabels(campaignId, shipmentId, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels' to the features of downloadShipmentPalletLabels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentPalletLabelsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@324cc34d")
            .accept("[Ljava.lang.String;@324cc34d");
        request.getParameters()
            .add("format", String.valueOf(ShipmentPalletLabelPageFormatType.fromValue("A8"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentReceptionTransferAct() method
     *
     * The method should: Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentReceptionTransferActMethodTest() {
        // given
        Long campaignId = 56L;
        Integer warehouseId = 123123;

        // when
        CompletedFileUpload result = controller.downloadShipmentReceptionTransferAct(campaignId, warehouseId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/shipments/reception-transfer-act' to the features of downloadShipmentReceptionTransferAct() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentReceptionTransferActClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/shipments/reception-transfer-act").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@40ac1dcb")
            .accept("[Ljava.lang.String;@40ac1dcb");
        request.getParameters()
            .add("warehouse_id", String.valueOf(123123)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadShipmentTransportationWaybill() method
     *
     * The method should: Получение транспортной накладной
     *
     * Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentTransportationWaybillMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        CompletedFileUpload result = controller.downloadShipmentTransportationWaybill(campaignId, shipmentId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill' to the features of downloadShipmentTransportationWaybill() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadShipmentTransportationWaybillClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@41cd4672")
            .accept("[Ljava.lang.String;@41cd4672");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getShipment() method
     *
     * The method should: Получение информации об одной отгрузке
     *
     * Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getShipmentMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        Boolean cancelledOrders = true;

        // when
        GetShipmentResponse result = controller.getShipment(campaignId, shipmentId, cancelledOrders).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}' to the features of getShipment() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getShipmentClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@650ddfda");
        request.getParameters()
            .add("cancelledOrders", String.valueOf(true)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetShipmentResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getShipmentOrdersInfo() method
     *
     * The method should: Получение информации о возможности печати ярлыков (FBS)
     *
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getShipmentOrdersInfoMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        GetShipmentOrdersInfoResponse result = controller.getShipmentOrdersInfo(campaignId, shipmentId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info' to the features of getShipmentOrdersInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getShipmentOrdersInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@318f2e9d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetShipmentOrdersInfoResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of searchShipments() method
     *
     * The method should: Получение информации о нескольких отгрузках
     *
     * Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void searchShipmentsMethodTest() {
        // given
        Long campaignId = 56L;
        SearchShipmentsRequest searchShipmentsRequest = new SearchShipmentsRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        SearchShipmentsResponse result = controller.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments' to the features of searchShipments() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void searchShipmentsClientApiTest() throws IOException {
        // given
        SearchShipmentsRequest body = new SearchShipmentsRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@116d3f22");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SearchShipmentsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setShipmentPalletsCount() method
     *
     * The method should: Передача количества упаковок в отгрузке
     *
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setShipmentPalletsCountMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = new SetShipmentPalletsCountRequest(56);

        // when
        EmptyApiResponse result = controller.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets' to the features of setShipmentPalletsCount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setShipmentPalletsCountClientApiTest() throws IOException {
        // given
        SetShipmentPalletsCountRequest body = new SetShipmentPalletsCountRequest(56);
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@3ab815ab");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of transferOrdersFromShipment() method
     *
     * The method should: Перенос заказов в следующую отгрузку
     *
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void transferOrdersFromShipmentMethodTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = new TransferOrdersFromShipmentRequest(Arrays.asList());

        // when
        EmptyApiResponse result = controller.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer' to the features of transferOrdersFromShipment() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void transferOrdersFromShipmentClientApiTest() throws IOException {
        // given
        TransferOrdersFromShipmentRequest body = new TransferOrdersFromShipmentRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("shipmentId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3140ee29");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
