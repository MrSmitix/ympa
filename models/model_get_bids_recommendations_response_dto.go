package models

// GetBidsRecommendationsResponseDto - Список товаров с рекомендованными ставками.
type GetBidsRecommendationsResponseDto struct {

	// Список товаров с рекомендованными ставками.
	Recommendations []SkuBidRecommendationItemDto `json:"recommendations"`
}
