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

// OfferCampaignStatusType Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
type OfferCampaignStatusType string

// List of OfferCampaignStatusType
const (
	PUBLISHED OfferCampaignStatusType = "PUBLISHED"
	CHECKING OfferCampaignStatusType = "CHECKING"
	DISABLED_BY_PARTNER OfferCampaignStatusType = "DISABLED_BY_PARTNER"
	DISABLED_AUTOMATICALLY OfferCampaignStatusType = "DISABLED_AUTOMATICALLY"
	REJECTED_BY_MARKET OfferCampaignStatusType = "REJECTED_BY_MARKET"
	CREATING_CARD OfferCampaignStatusType = "CREATING_CARD"
	NO_CARD OfferCampaignStatusType = "NO_CARD"
	NO_STOCKS OfferCampaignStatusType = "NO_STOCKS"
	ARCHIVED OfferCampaignStatusType = "ARCHIVED"
)

// All allowed values of OfferCampaignStatusType enum
var AllowedOfferCampaignStatusTypeEnumValues = []OfferCampaignStatusType{
	"PUBLISHED",
	"CHECKING",
	"DISABLED_BY_PARTNER",
	"DISABLED_AUTOMATICALLY",
	"REJECTED_BY_MARKET",
	"CREATING_CARD",
	"NO_CARD",
	"NO_STOCKS",
	"ARCHIVED",
}

func (v *OfferCampaignStatusType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := OfferCampaignStatusType(value)
	for _, existing := range AllowedOfferCampaignStatusTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid OfferCampaignStatusType", value)
}

// NewOfferCampaignStatusTypeFromValue returns a pointer to a valid OfferCampaignStatusType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOfferCampaignStatusTypeFromValue(v string) (*OfferCampaignStatusType, error) {
	ev := OfferCampaignStatusType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for OfferCampaignStatusType: valid values are %v", v, AllowedOfferCampaignStatusTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OfferCampaignStatusType) IsValid() bool {
	for _, existing := range AllowedOfferCampaignStatusTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to OfferCampaignStatusType value
func (v OfferCampaignStatusType) Ptr() *OfferCampaignStatusType {
	return &v
}

type NullableOfferCampaignStatusType struct {
	value *OfferCampaignStatusType
	isSet bool
}

func (v NullableOfferCampaignStatusType) Get() *OfferCampaignStatusType {
	return v.value
}

func (v *NullableOfferCampaignStatusType) Set(val *OfferCampaignStatusType) {
	v.value = val
	v.isSet = true
}

func (v NullableOfferCampaignStatusType) IsSet() bool {
	return v.isSet
}

func (v *NullableOfferCampaignStatusType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOfferCampaignStatusType(val *OfferCampaignStatusType) *NullableOfferCampaignStatusType {
	return &NullableOfferCampaignStatusType{value: val, isSet: true}
}

func (v NullableOfferCampaignStatusType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOfferCampaignStatusType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

