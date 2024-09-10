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


// CategoryErrorType : Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
type CategoryErrorType string

// List of CategoryErrorType
const (
	UNKNOWN_CATEGORY CategoryErrorType = "UNKNOWN_CATEGORY"
	CATEGORY_IS_NOT_LEAF CategoryErrorType = "CATEGORY_IS_NOT_LEAF"
)

// AllowedCategoryErrorTypeEnumValues is all the allowed values of CategoryErrorType enum
var AllowedCategoryErrorTypeEnumValues = []CategoryErrorType{
	"UNKNOWN_CATEGORY",
	"CATEGORY_IS_NOT_LEAF",
}

// validCategoryErrorTypeEnumValue provides a map of CategoryErrorTypes for fast verification of use input
var validCategoryErrorTypeEnumValues = map[CategoryErrorType]struct{}{
	"UNKNOWN_CATEGORY": {},
	"CATEGORY_IS_NOT_LEAF": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CategoryErrorType) IsValid() bool {
	_, ok := validCategoryErrorTypeEnumValues[v]
	return ok
}

// NewCategoryErrorTypeFromValue returns a pointer to a valid CategoryErrorType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCategoryErrorTypeFromValue(v string) (CategoryErrorType, error) {
	ev := CategoryErrorType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for CategoryErrorType: valid values are %v", v, AllowedCategoryErrorTypeEnumValues)
}



// AssertCategoryErrorTypeRequired checks if the required fields are not zero-ed
func AssertCategoryErrorTypeRequired(obj CategoryErrorType) error {
	return nil
}

// AssertCategoryErrorTypeConstraints checks if the values respects the defined constraints
func AssertCategoryErrorTypeConstraints(obj CategoryErrorType) error {
	return nil
}
