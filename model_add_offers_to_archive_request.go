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

// checks if the AddOffersToArchiveRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AddOffersToArchiveRequest{}

// AddOffersToArchiveRequest Товары, которые нужно поместить в архив. 
type AddOffersToArchiveRequest struct {
	// Список товаров, которые нужно поместить в архив.
	OfferIds []string `json:"offerIds"`
}

type _AddOffersToArchiveRequest AddOffersToArchiveRequest

// NewAddOffersToArchiveRequest instantiates a new AddOffersToArchiveRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddOffersToArchiveRequest(offerIds []string) *AddOffersToArchiveRequest {
	this := AddOffersToArchiveRequest{}
	this.OfferIds = offerIds
	return &this
}

// NewAddOffersToArchiveRequestWithDefaults instantiates a new AddOffersToArchiveRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddOffersToArchiveRequestWithDefaults() *AddOffersToArchiveRequest {
	this := AddOffersToArchiveRequest{}
	return &this
}

// GetOfferIds returns the OfferIds field value
func (o *AddOffersToArchiveRequest) GetOfferIds() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.OfferIds
}

// GetOfferIdsOk returns a tuple with the OfferIds field value
// and a boolean to check if the value has been set.
func (o *AddOffersToArchiveRequest) GetOfferIdsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.OfferIds, true
}

// SetOfferIds sets field value
func (o *AddOffersToArchiveRequest) SetOfferIds(v []string) {
	o.OfferIds = v
}

func (o AddOffersToArchiveRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AddOffersToArchiveRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offerIds"] = o.OfferIds
	return toSerialize, nil
}

func (o *AddOffersToArchiveRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"offerIds",
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

	varAddOffersToArchiveRequest := _AddOffersToArchiveRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAddOffersToArchiveRequest)

	if err != nil {
		return err
	}

	*o = AddOffersToArchiveRequest(varAddOffersToArchiveRequest)

	return err
}

type NullableAddOffersToArchiveRequest struct {
	value *AddOffersToArchiveRequest
	isSet bool
}

func (v NullableAddOffersToArchiveRequest) Get() *AddOffersToArchiveRequest {
	return v.value
}

func (v *NullableAddOffersToArchiveRequest) Set(val *AddOffersToArchiveRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAddOffersToArchiveRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAddOffersToArchiveRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddOffersToArchiveRequest(val *AddOffersToArchiveRequest) *NullableAddOffersToArchiveRequest {
	return &NullableAddOffersToArchiveRequest{value: val, isSet: true}
}

func (v NullableAddOffersToArchiveRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddOffersToArchiveRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


