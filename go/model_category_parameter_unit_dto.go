/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// CategoryParameterUnitDto - Единицы измерения характеристики товара.
type CategoryParameterUnitDto struct {

	// Единица измерения по умолчанию.
	DefaultUnitId int64 `json:"defaultUnitId"`

	// Допустимые единицы измерения.
	Units []UnitDto `json:"units"`
}
