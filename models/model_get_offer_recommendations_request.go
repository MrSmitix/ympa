package models

type GetOfferRecommendationsRequest struct {

	// Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
	OfferIds *[]string `json:"offerIds,omitempty"`

	CofinancePriceFilter FieldStateType `json:"cofinancePriceFilter,omitempty"`

	RecommendedCofinancePriceFilter FieldStateType `json:"recommendedCofinancePriceFilter,omitempty"`

	CompetitivenessFilter PriceCompetitivenessType `json:"competitivenessFilter,omitempty"`
}
