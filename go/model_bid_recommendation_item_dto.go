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
	"errors"
)



// BidRecommendationItemDto - Рекомендованная ставка и возможная доля показов.
type BidRecommendationItemDto struct {

	// Значение ставки.
	Bid int32 `json:"bid"`

	// Доля показов. 
	ShowPercent int64 `json:"showPercent"`
}

// AssertBidRecommendationItemDtoRequired checks if the required fields are not zero-ed
func AssertBidRecommendationItemDtoRequired(obj BidRecommendationItemDto) error {
	elements := map[string]interface{}{
		"bid": obj.Bid,
		"showPercent": obj.ShowPercent,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertBidRecommendationItemDtoConstraints checks if the values respects the defined constraints
func AssertBidRecommendationItemDtoConstraints(obj BidRecommendationItemDto) error {
	if obj.Bid < 0 {
		return &ParsingError{Param: "Bid", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.Bid > 9999 {
		return &ParsingError{Param: "Bid", Err: errors.New(errMsgMaxValueConstraint)}
	}
	if obj.ShowPercent < 0 {
		return &ParsingError{Param: "ShowPercent", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.ShowPercent > 100 {
		return &ParsingError{Param: "ShowPercent", Err: errors.New(errMsgMaxValueConstraint)}
	}
	return nil
}
