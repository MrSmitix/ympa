/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server
// ShipmentActionType : Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
type ShipmentActionType string

// List of ShipmentActionType
const (
	CONFIRM ShipmentActionType = "CONFIRM"
	DOWNLOAD_ACT ShipmentActionType = "DOWNLOAD_ACT"
	DOWNLOAD_INBOUND_ACT ShipmentActionType = "DOWNLOAD_INBOUND_ACT"
	DOWNLOAD_DISCREPANCY_ACT ShipmentActionType = "DOWNLOAD_DISCREPANCY_ACT"
	CHANGE_PALLETS_COUNT ShipmentActionType = "CHANGE_PALLETS_COUNT"
)
