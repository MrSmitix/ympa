package models

// OrderStatusChangeDto - Заказ.
type OrderStatusChangeDto struct {

	Status OrderStatusType `json:"status"`

	Substatus OrderSubstatusType `json:"substatus,omitempty"`

	Delivery OrderStatusChangeDeliveryDto `json:"delivery,omitempty"`
}
