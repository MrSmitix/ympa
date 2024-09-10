package models
// OrderStatusType : Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
type OrderStatusType string

// List of OrderStatusType
const (
	PLACING OrderStatusType = "PLACING"
	RESERVED OrderStatusType = "RESERVED"
	UNPAID OrderStatusType = "UNPAID"
	PROCESSING OrderStatusType = "PROCESSING"
	DELIVERY OrderStatusType = "DELIVERY"
	PICKUP OrderStatusType = "PICKUP"
	DELIVERED OrderStatusType = "DELIVERED"
	CANCELLED OrderStatusType = "CANCELLED"
	PENDING OrderStatusType = "PENDING"
	PARTIALLY_RETURNED OrderStatusType = "PARTIALLY_RETURNED"
	RETURNED OrderStatusType = "RETURNED"
	UNKNOWN OrderStatusType = "UNKNOWN"
)
