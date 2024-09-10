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

// FeedbackCommentAuthorType Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
type FeedbackCommentAuthorType string

// List of FeedbackCommentAuthorType
const (
	USER FeedbackCommentAuthorType = "USER"
	SHOP FeedbackCommentAuthorType = "SHOP"
)

// All allowed values of FeedbackCommentAuthorType enum
var AllowedFeedbackCommentAuthorTypeEnumValues = []FeedbackCommentAuthorType{
	"USER",
	"SHOP",
}

func (v *FeedbackCommentAuthorType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := FeedbackCommentAuthorType(value)
	for _, existing := range AllowedFeedbackCommentAuthorTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid FeedbackCommentAuthorType", value)
}

// NewFeedbackCommentAuthorTypeFromValue returns a pointer to a valid FeedbackCommentAuthorType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFeedbackCommentAuthorTypeFromValue(v string) (*FeedbackCommentAuthorType, error) {
	ev := FeedbackCommentAuthorType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for FeedbackCommentAuthorType: valid values are %v", v, AllowedFeedbackCommentAuthorTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FeedbackCommentAuthorType) IsValid() bool {
	for _, existing := range AllowedFeedbackCommentAuthorTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to FeedbackCommentAuthorType value
func (v FeedbackCommentAuthorType) Ptr() *FeedbackCommentAuthorType {
	return &v
}

type NullableFeedbackCommentAuthorType struct {
	value *FeedbackCommentAuthorType
	isSet bool
}

func (v NullableFeedbackCommentAuthorType) Get() *FeedbackCommentAuthorType {
	return v.value
}

func (v *NullableFeedbackCommentAuthorType) Set(val *FeedbackCommentAuthorType) {
	v.value = val
	v.isSet = true
}

func (v NullableFeedbackCommentAuthorType) IsSet() bool {
	return v.isSet
}

func (v *NullableFeedbackCommentAuthorType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFeedbackCommentAuthorType(val *FeedbackCommentAuthorType) *NullableFeedbackCommentAuthorType {
	return &NullableFeedbackCommentAuthorType{value: val, isSet: true}
}

func (v NullableFeedbackCommentAuthorType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFeedbackCommentAuthorType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

