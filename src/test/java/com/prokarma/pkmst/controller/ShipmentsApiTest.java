/*
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


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.ConfirmShipmentRequest;
import com.prokarma.pkmst.model.EmptyApiResponse;
import java.io.File;
import com.prokarma.pkmst.model.GetShipmentOrdersInfoResponse;
import com.prokarma.pkmst.model.GetShipmentResponse;
import com.prokarma.pkmst.model.SearchShipmentsRequest;
import com.prokarma.pkmst.model.SearchShipmentsResponse;
import com.prokarma.pkmst.model.SetShipmentPalletsCountRequest;
import com.prokarma.pkmst.model.ShipmentPalletLabelPageFormatType;
import com.prokarma.pkmst.model.TransferOrdersFromShipmentRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for ShipmentsApi
 */
@Ignore
public class ShipmentsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final ShipmentsApi api = new ShipmentsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Подтверждение отгрузки
     *
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void confirmShipmentTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
        ConfirmShipmentRequest confirmShipmentRequest = null;
    ResponseEntity<EmptyApiResponse> response = api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Получение акта приема-передачи
     *
     * {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentActTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
    ResponseEntity<File> response = api.downloadShipmentAct(campaignId, shipmentId , accept);

        // TODO: test validations
    }
    
    /**
     * Получение акта расхождений
     *
     * Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentDiscrepancyActTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
    ResponseEntity<File> response = api.downloadShipmentDiscrepancyAct(campaignId, shipmentId , accept);

        // TODO: test validations
    }
    
    /**
     * Получение фактического акта приема-передачи
     *
     * Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentInboundActTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
    ResponseEntity<File> response = api.downloadShipmentInboundAct(campaignId, shipmentId , accept);

        // TODO: test validations
    }
    
    /**
     * Ярлыки для доверительной приемки (FBS)
     *
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentPalletLabelsTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
        ShipmentPalletLabelPageFormatType format = null;
    ResponseEntity<File> response = api.downloadShipmentPalletLabels(campaignId, shipmentId, format , accept);

        // TODO: test validations
    }
    
    /**
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentReceptionTransferActTest() throws Exception {
        Long campaignId = null;
        Integer warehouseId = null;
    ResponseEntity<File> response = api.downloadShipmentReceptionTransferAct(campaignId, warehouseId , accept);

        // TODO: test validations
    }
    
    /**
     * Получение транспортной накладной
     *
     * Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadShipmentTransportationWaybillTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
    ResponseEntity<File> response = api.downloadShipmentTransportationWaybill(campaignId, shipmentId , accept);

        // TODO: test validations
    }
    
    /**
     * Получение информации об одной отгрузке
     *
     * Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getShipmentTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
        Boolean cancelledOrders = null;
    ResponseEntity<GetShipmentResponse> response = api.getShipment(campaignId, shipmentId, cancelledOrders , accept);

        // TODO: test validations
    }
    
    /**
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getShipmentOrdersInfoTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
    ResponseEntity<GetShipmentOrdersInfoResponse> response = api.getShipmentOrdersInfo(campaignId, shipmentId , accept);

        // TODO: test validations
    }
    
    /**
     * Получение информации о нескольких отгрузках
     *
     * Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchShipmentsTest() throws Exception {
        Long campaignId = null;
        SearchShipmentsRequest searchShipmentsRequest = null;
        String pageToken = null;
        Integer limit = null;
    ResponseEntity<SearchShipmentsResponse> response = api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit , accept);

        // TODO: test validations
    }
    
    /**
     * Передача количества упаковок в отгрузке
     *
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setShipmentPalletsCountTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
        SetShipmentPalletsCountRequest setShipmentPalletsCountRequest = null;
    ResponseEntity<EmptyApiResponse> response = api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Перенос заказов в следующую отгрузку
     *
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void transferOrdersFromShipmentTest() throws Exception {
        Long campaignId = null;
        Long shipmentId = null;
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = null;
    ResponseEntity<EmptyApiResponse> response = api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest , accept);

        // TODO: test validations
    }
    
}