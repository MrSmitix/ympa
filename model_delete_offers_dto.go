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

// checks if the DeleteOffersDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DeleteOffersDTO{}

// DeleteOffersDTO Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
type DeleteOffersDTO struct {
	// Список SKU товаров, которые не удалось удалить.
	NotDeletedOfferIds []string `json:"notDeletedOfferIds,omitempty"`
}

// NewDeleteOffersDTO instantiates a new DeleteOffersDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeleteOffersDTO() *DeleteOffersDTO {
	this := DeleteOffersDTO{}
	return &this
}

// NewDeleteOffersDTOWithDefaults instantiates a new DeleteOffersDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeleteOffersDTOWithDefaults() *DeleteOffersDTO {
	this := DeleteOffersDTO{}
	return &this
}

// GetNotDeletedOfferIds returns the NotDeletedOfferIds field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeleteOffersDTO) GetNotDeletedOfferIds() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.NotDeletedOfferIds
}

// GetNotDeletedOfferIdsOk returns a tuple with the NotDeletedOfferIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeleteOffersDTO) GetNotDeletedOfferIdsOk() ([]string, bool) {
	if o == nil || IsNil(o.NotDeletedOfferIds) {
		return nil, false
	}
	return o.NotDeletedOfferIds, true
}

// HasNotDeletedOfferIds returns a boolean if a field has been set.
func (o *DeleteOffersDTO) HasNotDeletedOfferIds() bool {
	if o != nil && !IsNil(o.NotDeletedOfferIds) {
		return true
	}

	return false
}

// SetNotDeletedOfferIds gets a reference to the given []string and assigns it to the NotDeletedOfferIds field.
func (o *DeleteOffersDTO) SetNotDeletedOfferIds(v []string) {
	o.NotDeletedOfferIds = v
}

func (o DeleteOffersDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DeleteOffersDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.NotDeletedOfferIds != nil {
		toSerialize["notDeletedOfferIds"] = o.NotDeletedOfferIds
	}
	return toSerialize, nil
}

type NullableDeleteOffersDTO struct {
	value *DeleteOffersDTO
	isSet bool
}

func (v NullableDeleteOffersDTO) Get() *DeleteOffersDTO {
	return v.value
}

func (v *NullableDeleteOffersDTO) Set(val *DeleteOffersDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableDeleteOffersDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableDeleteOffersDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeleteOffersDTO(val *DeleteOffersDTO) *NullableDeleteOffersDTO {
	return &NullableDeleteOffersDTO{value: val, isSet: true}
}

func (v NullableDeleteOffersDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeleteOffersDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


