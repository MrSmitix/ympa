package models

// GoodsFeedbackIdentifiersDto - Идентификаторы, которые связаны с отзывом.
type GoodsFeedbackIdentifiersDto struct {

	// Идентификатор заказа на Маркете.
	OrderId int64 `json:"orderId"`

	// Идентификатор модели товара.
	ModelId int64 `json:"modelId"`
}
