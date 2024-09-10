/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OrderStatusChangeDto - Заказ.
type OrderStatusChangeDto struct {

	Status OrderStatusType `json:"status"`

	Substatus OrderSubstatusType `json:"substatus,omitempty"`

	Delivery OrderStatusChangeDeliveryDto `json:"delivery,omitempty"`
}
