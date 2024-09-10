package models
// OrdersStatsPaymentType : Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
type OrdersStatsPaymentType string

// List of OrdersStatsPaymentType
const (
	PAYMENT OrdersStatsPaymentType = "PAYMENT"
	REFUND OrdersStatsPaymentType = "REFUND"
	UNKNOWN OrdersStatsPaymentType = "UNKNOWN"
)
