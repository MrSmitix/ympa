/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// ModelDto - Модель товара.
type ModelDto struct {

	// Идентификатор модели товара.
	Id int64 `json:"id,omitempty"`

	// Название модели товара.
	Name string `json:"name,omitempty"`

	Prices ModelPriceDto `json:"prices,omitempty"`
}
