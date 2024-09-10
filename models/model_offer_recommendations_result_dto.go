package models

// OfferRecommendationsResultDto - Список товаров с рекомендациями.
type OfferRecommendationsResultDto struct {

	Paging ScrollingPagerDto `json:"paging,omitempty"`

	// Страница списка товаров.
	OfferRecommendations []OfferRecommendationDto `json:"offerRecommendations"`
}
