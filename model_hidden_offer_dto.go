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

// checks if the HiddenOfferDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &HiddenOfferDTO{}

// HiddenOfferDTO Информация о скрытии.
type HiddenOfferDTO struct {
	// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	OfferId string `json:"offerId" validate:"regexp=^[^\\\\x00-\\\\x08\\\\x0A-\\\\x1f\\\\x7f]{1,255}$"`
}

type _HiddenOfferDTO HiddenOfferDTO

// NewHiddenOfferDTO instantiates a new HiddenOfferDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewHiddenOfferDTO(offerId string) *HiddenOfferDTO {
	this := HiddenOfferDTO{}
	this.OfferId = offerId
	return &this
}

// NewHiddenOfferDTOWithDefaults instantiates a new HiddenOfferDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewHiddenOfferDTOWithDefaults() *HiddenOfferDTO {
	this := HiddenOfferDTO{}
	return &this
}

// GetOfferId returns the OfferId field value
func (o *HiddenOfferDTO) GetOfferId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OfferId
}

// GetOfferIdOk returns a tuple with the OfferId field value
// and a boolean to check if the value has been set.
func (o *HiddenOfferDTO) GetOfferIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OfferId, true
}

// SetOfferId sets field value
func (o *HiddenOfferDTO) SetOfferId(v string) {
	o.OfferId = v
}

func (o HiddenOfferDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o HiddenOfferDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offerId"] = o.OfferId
	return toSerialize, nil
}

func (o *HiddenOfferDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"offerId",
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

	varHiddenOfferDTO := _HiddenOfferDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varHiddenOfferDTO)

	if err != nil {
		return err
	}

	*o = HiddenOfferDTO(varHiddenOfferDTO)

	return err
}

type NullableHiddenOfferDTO struct {
	value *HiddenOfferDTO
	isSet bool
}

func (v NullableHiddenOfferDTO) Get() *HiddenOfferDTO {
	return v.value
}

func (v *NullableHiddenOfferDTO) Set(val *HiddenOfferDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableHiddenOfferDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableHiddenOfferDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableHiddenOfferDTO(val *HiddenOfferDTO) *NullableHiddenOfferDTO {
	return &NullableHiddenOfferDTO{value: val, isSet: true}
}

func (v NullableHiddenOfferDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableHiddenOfferDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


