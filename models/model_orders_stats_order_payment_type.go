package models
// OrdersStatsOrderPaymentType : Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
type OrdersStatsOrderPaymentType string

// List of OrdersStatsOrderPaymentType
const (
	CREDIT OrdersStatsOrderPaymentType = "CREDIT"
	POSTPAID OrdersStatsOrderPaymentType = "POSTPAID"
	PREPAID OrdersStatsOrderPaymentType = "PREPAID"
	TINKOFF_CREDIT OrdersStatsOrderPaymentType = "TINKOFF_CREDIT"
)
