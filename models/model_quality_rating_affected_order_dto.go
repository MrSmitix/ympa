package models

// QualityRatingAffectedOrderDto - Информация о заказе, который повлиял на индекс качества.
type QualityRatingAffectedOrderDto struct {

	// Идентификатор заказа.
	OrderId int64 `json:"orderId"`

	// Описание проблемы.
	Description string `json:"description"`

	ComponentType AffectedOrderQualityRatingComponentType `json:"componentType"`
}
