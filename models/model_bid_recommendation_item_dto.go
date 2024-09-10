package models

// BidRecommendationItemDto - Рекомендованная ставка и возможная доля показов.
type BidRecommendationItemDto struct {

	// Значение ставки.
	Bid int32 `json:"bid"`

	// Доля показов. 
	ShowPercent int64 `json:"showPercent"`
}
