package models
// OrderPaymentMethodType : Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 
type OrderPaymentMethodType string

// List of OrderPaymentMethodType
const (
	CASH_ON_DELIVERY OrderPaymentMethodType = "CASH_ON_DELIVERY"
	CARD_ON_DELIVERY OrderPaymentMethodType = "CARD_ON_DELIVERY"
	BOUND_CARD_ON_DELIVERY OrderPaymentMethodType = "BOUND_CARD_ON_DELIVERY"
	YANDEX OrderPaymentMethodType = "YANDEX"
	APPLE_PAY OrderPaymentMethodType = "APPLE_PAY"
	EXTERNAL_CERTIFICATE OrderPaymentMethodType = "EXTERNAL_CERTIFICATE"
	CREDIT OrderPaymentMethodType = "CREDIT"
	GOOGLE_PAY OrderPaymentMethodType = "GOOGLE_PAY"
	TINKOFF_CREDIT OrderPaymentMethodType = "TINKOFF_CREDIT"
	SBP OrderPaymentMethodType = "SBP"
	TINKOFF_INSTALLMENTS OrderPaymentMethodType = "TINKOFF_INSTALLMENTS"
	B2_B_ACCOUNT_PREPAYMENT OrderPaymentMethodType = "B2B_ACCOUNT_PREPAYMENT"
	B2_B_ACCOUNT_POSTPAYMENT OrderPaymentMethodType = "B2B_ACCOUNT_POSTPAYMENT"
	UNKNOWN OrderPaymentMethodType = "UNKNOWN"
)
