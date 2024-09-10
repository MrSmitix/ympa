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

// checks if the CalculateTariffsResponseDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CalculateTariffsResponseDTO{}

// CalculateTariffsResponseDTO Расчет стоимости услуг.
type CalculateTariffsResponseDTO struct {
	// Стоимость услуг.
	Offers []CalculateTariffsOfferInfoDTO `json:"offers"`
}

type _CalculateTariffsResponseDTO CalculateTariffsResponseDTO

// NewCalculateTariffsResponseDTO instantiates a new CalculateTariffsResponseDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCalculateTariffsResponseDTO(offers []CalculateTariffsOfferInfoDTO) *CalculateTariffsResponseDTO {
	this := CalculateTariffsResponseDTO{}
	this.Offers = offers
	return &this
}

// NewCalculateTariffsResponseDTOWithDefaults instantiates a new CalculateTariffsResponseDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCalculateTariffsResponseDTOWithDefaults() *CalculateTariffsResponseDTO {
	this := CalculateTariffsResponseDTO{}
	return &this
}

// GetOffers returns the Offers field value
func (o *CalculateTariffsResponseDTO) GetOffers() []CalculateTariffsOfferInfoDTO {
	if o == nil {
		var ret []CalculateTariffsOfferInfoDTO
		return ret
	}

	return o.Offers
}

// GetOffersOk returns a tuple with the Offers field value
// and a boolean to check if the value has been set.
func (o *CalculateTariffsResponseDTO) GetOffersOk() ([]CalculateTariffsOfferInfoDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Offers, true
}

// SetOffers sets field value
func (o *CalculateTariffsResponseDTO) SetOffers(v []CalculateTariffsOfferInfoDTO) {
	o.Offers = v
}

func (o CalculateTariffsResponseDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CalculateTariffsResponseDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offers"] = o.Offers
	return toSerialize, nil
}

func (o *CalculateTariffsResponseDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"offers",
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

	varCalculateTariffsResponseDTO := _CalculateTariffsResponseDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCalculateTariffsResponseDTO)

	if err != nil {
		return err
	}

	*o = CalculateTariffsResponseDTO(varCalculateTariffsResponseDTO)

	return err
}

type NullableCalculateTariffsResponseDTO struct {
	value *CalculateTariffsResponseDTO
	isSet bool
}

func (v NullableCalculateTariffsResponseDTO) Get() *CalculateTariffsResponseDTO {
	return v.value
}

func (v *NullableCalculateTariffsResponseDTO) Set(val *CalculateTariffsResponseDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCalculateTariffsResponseDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCalculateTariffsResponseDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCalculateTariffsResponseDTO(val *CalculateTariffsResponseDTO) *NullableCalculateTariffsResponseDTO {
	return &NullableCalculateTariffsResponseDTO{value: val, isSet: true}
}

func (v NullableCalculateTariffsResponseDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCalculateTariffsResponseDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


