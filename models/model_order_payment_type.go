package models
// OrderPaymentType : Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
type OrderPaymentType string

// List of OrderPaymentType
const (
	PREPAID OrderPaymentType = "PREPAID"
	POSTPAID OrderPaymentType = "POSTPAID"
	UNKNOWN OrderPaymentType = "UNKNOWN"
)
