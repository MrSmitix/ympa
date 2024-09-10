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


// ApiResponseStatusType : Тип ответа.
type ApiResponseStatusType string

// List of ApiResponseStatusType
const (
	OK ApiResponseStatusType = "OK"
	ERROR ApiResponseStatusType = "ERROR"
)

// AllowedApiResponseStatusTypeEnumValues is all the allowed values of ApiResponseStatusType enum
var AllowedApiResponseStatusTypeEnumValues = []ApiResponseStatusType{
	"OK",
	"ERROR",
}

// validApiResponseStatusTypeEnumValue provides a map of ApiResponseStatusTypes for fast verification of use input
var validApiResponseStatusTypeEnumValues = map[ApiResponseStatusType]struct{}{
	"OK": {},
	"ERROR": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ApiResponseStatusType) IsValid() bool {
	_, ok := validApiResponseStatusTypeEnumValues[v]
	return ok
}

// NewApiResponseStatusTypeFromValue returns a pointer to a valid ApiResponseStatusType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewApiResponseStatusTypeFromValue(v string) (ApiResponseStatusType, error) {
	ev := ApiResponseStatusType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for ApiResponseStatusType: valid values are %v", v, AllowedApiResponseStatusTypeEnumValues)
}



// AssertApiResponseStatusTypeRequired checks if the required fields are not zero-ed
func AssertApiResponseStatusTypeRequired(obj ApiResponseStatusType) error {
	return nil
}

// AssertApiResponseStatusTypeConstraints checks if the values respects the defined constraints
func AssertApiResponseStatusTypeConstraints(obj ApiResponseStatusType) error {
	return nil
}
