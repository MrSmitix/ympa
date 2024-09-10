/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// OfferRecommendationsResultDto - Список товаров с рекомендациями.
type OfferRecommendationsResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Страница списка товаров.
	OfferRecommendations []OfferRecommendationDto `json:"offerRecommendations"`
}
