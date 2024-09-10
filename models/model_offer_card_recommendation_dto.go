package models

// OfferCardRecommendationDto - Рекомендация по заполнению карточки товара.
type OfferCardRecommendationDto struct {

	Type OfferCardRecommendationType `json:"type"`

	// Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
	Percent int32 `json:"percent,omitempty"`
}
