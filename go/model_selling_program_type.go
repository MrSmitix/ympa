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


// SellingProgramType : Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
type SellingProgramType string

// List of SellingProgramType
const (
	FBY SellingProgramType = "FBY"
	FBS SellingProgramType = "FBS"
	DBS SellingProgramType = "DBS"
	EXPRESS SellingProgramType = "EXPRESS"
)

// AllowedSellingProgramTypeEnumValues is all the allowed values of SellingProgramType enum
var AllowedSellingProgramTypeEnumValues = []SellingProgramType{
	"FBY",
	"FBS",
	"DBS",
	"EXPRESS",
}

// validSellingProgramTypeEnumValue provides a map of SellingProgramTypes for fast verification of use input
var validSellingProgramTypeEnumValues = map[SellingProgramType]struct{}{
	"FBY": {},
	"FBS": {},
	"DBS": {},
	"EXPRESS": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SellingProgramType) IsValid() bool {
	_, ok := validSellingProgramTypeEnumValues[v]
	return ok
}

// NewSellingProgramTypeFromValue returns a pointer to a valid SellingProgramType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSellingProgramTypeFromValue(v string) (SellingProgramType, error) {
	ev := SellingProgramType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for SellingProgramType: valid values are %v", v, AllowedSellingProgramTypeEnumValues)
}



// AssertSellingProgramTypeRequired checks if the required fields are not zero-ed
func AssertSellingProgramTypeRequired(obj SellingProgramType) error {
	return nil
}

// AssertSellingProgramTypeConstraints checks if the values respects the defined constraints
func AssertSellingProgramTypeConstraints(obj SellingProgramType) error {
	return nil
}
