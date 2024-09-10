package models
// OrdersStatsItemStatusType : Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
type OrdersStatsItemStatusType string

// List of OrdersStatsItemStatusType
const (
	REJECTED OrdersStatsItemStatusType = "REJECTED"
	RETURNED OrdersStatsItemStatusType = "RETURNED"
)
