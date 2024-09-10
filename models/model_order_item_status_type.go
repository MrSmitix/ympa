package models
// OrderItemStatusType : Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
type OrderItemStatusType string

// List of OrderItemStatusType
const (
	REJECTED OrderItemStatusType = "REJECTED"
	RETURNED OrderItemStatusType = "RETURNED"
)
