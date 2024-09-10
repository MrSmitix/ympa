package models
// OrdersStatsPaymentSourceType : Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
type OrdersStatsPaymentSourceType string

// List of OrdersStatsPaymentSourceType
const (
	BUYER OrdersStatsPaymentSourceType = "BUYER"
	CASHBACK OrdersStatsPaymentSourceType = "CASHBACK"
	MARKETPLACE OrdersStatsPaymentSourceType = "MARKETPLACE"
	SPLIT OrdersStatsPaymentSourceType = "SPLIT"
)
