/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// DeliveryServiceDto - Служба доставки.
type DeliveryServiceDto struct {

	// Идентификатор службы доставки.
	Id int64 `json:"id,omitempty"`

	// Наименование службы доставки.
	Name string `json:"name,omitempty"`
}
