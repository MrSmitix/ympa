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

// checks if the OfferPriceListResponseDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OfferPriceListResponseDTO{}

// OfferPriceListResponseDTO Список цен на товары.
type OfferPriceListResponseDTO struct {
	// Страница списка.
	Offers []OfferPriceResponseDTO `json:"offers"`
	Paging *ScrollingPagerDTO `json:"paging,omitempty"`
	// Количество всех цен магазина, измененных через API.
	Total *int32 `json:"total,omitempty"`
}

type _OfferPriceListResponseDTO OfferPriceListResponseDTO

// NewOfferPriceListResponseDTO instantiates a new OfferPriceListResponseDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOfferPriceListResponseDTO(offers []OfferPriceResponseDTO) *OfferPriceListResponseDTO {
	this := OfferPriceListResponseDTO{}
	this.Offers = offers
	return &this
}

// NewOfferPriceListResponseDTOWithDefaults instantiates a new OfferPriceListResponseDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOfferPriceListResponseDTOWithDefaults() *OfferPriceListResponseDTO {
	this := OfferPriceListResponseDTO{}
	return &this
}

// GetOffers returns the Offers field value
func (o *OfferPriceListResponseDTO) GetOffers() []OfferPriceResponseDTO {
	if o == nil {
		var ret []OfferPriceResponseDTO
		return ret
	}

	return o.Offers
}

// GetOffersOk returns a tuple with the Offers field value
// and a boolean to check if the value has been set.
func (o *OfferPriceListResponseDTO) GetOffersOk() ([]OfferPriceResponseDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Offers, true
}

// SetOffers sets field value
func (o *OfferPriceListResponseDTO) SetOffers(v []OfferPriceResponseDTO) {
	o.Offers = v
}

// GetPaging returns the Paging field value if set, zero value otherwise.
func (o *OfferPriceListResponseDTO) GetPaging() ScrollingPagerDTO {
	if o == nil || IsNil(o.Paging) {
		var ret ScrollingPagerDTO
		return ret
	}
	return *o.Paging
}

// GetPagingOk returns a tuple with the Paging field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferPriceListResponseDTO) GetPagingOk() (*ScrollingPagerDTO, bool) {
	if o == nil || IsNil(o.Paging) {
		return nil, false
	}
	return o.Paging, true
}

// HasPaging returns a boolean if a field has been set.
func (o *OfferPriceListResponseDTO) HasPaging() bool {
	if o != nil && !IsNil(o.Paging) {
		return true
	}

	return false
}

// SetPaging gets a reference to the given ScrollingPagerDTO and assigns it to the Paging field.
func (o *OfferPriceListResponseDTO) SetPaging(v ScrollingPagerDTO) {
	o.Paging = &v
}

// GetTotal returns the Total field value if set, zero value otherwise.
func (o *OfferPriceListResponseDTO) GetTotal() int32 {
	if o == nil || IsNil(o.Total) {
		var ret int32
		return ret
	}
	return *o.Total
}

// GetTotalOk returns a tuple with the Total field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferPriceListResponseDTO) GetTotalOk() (*int32, bool) {
	if o == nil || IsNil(o.Total) {
		return nil, false
	}
	return o.Total, true
}

// HasTotal returns a boolean if a field has been set.
func (o *OfferPriceListResponseDTO) HasTotal() bool {
	if o != nil && !IsNil(o.Total) {
		return true
	}

	return false
}

// SetTotal gets a reference to the given int32 and assigns it to the Total field.
func (o *OfferPriceListResponseDTO) SetTotal(v int32) {
	o.Total = &v
}

func (o OfferPriceListResponseDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OfferPriceListResponseDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offers"] = o.Offers
	if !IsNil(o.Paging) {
		toSerialize["paging"] = o.Paging
	}
	if !IsNil(o.Total) {
		toSerialize["total"] = o.Total
	}
	return toSerialize, nil
}

func (o *OfferPriceListResponseDTO) UnmarshalJSON(data []byte) (err error) {
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

	varOfferPriceListResponseDTO := _OfferPriceListResponseDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varOfferPriceListResponseDTO)

	if err != nil {
		return err
	}

	*o = OfferPriceListResponseDTO(varOfferPriceListResponseDTO)

	return err
}

type NullableOfferPriceListResponseDTO struct {
	value *OfferPriceListResponseDTO
	isSet bool
}

func (v NullableOfferPriceListResponseDTO) Get() *OfferPriceListResponseDTO {
	return v.value
}

func (v *NullableOfferPriceListResponseDTO) Set(val *OfferPriceListResponseDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOfferPriceListResponseDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOfferPriceListResponseDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOfferPriceListResponseDTO(val *OfferPriceListResponseDTO) *NullableOfferPriceListResponseDTO {
	return &NullableOfferPriceListResponseDTO{value: val, isSet: true}
}

func (v NullableOfferPriceListResponseDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOfferPriceListResponseDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


