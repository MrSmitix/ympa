package models
// FeedbackDeliveryType : Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
type FeedbackDeliveryType string

// List of FeedbackDeliveryType
const (
	DELIVERY FeedbackDeliveryType = "DELIVERY"
	PICKUP FeedbackDeliveryType = "PICKUP"
	INSTORE FeedbackDeliveryType = "INSTORE"
)
