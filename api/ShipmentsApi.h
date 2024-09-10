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
/*
 * ShipmentsApi.h
 *
 * 
 */

#ifndef ShipmentsApi_H_
#define ShipmentsApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "ConfirmShipmentRequest.h"
#include "EmptyApiResponse.h"
#include "GetShipmentOrdersInfoResponse.h"
#include "GetShipmentResponse.h"
#include "SearchShipmentsRequest.h"
#include "SearchShipmentsResponse.h"
#include "SetShipmentPalletsCountRequest.h"
#include "ShipmentPalletLabelPageFormatType.h"
#include "TransferOrdersFromShipmentRequest.h"
#include <string>

namespace org::openapitools::server::api
{

class  ShipmentsApi : public ApiBase {
public:
    explicit ShipmentsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~ShipmentsApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void confirm_shipment_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_act_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_discrepancy_act_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_inbound_act_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_pallet_labels_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_reception_transfer_act_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void download_shipment_transportation_waybill_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_shipment_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_shipment_orders_info_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void search_shipments_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void set_shipment_pallets_count_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void transfer_orders_from_shipment_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void shipments_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Подтверждение отгрузки
    /// </summary>
    /// <remarks>
    /// Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    /// <param name="confirmShipmentRequest"> (optional)</param>
    virtual void confirm_shipment(const int64_t &campaignId, const int64_t &shipmentId, const org::openapitools::server::model::ConfirmShipmentRequest &confirmShipmentRequest, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение акта приема-передачи
    /// </summary>
    /// <remarks>
    /// {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    virtual void download_shipment_act(const int64_t &campaignId, const int64_t &shipmentId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение акта расхождений
    /// </summary>
    /// <remarks>
    /// Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    virtual void download_shipment_discrepancy_act(const int64_t &campaignId, const int64_t &shipmentId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение фактического акта приема-передачи
    /// </summary>
    /// <remarks>
    /// Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    virtual void download_shipment_inbound_act(const int64_t &campaignId, const int64_t &shipmentId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Ярлыки для доверительной приемки (FBS)
    /// </summary>
    /// <remarks>
    /// PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    /// <param name="format">Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  (optional, default to std::make_shared&lt;ShipmentPalletLabelPageFormatType&gt;())</param>
    virtual void download_shipment_pallet_labels(const int64_t &campaignId, const int64_t &shipmentId, const std::optional<org::openapitools::server::model::ShipmentPalletLabelPageFormatType> &format, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    /// </summary>
    /// <remarks>
    /// Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \&quot;Экспресс‑доставка\&quot; %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \&quot;Данные, из которых Маркет формирует акт\&quot; %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="warehouseId">Идентификатор склада. (optional, default to 0)</param>
    virtual void download_shipment_reception_transfer_act(const int64_t &campaignId, const std::optional<int32_t> &warehouseId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение транспортной накладной
    /// </summary>
    /// <remarks>
    /// Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    virtual void download_shipment_transportation_waybill(const int64_t &campaignId, const int64_t &shipmentId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение информации об одной отгрузке
    /// </summary>
    /// <remarks>
    /// Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    /// <param name="cancelledOrders">Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  (optional, default to true)</param>
    virtual void get_shipment(const int64_t &campaignId, const int64_t &shipmentId, const std::optional<bool> &cancelledOrders, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение информации о возможности печати ярлыков (FBS)
    /// </summary>
    /// <remarks>
    /// Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    virtual void get_shipment_orders_info(const int64_t &campaignId, const int64_t &shipmentId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Получение информации о нескольких отгрузках
    /// </summary>
    /// <remarks>
    /// Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="searchShipmentsRequest"></param>
    /// <param name="pageToken">Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional, default to &quot;&quot;)</param>
    /// <param name="limit">Количество значений на одной странице.  (optional, default to 0)</param>
    virtual void search_shipments(const int64_t &campaignId, const org::openapitools::server::model::SearchShipmentsRequest &searchShipmentsRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Передача количества упаковок в отгрузке
    /// </summary>
    /// <remarks>
    /// Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    /// <param name="setShipmentPalletsCountRequest"></param>
    virtual void set_shipment_pallets_count(const int64_t &campaignId, const int64_t &shipmentId, const org::openapitools::server::model::SetShipmentPalletsCountRequest &setShipmentPalletsCountRequest, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Перенос заказов в следующую отгрузку
    /// </summary>
    /// <remarks>
    /// Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \&quot;Такие переносы снижают индекс качества магазина\&quot; %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="shipmentId">Идентификатор отгрузки.</param>
    /// <param name="transferOrdersFromShipmentRequest"></param>
    virtual void transfer_orders_from_shipment(const int64_t &campaignId, const int64_t &shipmentId, const org::openapitools::server::model::TransferOrdersFromShipmentRequest &transferOrdersFromShipmentRequest, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* ShipmentsApi_H_ */

