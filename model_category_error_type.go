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

// CategoryErrorType Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
type CategoryErrorType string

// List of CategoryErrorType
const (
	UNKNOWN_CATEGORY CategoryErrorType = "UNKNOWN_CATEGORY"
	CATEGORY_IS_NOT_LEAF CategoryErrorType = "CATEGORY_IS_NOT_LEAF"
)

// All allowed values of CategoryErrorType enum
var AllowedCategoryErrorTypeEnumValues = []CategoryErrorType{
	"UNKNOWN_CATEGORY",
	"CATEGORY_IS_NOT_LEAF",
}

func (v *CategoryErrorType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := CategoryErrorType(value)
	for _, existing := range AllowedCategoryErrorTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid CategoryErrorType", value)
}

// NewCategoryErrorTypeFromValue returns a pointer to a valid CategoryErrorType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCategoryErrorTypeFromValue(v string) (*CategoryErrorType, error) {
	ev := CategoryErrorType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for CategoryErrorType: valid values are %v", v, AllowedCategoryErrorTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CategoryErrorType) IsValid() bool {
	for _, existing := range AllowedCategoryErrorTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to CategoryErrorType value
func (v CategoryErrorType) Ptr() *CategoryErrorType {
	return &v
}

type NullableCategoryErrorType struct {
	value *CategoryErrorType
	isSet bool
}

func (v NullableCategoryErrorType) Get() *CategoryErrorType {
	return v.value
}

func (v *NullableCategoryErrorType) Set(val *CategoryErrorType) {
	v.value = val
	v.isSet = true
}

func (v NullableCategoryErrorType) IsSet() bool {
	return v.isSet
}

func (v *NullableCategoryErrorType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCategoryErrorType(val *CategoryErrorType) *NullableCategoryErrorType {
	return &NullableCategoryErrorType{value: val, isSet: true}
}

func (v NullableCategoryErrorType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCategoryErrorType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

