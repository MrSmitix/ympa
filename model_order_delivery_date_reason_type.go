/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"fmt"
)

// OrderDeliveryDateReasonType Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. 
type OrderDeliveryDateReasonType string

// List of OrderDeliveryDateReasonType
const (
	USER_MOVED_DELIVERY_DATES OrderDeliveryDateReasonType = "USER_MOVED_DELIVERY_DATES"
	PARTNER_MOVED_DELIVERY_DATES OrderDeliveryDateReasonType = "PARTNER_MOVED_DELIVERY_DATES"
)

// All allowed values of OrderDeliveryDateReasonType enum
var AllowedOrderDeliveryDateReasonTypeEnumValues = []OrderDeliveryDateReasonType{
	"USER_MOVED_DELIVERY_DATES",
	"PARTNER_MOVED_DELIVERY_DATES",
}

func (v *OrderDeliveryDateReasonType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := OrderDeliveryDateReasonType(value)
	for _, existing := range AllowedOrderDeliveryDateReasonTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid OrderDeliveryDateReasonType", value)
}

// NewOrderDeliveryDateReasonTypeFromValue returns a pointer to a valid OrderDeliveryDateReasonType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOrderDeliveryDateReasonTypeFromValue(v string) (*OrderDeliveryDateReasonType, error) {
	ev := OrderDeliveryDateReasonType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for OrderDeliveryDateReasonType: valid values are %v", v, AllowedOrderDeliveryDateReasonTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OrderDeliveryDateReasonType) IsValid() bool {
	for _, existing := range AllowedOrderDeliveryDateReasonTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to OrderDeliveryDateReasonType value
func (v OrderDeliveryDateReasonType) Ptr() *OrderDeliveryDateReasonType {
	return &v
}

type NullableOrderDeliveryDateReasonType struct {
	value *OrderDeliveryDateReasonType
	isSet bool
}

func (v NullableOrderDeliveryDateReasonType) Get() *OrderDeliveryDateReasonType {
	return v.value
}

func (v *NullableOrderDeliveryDateReasonType) Set(val *OrderDeliveryDateReasonType) {
	v.value = val
	v.isSet = true
}

func (v NullableOrderDeliveryDateReasonType) IsSet() bool {
	return v.isSet
}

func (v *NullableOrderDeliveryDateReasonType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrderDeliveryDateReasonType(val *OrderDeliveryDateReasonType) *NullableOrderDeliveryDateReasonType {
	return &NullableOrderDeliveryDateReasonType{value: val, isSet: true}
}

func (v NullableOrderDeliveryDateReasonType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrderDeliveryDateReasonType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

