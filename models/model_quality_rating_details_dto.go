package models

// QualityRatingDetailsDto - Информация о заказах, которые повлияли на индекс качества.
type QualityRatingDetailsDto struct {

	// Список заказов, которые повлияли на индекс качества.
	AffectedOrders []QualityRatingAffectedOrderDto `json:"affectedOrders"`
}
