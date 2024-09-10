#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/confirm_shipment_request.h"
#include "../model/empty_api_response.h"
#include "../model/get_shipment_orders_info_response.h"
#include "../model/get_shipment_response.h"
#include "../model/search_shipments_request.h"
#include "../model/search_shipments_response.h"
#include "../model/set_shipment_pallets_count_request.h"
#include "../model/shipment_pallet_label_page_format_type.h"
#include "../model/transfer_orders_from_shipment_request.h"

// Enum  for ShipmentsAPI_downloadShipmentPalletLabels
typedef enum  { _api__downloadShipmentPalletLabels__NULL = 0, _api__downloadShipmentPalletLabels__A4, _api__downloadShipmentPalletLabels__A8 } _api__downloadShipmentPalletLabels_format_e;


// Подтверждение отгрузки
//
// Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_confirmShipment(apiClient_t *apiClient, long campaignId, long shipmentId, confirm_shipment_request_t *confirm_shipment_request);


// Получение акта приема-передачи
//
// {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentAct(apiClient_t *apiClient, long campaignId, long shipmentId);


// Получение акта расхождений
//
// Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentDiscrepancyAct(apiClient_t *apiClient, long campaignId, long shipmentId);


// Получение фактического акта приема-передачи
//
// Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentInboundAct(apiClient_t *apiClient, long campaignId, long shipmentId);


// Ярлыки для доверительной приемки (FBS)
//
// PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentPalletLabels(apiClient_t *apiClient, long campaignId, long shipmentId, shipment_pallet_label_page_format_type_e format);


// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
//
// Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentReceptionTransferAct(apiClient_t *apiClient, long campaignId, int *warehouse_id);


// Получение транспортной накладной
//
// Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
binary_t**
ShipmentsAPI_downloadShipmentTransportationWaybill(apiClient_t *apiClient, long campaignId, long shipmentId);


// Получение информации об одной отгрузке
//
// Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_shipment_response_t*
ShipmentsAPI_getShipment(apiClient_t *apiClient, long campaignId, long shipmentId, int *cancelledOrders);


// Получение информации о возможности печати ярлыков (FBS)
//
// Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_shipment_orders_info_response_t*
ShipmentsAPI_getShipmentOrdersInfo(apiClient_t *apiClient, long campaignId, long shipmentId);


// Получение информации о нескольких отгрузках
//
// Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
search_shipments_response_t*
ShipmentsAPI_searchShipments(apiClient_t *apiClient, long campaignId, search_shipments_request_t *search_shipments_request, char *page_token, int *limit);


// Передача количества упаковок в отгрузке
//
// Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_setShipmentPalletsCount(apiClient_t *apiClient, long campaignId, long shipmentId, set_shipment_pallets_count_request_t *set_shipment_pallets_count_request);


// Перенос заказов в следующую отгрузку
//
// Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
//
empty_api_response_t*
ShipmentsAPI_transferOrdersFromShipment(apiClient_t *apiClient, long campaignId, long shipmentId, transfer_orders_from_shipment_request_t *transfer_orders_from_shipment_request);


