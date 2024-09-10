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


// OrderItemInstanceType : Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
type OrderItemInstanceType string

// List of OrderItemInstanceType
const (
	CIS OrderItemInstanceType = "CIS"
	UIN OrderItemInstanceType = "UIN"
	RNPT OrderItemInstanceType = "RNPT"
	GTD OrderItemInstanceType = "GTD"
)

// AllowedOrderItemInstanceTypeEnumValues is all the allowed values of OrderItemInstanceType enum
var AllowedOrderItemInstanceTypeEnumValues = []OrderItemInstanceType{
	"CIS",
	"UIN",
	"RNPT",
	"GTD",
}

// validOrderItemInstanceTypeEnumValue provides a map of OrderItemInstanceTypes for fast verification of use input
var validOrderItemInstanceTypeEnumValues = map[OrderItemInstanceType]struct{}{
	"CIS": {},
	"UIN": {},
	"RNPT": {},
	"GTD": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OrderItemInstanceType) IsValid() bool {
	_, ok := validOrderItemInstanceTypeEnumValues[v]
	return ok
}

// NewOrderItemInstanceTypeFromValue returns a pointer to a valid OrderItemInstanceType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOrderItemInstanceTypeFromValue(v string) (OrderItemInstanceType, error) {
	ev := OrderItemInstanceType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for OrderItemInstanceType: valid values are %v", v, AllowedOrderItemInstanceTypeEnumValues)
}



// AssertOrderItemInstanceTypeRequired checks if the required fields are not zero-ed
func AssertOrderItemInstanceTypeRequired(obj OrderItemInstanceType) error {
	return nil
}

// AssertOrderItemInstanceTypeConstraints checks if the values respects the defined constraints
func AssertOrderItemInstanceTypeConstraints(obj OrderItemInstanceType) error {
	return nil
}
