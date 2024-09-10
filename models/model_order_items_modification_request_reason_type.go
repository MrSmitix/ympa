package models
// OrderItemsModificationRequestReasonType : Причина обновления состава заказа.
type OrderItemsModificationRequestReasonType string

// List of OrderItemsModificationRequestReasonType
const (
	PARTNER_REQUESTED_REMOVE OrderItemsModificationRequestReasonType = "PARTNER_REQUESTED_REMOVE"
	USER_REQUESTED_REMOVE OrderItemsModificationRequestReasonType = "USER_REQUESTED_REMOVE"
)
