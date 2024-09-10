/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the PromoOfferPromocodeParamsDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PromoOfferPromocodeParamsDTO{}

// PromoOfferPromocodeParamsDTO Параметры товара в акции с типом `MARKET_PROMOCODE`.
type PromoOfferPromocodeParamsDTO struct {
	// Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	MaxPrice int64 `json:"maxPrice"`
}

type _PromoOfferPromocodeParamsDTO PromoOfferPromocodeParamsDTO

// NewPromoOfferPromocodeParamsDTO instantiates a new PromoOfferPromocodeParamsDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPromoOfferPromocodeParamsDTO(maxPrice int64) *PromoOfferPromocodeParamsDTO {
	this := PromoOfferPromocodeParamsDTO{}
	this.MaxPrice = maxPrice
	return &this
}

// NewPromoOfferPromocodeParamsDTOWithDefaults instantiates a new PromoOfferPromocodeParamsDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPromoOfferPromocodeParamsDTOWithDefaults() *PromoOfferPromocodeParamsDTO {
	this := PromoOfferPromocodeParamsDTO{}
	return &this
}

// GetMaxPrice returns the MaxPrice field value
func (o *PromoOfferPromocodeParamsDTO) GetMaxPrice() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.MaxPrice
}

// GetMaxPriceOk returns a tuple with the MaxPrice field value
// and a boolean to check if the value has been set.
func (o *PromoOfferPromocodeParamsDTO) GetMaxPriceOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MaxPrice, true
}

// SetMaxPrice sets field value
func (o *PromoOfferPromocodeParamsDTO) SetMaxPrice(v int64) {
	o.MaxPrice = v
}

func (o PromoOfferPromocodeParamsDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PromoOfferPromocodeParamsDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["maxPrice"] = o.MaxPrice
	return toSerialize, nil
}

func (o *PromoOfferPromocodeParamsDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"maxPrice",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varPromoOfferPromocodeParamsDTO := _PromoOfferPromocodeParamsDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPromoOfferPromocodeParamsDTO)

	if err != nil {
		return err
	}

	*o = PromoOfferPromocodeParamsDTO(varPromoOfferPromocodeParamsDTO)

	return err
}

type NullablePromoOfferPromocodeParamsDTO struct {
	value *PromoOfferPromocodeParamsDTO
	isSet bool
}

func (v NullablePromoOfferPromocodeParamsDTO) Get() *PromoOfferPromocodeParamsDTO {
	return v.value
}

func (v *NullablePromoOfferPromocodeParamsDTO) Set(val *PromoOfferPromocodeParamsDTO) {
	v.value = val
	v.isSet = true
}

func (v NullablePromoOfferPromocodeParamsDTO) IsSet() bool {
	return v.isSet
}

func (v *NullablePromoOfferPromocodeParamsDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePromoOfferPromocodeParamsDTO(val *PromoOfferPromocodeParamsDTO) *NullablePromoOfferPromocodeParamsDTO {
	return &NullablePromoOfferPromocodeParamsDTO{value: val, isSet: true}
}

func (v NullablePromoOfferPromocodeParamsDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePromoOfferPromocodeParamsDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


