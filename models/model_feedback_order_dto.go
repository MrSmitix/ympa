package models

// FeedbackOrderDto - Информация о заказе, указанная в отзыве.
type FeedbackOrderDto struct {

	// Номер заказа, указанный в отзыве.
	ShopOrderId string `json:"shopOrderId,omitempty"`

	Delivery FeedbackDeliveryType `json:"delivery,omitempty"`
}
