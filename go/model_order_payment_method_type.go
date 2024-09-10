// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server


import (
	"fmt"
)


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

// AllowedOrderPaymentMethodTypeEnumValues is all the allowed values of OrderPaymentMethodType enum
var AllowedOrderPaymentMethodTypeEnumValues = []OrderPaymentMethodType{
	"CASH_ON_DELIVERY",
	"CARD_ON_DELIVERY",
	"BOUND_CARD_ON_DELIVERY",
	"YANDEX",
	"APPLE_PAY",
	"EXTERNAL_CERTIFICATE",
	"CREDIT",
	"GOOGLE_PAY",
	"TINKOFF_CREDIT",
	"SBP",
	"TINKOFF_INSTALLMENTS",
	"B2B_ACCOUNT_PREPAYMENT",
	"B2B_ACCOUNT_POSTPAYMENT",
	"UNKNOWN",
}

// validOrderPaymentMethodTypeEnumValue provides a map of OrderPaymentMethodTypes for fast verification of use input
var validOrderPaymentMethodTypeEnumValues = map[OrderPaymentMethodType]struct{}{
	"CASH_ON_DELIVERY": {},
	"CARD_ON_DELIVERY": {},
	"BOUND_CARD_ON_DELIVERY": {},
	"YANDEX": {},
	"APPLE_PAY": {},
	"EXTERNAL_CERTIFICATE": {},
	"CREDIT": {},
	"GOOGLE_PAY": {},
	"TINKOFF_CREDIT": {},
	"SBP": {},
	"TINKOFF_INSTALLMENTS": {},
	"B2B_ACCOUNT_PREPAYMENT": {},
	"B2B_ACCOUNT_POSTPAYMENT": {},
	"UNKNOWN": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OrderPaymentMethodType) IsValid() bool {
	_, ok := validOrderPaymentMethodTypeEnumValues[v]
	return ok
}

// NewOrderPaymentMethodTypeFromValue returns a pointer to a valid OrderPaymentMethodType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOrderPaymentMethodTypeFromValue(v string) (OrderPaymentMethodType, error) {
	ev := OrderPaymentMethodType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for OrderPaymentMethodType: valid values are %v", v, AllowedOrderPaymentMethodTypeEnumValues)
}



// AssertOrderPaymentMethodTypeRequired checks if the required fields are not zero-ed
func AssertOrderPaymentMethodTypeRequired(obj OrderPaymentMethodType) error {
	return nil
}

// AssertOrderPaymentMethodTypeConstraints checks if the values respects the defined constraints
func AssertOrderPaymentMethodTypeConstraints(obj OrderPaymentMethodType) error {
	return nil
}
