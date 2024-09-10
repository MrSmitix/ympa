package models
// RefundStatusType : Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. 
type RefundStatusType string

// List of RefundStatusType
const (
	STARTED_BY_USER RefundStatusType = "STARTED_BY_USER"
	REFUND_IN_PROGRESS RefundStatusType = "REFUND_IN_PROGRESS"
	REFUNDED RefundStatusType = "REFUNDED"
	FAILED RefundStatusType = "FAILED"
	WAITING_FOR_DECISION RefundStatusType = "WAITING_FOR_DECISION"
	DECISION_MADE RefundStatusType = "DECISION_MADE"
	REFUNDED_WITH_BONUSES RefundStatusType = "REFUNDED_WITH_BONUSES"
	REFUNDED_BY_SHOP RefundStatusType = "REFUNDED_BY_SHOP"
	CANCELLED RefundStatusType = "CANCELLED"
	COMPLETE_WITHOUT_REFUND RefundStatusType = "COMPLETE_WITHOUT_REFUND"
	UNKNOWN RefundStatusType = "UNKNOWN"
)
