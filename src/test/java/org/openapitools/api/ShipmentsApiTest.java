package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ConfirmShipmentRequest;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetShipmentOrdersInfoResponse;
import org.openapitools.model.GetShipmentResponse;
import org.openapitools.model.SearchShipmentsRequest;
import org.openapitools.model.SearchShipmentsResponse;
import org.openapitools.model.SetShipmentPalletsCountRequest;
import org.openapitools.model.ShipmentPalletLabelPageFormatType;
import org.openapitools.model.TransferOrdersFromShipmentRequest;
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
 * API tests for ShipmentsApi
 */
@MicronautTest
public class ShipmentsApiTest {

    @Inject
    ShipmentsApi api;

    
    /**
     * Подтверждение отгрузки
     *
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void confirmShipmentTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        ConfirmShipmentRequest confirmShipmentRequest = new ConfirmShipmentRequest();

        // when
        EmptyApiResponse body = api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest).block();

        // then
        // TODO implement the confirmShipmentTest()
    }

    
    /**
     * Получение акта приема-передачи
     *
     * {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentActTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        File body = api.downloadShipmentAct(campaignId, shipmentId).block();

        // then
        // TODO implement the downloadShipmentActTest()
    }

    
    /**
     * Получение акта расхождений
     *
     * Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentDiscrepancyActTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        File body = api.downloadShipmentDiscrepancyAct(campaignId, shipmentId).block();

        // then
        // TODO implement the downloadShipmentDiscrepancyActTest()
    }

    
    /**
     * Получение фактического акта приема-передачи
     *
     * Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentInboundActTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        File body = api.downloadShipmentInboundAct(campaignId, shipmentId).block();

        // then
        // TODO implement the downloadShipmentInboundActTest()
    }

    
    /**
     * Ярлыки для доверительной приемки (FBS)
     *
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentPalletLabelsTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        ShipmentPalletLabelPageFormatType _format = ShipmentPalletLabelPageFormatType.fromValue("A8");

        // when
        File body = api.downloadShipmentPalletLabels(campaignId, shipmentId, _format).block();

        // then
        // TODO implement the downloadShipmentPalletLabelsTest()
    }

    
    /**
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentReceptionTransferActTest() {
        // given
        Long campaignId = 56L;
        Integer warehouseId = 123123;

        // when
        File body = api.downloadShipmentReceptionTransferAct(campaignId, warehouseId).block();

        // then
        // TODO implement the downloadShipmentReceptionTransferActTest()
    }

    
    /**
     * Получение транспортной накладной
     *
     * Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadShipmentTransportationWaybillTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        File body = api.downloadShipmentTransportationWaybill(campaignId, shipmentId).block();

        // then
        // TODO implement the downloadShipmentTransportationWaybillTest()
    }

    
    /**
     * Получение информации об одной отгрузке
     *
     * Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getShipmentTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        Boolean cancelledOrders = true;

        // when
        GetShipmentResponse body = api.getShipment(campaignId, shipmentId, cancelledOrders).block();

        // then
        // TODO implement the getShipmentTest()
    }

    
    /**
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getShipmentOrdersInfoTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;

        // when
        GetShipmentOrdersInfoResponse body = api.getShipmentOrdersInfo(campaignId, shipmentId).block();

        // then
        // TODO implement the getShipmentOrdersInfoTest()
    }

    
    /**
     * Получение информации о нескольких отгрузках
     *
     * Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchShipmentsTest() {
        // given
        Long campaignId = 56L;
        SearchShipmentsRequest searchShipmentsRequest = new SearchShipmentsRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        SearchShipmentsResponse body = api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit).block();

        // then
        // TODO implement the searchShipmentsTest()
    }

    
    /**
     * Передача количества упаковок в отгрузке
     *
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setShipmentPalletsCountTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = new SetShipmentPalletsCountRequest(56);

        // when
        EmptyApiResponse body = api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest).block();

        // then
        // TODO implement the setShipmentPalletsCountTest()
    }

    
    /**
     * Перенос заказов в следующую отгрузку
     *
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void transferOrdersFromShipmentTest() {
        // given
        Long campaignId = 56L;
        Long shipmentId = 56L;
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = new TransferOrdersFromShipmentRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest).block();

        // then
        // TODO implement the transferOrdersFromShipmentTest()
    }

    
}
