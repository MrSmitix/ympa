package models
// OrderUpdateStatusType : Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
type OrderUpdateStatusType string

// List of OrderUpdateStatusType
const (
	OK OrderUpdateStatusType = "OK"
	ERROR OrderUpdateStatusType = "ERROR"
)
