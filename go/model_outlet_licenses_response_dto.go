/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OutletLicensesResponseDto - Ответ на запрос информации о лицензиях для точек продаж.
type OutletLicensesResponseDto struct {

	// Список лицензий.
	Licenses []FullOutletLicenseDto `json:"licenses"`
}
