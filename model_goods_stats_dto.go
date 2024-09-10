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

// checks if the GoodsStatsDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GoodsStatsDTO{}

// GoodsStatsDTO Отчет по товарам.
type GoodsStatsDTO struct {
	// Список товаров.
	ShopSkus []GoodsStatsGoodsDTO `json:"shopSkus"`
}

type _GoodsStatsDTO GoodsStatsDTO

// NewGoodsStatsDTO instantiates a new GoodsStatsDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGoodsStatsDTO(shopSkus []GoodsStatsGoodsDTO) *GoodsStatsDTO {
	this := GoodsStatsDTO{}
	this.ShopSkus = shopSkus
	return &this
}

// NewGoodsStatsDTOWithDefaults instantiates a new GoodsStatsDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGoodsStatsDTOWithDefaults() *GoodsStatsDTO {
	this := GoodsStatsDTO{}
	return &this
}

// GetShopSkus returns the ShopSkus field value
func (o *GoodsStatsDTO) GetShopSkus() []GoodsStatsGoodsDTO {
	if o == nil {
		var ret []GoodsStatsGoodsDTO
		return ret
	}

	return o.ShopSkus
}

// GetShopSkusOk returns a tuple with the ShopSkus field value
// and a boolean to check if the value has been set.
func (o *GoodsStatsDTO) GetShopSkusOk() ([]GoodsStatsGoodsDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.ShopSkus, true
}

// SetShopSkus sets field value
func (o *GoodsStatsDTO) SetShopSkus(v []GoodsStatsGoodsDTO) {
	o.ShopSkus = v
}

func (o GoodsStatsDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GoodsStatsDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["shopSkus"] = o.ShopSkus
	return toSerialize, nil
}

func (o *GoodsStatsDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"shopSkus",
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

	varGoodsStatsDTO := _GoodsStatsDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGoodsStatsDTO)

	if err != nil {
		return err
	}

	*o = GoodsStatsDTO(varGoodsStatsDTO)

	return err
}

type NullableGoodsStatsDTO struct {
	value *GoodsStatsDTO
	isSet bool
}

func (v NullableGoodsStatsDTO) Get() *GoodsStatsDTO {
	return v.value
}

func (v *NullableGoodsStatsDTO) Set(val *GoodsStatsDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableGoodsStatsDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableGoodsStatsDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGoodsStatsDTO(val *GoodsStatsDTO) *NullableGoodsStatsDTO {
	return &NullableGoodsStatsDTO{value: val, isSet: true}
}

func (v NullableGoodsStatsDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGoodsStatsDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


