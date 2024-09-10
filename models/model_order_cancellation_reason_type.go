package models
// OrderCancellationReasonType : Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
type OrderCancellationReasonType string

// List of OrderCancellationReasonType
const (
	DELIVERED OrderCancellationReasonType = "ORDER_DELIVERED"
	IN_DELIVERY OrderCancellationReasonType = "ORDER_IN_DELIVERY"
)
