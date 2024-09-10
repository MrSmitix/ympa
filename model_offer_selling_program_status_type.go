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

// OfferSellingProgramStatusType Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
type OfferSellingProgramStatusType string

// List of OfferSellingProgramStatusType
const (
	FINE OfferSellingProgramStatusType = "FINE"
	REJECT OfferSellingProgramStatusType = "REJECT"
)

// All allowed values of OfferSellingProgramStatusType enum
var AllowedOfferSellingProgramStatusTypeEnumValues = []OfferSellingProgramStatusType{
	"FINE",
	"REJECT",
}

func (v *OfferSellingProgramStatusType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := OfferSellingProgramStatusType(value)
	for _, existing := range AllowedOfferSellingProgramStatusTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid OfferSellingProgramStatusType", value)
}

// NewOfferSellingProgramStatusTypeFromValue returns a pointer to a valid OfferSellingProgramStatusType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOfferSellingProgramStatusTypeFromValue(v string) (*OfferSellingProgramStatusType, error) {
	ev := OfferSellingProgramStatusType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for OfferSellingProgramStatusType: valid values are %v", v, AllowedOfferSellingProgramStatusTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OfferSellingProgramStatusType) IsValid() bool {
	for _, existing := range AllowedOfferSellingProgramStatusTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to OfferSellingProgramStatusType value
func (v OfferSellingProgramStatusType) Ptr() *OfferSellingProgramStatusType {
	return &v
}

type NullableOfferSellingProgramStatusType struct {
	value *OfferSellingProgramStatusType
	isSet bool
}

func (v NullableOfferSellingProgramStatusType) Get() *OfferSellingProgramStatusType {
	return v.value
}

func (v *NullableOfferSellingProgramStatusType) Set(val *OfferSellingProgramStatusType) {
	v.value = val
	v.isSet = true
}

func (v NullableOfferSellingProgramStatusType) IsSet() bool {
	return v.isSet
}

func (v *NullableOfferSellingProgramStatusType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOfferSellingProgramStatusType(val *OfferSellingProgramStatusType) *NullableOfferSellingProgramStatusType {
	return &NullableOfferSellingProgramStatusType{value: val, isSet: true}
}

func (v NullableOfferSellingProgramStatusType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOfferSellingProgramStatusType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

