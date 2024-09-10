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


// FeedContentErrorType : Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
type FeedContentErrorType string

// List of FeedContentErrorType
const (
	PARSE_ERROR FeedContentErrorType = "PARSE_ERROR"
	PARSE_XML_ERROR FeedContentErrorType = "PARSE_XML_ERROR"
	TOO_MANY_REJECTED_OFFERS FeedContentErrorType = "TOO_MANY_REJECTED_OFFERS"
)

// AllowedFeedContentErrorTypeEnumValues is all the allowed values of FeedContentErrorType enum
var AllowedFeedContentErrorTypeEnumValues = []FeedContentErrorType{
	"PARSE_ERROR",
	"PARSE_XML_ERROR",
	"TOO_MANY_REJECTED_OFFERS",
}

// validFeedContentErrorTypeEnumValue provides a map of FeedContentErrorTypes for fast verification of use input
var validFeedContentErrorTypeEnumValues = map[FeedContentErrorType]struct{}{
	"PARSE_ERROR": {},
	"PARSE_XML_ERROR": {},
	"TOO_MANY_REJECTED_OFFERS": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FeedContentErrorType) IsValid() bool {
	_, ok := validFeedContentErrorTypeEnumValues[v]
	return ok
}

// NewFeedContentErrorTypeFromValue returns a pointer to a valid FeedContentErrorType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFeedContentErrorTypeFromValue(v string) (FeedContentErrorType, error) {
	ev := FeedContentErrorType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for FeedContentErrorType: valid values are %v", v, AllowedFeedContentErrorTypeEnumValues)
}



// AssertFeedContentErrorTypeRequired checks if the required fields are not zero-ed
func AssertFeedContentErrorTypeRequired(obj FeedContentErrorType) error {
	return nil
}

// AssertFeedContentErrorTypeConstraints checks if the values respects the defined constraints
func AssertFeedContentErrorTypeConstraints(obj FeedContentErrorType) error {
	return nil
}
