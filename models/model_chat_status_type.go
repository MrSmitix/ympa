package models
// ChatStatusType : Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
type ChatStatusType string

// List of ChatStatusType
const (
	NEW ChatStatusType = "NEW"
	WAITING_FOR_CUSTOMER ChatStatusType = "WAITING_FOR_CUSTOMER"
	WAITING_FOR_PARTNER ChatStatusType = "WAITING_FOR_PARTNER"
	WAITING_FOR_ARBITER ChatStatusType = "WAITING_FOR_ARBITER"
	WAITING_FOR_MARKET ChatStatusType = "WAITING_FOR_MARKET"
	FINISHED ChatStatusType = "FINISHED"
)
