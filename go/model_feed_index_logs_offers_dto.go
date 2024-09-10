/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// FeedIndexLogsOffersDto - Информация о предложениях прайс-листа.
type FeedIndexLogsOffersDto struct {

	// Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	RejectedCount int64 `json:"rejectedCount,omitempty"`

	// Количество предложений в прайс-листе.
	TotalCount int64 `json:"totalCount,omitempty"`
}
