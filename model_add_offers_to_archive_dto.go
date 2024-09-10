/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
)

// checks if the AddOffersToArchiveDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AddOffersToArchiveDTO{}

// AddOffersToArchiveDTO Товары, которые не удалось поместить в архив.
type AddOffersToArchiveDTO struct {
	// Список товаров, которые не удалось поместить в архив.
	NotArchivedOffers []AddOffersToArchiveErrorDTO `json:"notArchivedOffers,omitempty"`
}

// NewAddOffersToArchiveDTO instantiates a new AddOffersToArchiveDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddOffersToArchiveDTO() *AddOffersToArchiveDTO {
	this := AddOffersToArchiveDTO{}
	return &this
}

// NewAddOffersToArchiveDTOWithDefaults instantiates a new AddOffersToArchiveDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddOffersToArchiveDTOWithDefaults() *AddOffersToArchiveDTO {
	this := AddOffersToArchiveDTO{}
	return &this
}

// GetNotArchivedOffers returns the NotArchivedOffers field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *AddOffersToArchiveDTO) GetNotArchivedOffers() []AddOffersToArchiveErrorDTO {
	if o == nil {
		var ret []AddOffersToArchiveErrorDTO
		return ret
	}
	return o.NotArchivedOffers
}

// GetNotArchivedOffersOk returns a tuple with the NotArchivedOffers field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *AddOffersToArchiveDTO) GetNotArchivedOffersOk() ([]AddOffersToArchiveErrorDTO, bool) {
	if o == nil || IsNil(o.NotArchivedOffers) {
		return nil, false
	}
	return o.NotArchivedOffers, true
}

// HasNotArchivedOffers returns a boolean if a field has been set.
func (o *AddOffersToArchiveDTO) HasNotArchivedOffers() bool {
	if o != nil && !IsNil(o.NotArchivedOffers) {
		return true
	}

	return false
}

// SetNotArchivedOffers gets a reference to the given []AddOffersToArchiveErrorDTO and assigns it to the NotArchivedOffers field.
func (o *AddOffersToArchiveDTO) SetNotArchivedOffers(v []AddOffersToArchiveErrorDTO) {
	o.NotArchivedOffers = v
}

func (o AddOffersToArchiveDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AddOffersToArchiveDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.NotArchivedOffers != nil {
		toSerialize["notArchivedOffers"] = o.NotArchivedOffers
	}
	return toSerialize, nil
}

type NullableAddOffersToArchiveDTO struct {
	value *AddOffersToArchiveDTO
	isSet bool
}

func (v NullableAddOffersToArchiveDTO) Get() *AddOffersToArchiveDTO {
	return v.value
}

func (v *NullableAddOffersToArchiveDTO) Set(val *AddOffersToArchiveDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableAddOffersToArchiveDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableAddOffersToArchiveDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddOffersToArchiveDTO(val *AddOffersToArchiveDTO) *NullableAddOffersToArchiveDTO {
	return &NullableAddOffersToArchiveDTO{value: val, isSet: true}
}

func (v NullableAddOffersToArchiveDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddOffersToArchiveDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


