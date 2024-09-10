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

// FieldStateType Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
type FieldStateType string

// List of FieldStateType
const (
	SPECIFIED FieldStateType = "SPECIFIED"
	EMPTY FieldStateType = "EMPTY"
)

// All allowed values of FieldStateType enum
var AllowedFieldStateTypeEnumValues = []FieldStateType{
	"SPECIFIED",
	"EMPTY",
}

func (v *FieldStateType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := FieldStateType(value)
	for _, existing := range AllowedFieldStateTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid FieldStateType", value)
}

// NewFieldStateTypeFromValue returns a pointer to a valid FieldStateType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFieldStateTypeFromValue(v string) (*FieldStateType, error) {
	ev := FieldStateType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for FieldStateType: valid values are %v", v, AllowedFieldStateTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FieldStateType) IsValid() bool {
	for _, existing := range AllowedFieldStateTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to FieldStateType value
func (v FieldStateType) Ptr() *FieldStateType {
	return &v
}

type NullableFieldStateType struct {
	value *FieldStateType
	isSet bool
}

func (v NullableFieldStateType) Get() *FieldStateType {
	return v.value
}

func (v *NullableFieldStateType) Set(val *FieldStateType) {
	v.value = val
	v.isSet = true
}

func (v NullableFieldStateType) IsSet() bool {
	return v.isSet
}

func (v *NullableFieldStateType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFieldStateType(val *FieldStateType) *NullableFieldStateType {
	return &NullableFieldStateType{value: val, isSet: true}
}

func (v NullableFieldStateType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFieldStateType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

