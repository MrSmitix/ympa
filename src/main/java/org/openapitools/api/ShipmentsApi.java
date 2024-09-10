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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
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
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Client("${openapi-micronaut-client-base-path}")
public interface ShipmentsApi {
    /**
     * Подтверждение отгрузки
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @param confirmShipmentRequest  (optional)
     * @return EmptyApiResponse
     */
    @Post(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<EmptyApiResponse> confirmShipment(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId, 
        @Body @Nullable @Valid ConfirmShipmentRequest confirmShipmentRequest
    );

    /**
     * Получение акта приема-передачи
     * {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act")
    @Consumes({"application/pdf", "application/json"})
    Mono<File> downloadShipmentAct(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId
    );

    /**
     * Получение акта расхождений
     * Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act")
    @Consumes({"application/vnd.ms-excel", "application/json"})
    Mono<File> downloadShipmentDiscrepancyAct(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId
    );

    /**
     * Получение фактического акта приема-передачи
     * Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act")
    @Consumes({"application/pdf", "application/json"})
    Mono<File> downloadShipmentInboundAct(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId
    );

    /**
     * Ярлыки для доверительной приемки (FBS)
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @param _format Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  (optional, default to A8)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels")
    @Consumes({"application/pdf", "application/json"})
    Mono<File> downloadShipmentPalletLabels(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId, 
        @QueryValue(value="format", defaultValue="A8") @Nullable ShipmentPalletLabelPageFormatType _format
    );

    /**
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param warehouseId Идентификатор склада. (optional)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/shipments/reception-transfer-act")
    @Consumes({"application/pdf", "application/json"})
    Mono<File> downloadShipmentReceptionTransferAct(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @QueryValue(value="warehouse_id") @Nullable Integer warehouseId
    );

    /**
     * Получение транспортной накладной
     * Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @return File
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill")
    @Consumes({"application/vnd.ms-excel", "application/json"})
    Mono<File> downloadShipmentTransportationWaybill(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId
    );

    /**
     * Получение информации об одной отгрузке
     * Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  (optional, default to true)
     * @return GetShipmentResponse
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}")
    @Consumes({"application/json"})
    Mono<GetShipmentResponse> getShipment(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId, 
        @QueryValue(value="cancelledOrders", defaultValue="true") @Nullable Boolean cancelledOrders
    );

    /**
     * Получение информации о возможности печати ярлыков (FBS)
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @return GetShipmentOrdersInfoResponse
     */
    @Get(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info")
    @Consumes({"application/json"})
    Mono<GetShipmentOrdersInfoResponse> getShipmentOrdersInfo(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId
    );

    /**
     * Получение информации о нескольких отгрузках
     * Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param searchShipmentsRequest  (required)
     * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
     * @param limit Количество значений на одной странице.  (optional)
     * @return SearchShipmentsResponse
     */
    @Put(uri="/campaigns/{campaignId}/first-mile/shipments")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<SearchShipmentsResponse> searchShipments(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @Body @NotNull @Valid SearchShipmentsRequest searchShipmentsRequest, 
        @QueryValue(value="page_token") @Nullable String pageToken, 
        @QueryValue(value="limit") @Nullable Integer limit
    );

    /**
     * Передача количества упаковок в отгрузке
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @param setShipmentPalletsCountRequest  (required)
     * @return EmptyApiResponse
     */
    @Put(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<EmptyApiResponse> setShipmentPalletsCount(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId, 
        @Body @NotNull @Valid SetShipmentPalletsCountRequest setShipmentPalletsCountRequest
    );

    /**
     * Перенос заказов в следующую отгрузку
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param shipmentId Идентификатор отгрузки. (required)
     * @param transferOrdersFromShipmentRequest  (required)
     * @return EmptyApiResponse
     */
    @Post(uri="/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<EmptyApiResponse> transferOrdersFromShipment(
        @PathVariable(name="campaignId") @NotNull Long campaignId, 
        @PathVariable(name="shipmentId") @NotNull Long shipmentId, 
        @Body @NotNull @Valid TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest
    );

}
