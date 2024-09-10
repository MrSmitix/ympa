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

// checks if the TariffParameterDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TariffParameterDTO{}

// TariffParameterDTO Детали расчета конкретной услуги Маркета.
type TariffParameterDTO struct {
	// Название параметра.
	Name string `json:"name"`
	// Значение параметра.
	Value string `json:"value"`
}

type _TariffParameterDTO TariffParameterDTO

// NewTariffParameterDTO instantiates a new TariffParameterDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTariffParameterDTO(name string, value string) *TariffParameterDTO {
	this := TariffParameterDTO{}
	this.Name = name
	this.Value = value
	return &this
}

// NewTariffParameterDTOWithDefaults instantiates a new TariffParameterDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTariffParameterDTOWithDefaults() *TariffParameterDTO {
	this := TariffParameterDTO{}
	return &this
}

// GetName returns the Name field value
func (o *TariffParameterDTO) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *TariffParameterDTO) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *TariffParameterDTO) SetName(v string) {
	o.Name = v
}

// GetValue returns the Value field value
func (o *TariffParameterDTO) GetValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *TariffParameterDTO) GetValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *TariffParameterDTO) SetValue(v string) {
	o.Value = v
}

func (o TariffParameterDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TariffParameterDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	toSerialize["value"] = o.Value
	return toSerialize, nil
}

func (o *TariffParameterDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
		"value",
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

	varTariffParameterDTO := _TariffParameterDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varTariffParameterDTO)

	if err != nil {
		return err
	}

	*o = TariffParameterDTO(varTariffParameterDTO)

	return err
}

type NullableTariffParameterDTO struct {
	value *TariffParameterDTO
	isSet bool
}

func (v NullableTariffParameterDTO) Get() *TariffParameterDTO {
	return v.value
}

func (v *NullableTariffParameterDTO) Set(val *TariffParameterDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableTariffParameterDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableTariffParameterDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTariffParameterDTO(val *TariffParameterDTO) *NullableTariffParameterDTO {
	return &NullableTariffParameterDTO{value: val, isSet: true}
}

func (v NullableTariffParameterDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTariffParameterDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


