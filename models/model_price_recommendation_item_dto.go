package models

// PriceRecommendationItemDto - Рекомендованная цена.
type PriceRecommendationItemDto struct {

	// Идентификатор кампании.
	CampaignId int64 `json:"campaignId"`

	// Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
	Price float32 `json:"price"`
}
