/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// GetCategoryContentParametersResponse - Ответ со списком характеристик для категории и их допустимыми значениями.
type GetCategoryContentParametersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CategoryContentParametersDto `json:"result,omitempty"`
}
