package models
// OrderStatsStatusType : Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. 
type OrderStatsStatusType string

// List of OrderStatsStatusType
const (
	CANCELLED_BEFORE_PROCESSING OrderStatsStatusType = "CANCELLED_BEFORE_PROCESSING"
	CANCELLED_IN_DELIVERY OrderStatsStatusType = "CANCELLED_IN_DELIVERY"
	CANCELLED_IN_PROCESSING OrderStatsStatusType = "CANCELLED_IN_PROCESSING"
	DELIVERY OrderStatsStatusType = "DELIVERY"
	DELIVERED OrderStatsStatusType = "DELIVERED"
	PARTIALLY_DELIVERED OrderStatsStatusType = "PARTIALLY_DELIVERED"
	PARTIALLY_RETURNED OrderStatsStatusType = "PARTIALLY_RETURNED"
	PENDING OrderStatsStatusType = "PENDING"
	PICKUP OrderStatsStatusType = "PICKUP"
	PROCESSING OrderStatsStatusType = "PROCESSING"
	RESERVED OrderStatsStatusType = "RESERVED"
	RETURNED OrderStatsStatusType = "RETURNED"
	UNKNOWN OrderStatsStatusType = "UNKNOWN"
	UNPAID OrderStatsStatusType = "UNPAID"
	LOST OrderStatsStatusType = "LOST"
)
