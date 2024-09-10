package models

// UpdateOrderStatusDto - Список заказов.
type UpdateOrderStatusDto struct {

	// Идентификатор заказа.
	Id int64 `json:"id,omitempty"`

	Status OrderStatusType `json:"status,omitempty"`

	Substatus OrderSubstatusType `json:"substatus,omitempty"`

	UpdateStatus OrderUpdateStatusType `json:"updateStatus,omitempty"`

	// Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
	ErrorDetails string `json:"errorDetails,omitempty"`
}
