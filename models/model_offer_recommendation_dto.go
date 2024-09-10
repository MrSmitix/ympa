package models

// OfferRecommendationDto - Информация о состоянии цен и рекомендации. 
type OfferRecommendationDto struct {

	Offer OfferForRecommendationDto `json:"offer,omitempty"`

	Recommendation OfferRecommendationInfoDto `json:"recommendation,omitempty"`
}
