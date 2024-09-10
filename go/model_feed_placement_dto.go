/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// FeedPlacementDto - Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
type FeedPlacementDto struct {

	Status FeedStatusType `json:"status,omitempty"`

	// Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
	TotalOffersCount int32 `json:"totalOffersCount,omitempty"`
}
