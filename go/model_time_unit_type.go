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


// TimeUnitType : Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
type TimeUnitType string

// List of TimeUnitType
const (
	HOUR TimeUnitType = "HOUR"
	DAY TimeUnitType = "DAY"
	WEEK TimeUnitType = "WEEK"
	MONTH TimeUnitType = "MONTH"
	YEAR TimeUnitType = "YEAR"
)

// AllowedTimeUnitTypeEnumValues is all the allowed values of TimeUnitType enum
var AllowedTimeUnitTypeEnumValues = []TimeUnitType{
	"HOUR",
	"DAY",
	"WEEK",
	"MONTH",
	"YEAR",
}

// validTimeUnitTypeEnumValue provides a map of TimeUnitTypes for fast verification of use input
var validTimeUnitTypeEnumValues = map[TimeUnitType]struct{}{
	"HOUR": {},
	"DAY": {},
	"WEEK": {},
	"MONTH": {},
	"YEAR": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v TimeUnitType) IsValid() bool {
	_, ok := validTimeUnitTypeEnumValues[v]
	return ok
}

// NewTimeUnitTypeFromValue returns a pointer to a valid TimeUnitType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewTimeUnitTypeFromValue(v string) (TimeUnitType, error) {
	ev := TimeUnitType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for TimeUnitType: valid values are %v", v, AllowedTimeUnitTypeEnumValues)
}



// AssertTimeUnitTypeRequired checks if the required fields are not zero-ed
func AssertTimeUnitTypeRequired(obj TimeUnitType) error {
	return nil
}

// AssertTimeUnitTypeConstraints checks if the values respects the defined constraints
func AssertTimeUnitTypeConstraints(obj TimeUnitType) error {
	return nil
}
