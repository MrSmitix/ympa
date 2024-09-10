package models

// OrderStateDto - Информация по заказу.
type OrderStateDto struct {

	// Идентификатор заказа.
	Id int64 `json:"id"`

	Status OrderStatusType `json:"status"`

	Substatus OrderSubstatusType `json:"substatus,omitempty"`
}
