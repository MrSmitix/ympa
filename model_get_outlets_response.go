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

// checks if the GetOutletsResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetOutletsResponse{}

// GetOutletsResponse Ответ на запрос информации о точках продаж.
type GetOutletsResponse struct {
	// Информация о точках продаж.
	Outlets []FullOutletDTO `json:"outlets"`
	Paging *ScrollingPagerDTO `json:"paging,omitempty"`
	Pager *FlippingPagerDTO `json:"pager,omitempty"`
}

type _GetOutletsResponse GetOutletsResponse

// NewGetOutletsResponse instantiates a new GetOutletsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetOutletsResponse(outlets []FullOutletDTO) *GetOutletsResponse {
	this := GetOutletsResponse{}
	this.Outlets = outlets
	return &this
}

// NewGetOutletsResponseWithDefaults instantiates a new GetOutletsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetOutletsResponseWithDefaults() *GetOutletsResponse {
	this := GetOutletsResponse{}
	return &this
}

// GetOutlets returns the Outlets field value
func (o *GetOutletsResponse) GetOutlets() []FullOutletDTO {
	if o == nil {
		var ret []FullOutletDTO
		return ret
	}

	return o.Outlets
}

// GetOutletsOk returns a tuple with the Outlets field value
// and a boolean to check if the value has been set.
func (o *GetOutletsResponse) GetOutletsOk() ([]FullOutletDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Outlets, true
}

// SetOutlets sets field value
func (o *GetOutletsResponse) SetOutlets(v []FullOutletDTO) {
	o.Outlets = v
}

// GetPaging returns the Paging field value if set, zero value otherwise.
func (o *GetOutletsResponse) GetPaging() ScrollingPagerDTO {
	if o == nil || IsNil(o.Paging) {
		var ret ScrollingPagerDTO
		return ret
	}
	return *o.Paging
}

// GetPagingOk returns a tuple with the Paging field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetOutletsResponse) GetPagingOk() (*ScrollingPagerDTO, bool) {
	if o == nil || IsNil(o.Paging) {
		return nil, false
	}
	return o.Paging, true
}

// HasPaging returns a boolean if a field has been set.
func (o *GetOutletsResponse) HasPaging() bool {
	if o != nil && !IsNil(o.Paging) {
		return true
	}

	return false
}

// SetPaging gets a reference to the given ScrollingPagerDTO and assigns it to the Paging field.
func (o *GetOutletsResponse) SetPaging(v ScrollingPagerDTO) {
	o.Paging = &v
}

// GetPager returns the Pager field value if set, zero value otherwise.
func (o *GetOutletsResponse) GetPager() FlippingPagerDTO {
	if o == nil || IsNil(o.Pager) {
		var ret FlippingPagerDTO
		return ret
	}
	return *o.Pager
}

// GetPagerOk returns a tuple with the Pager field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetOutletsResponse) GetPagerOk() (*FlippingPagerDTO, bool) {
	if o == nil || IsNil(o.Pager) {
		return nil, false
	}
	return o.Pager, true
}

// HasPager returns a boolean if a field has been set.
func (o *GetOutletsResponse) HasPager() bool {
	if o != nil && !IsNil(o.Pager) {
		return true
	}

	return false
}

// SetPager gets a reference to the given FlippingPagerDTO and assigns it to the Pager field.
func (o *GetOutletsResponse) SetPager(v FlippingPagerDTO) {
	o.Pager = &v
}

func (o GetOutletsResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetOutletsResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["outlets"] = o.Outlets
	if !IsNil(o.Paging) {
		toSerialize["paging"] = o.Paging
	}
	if !IsNil(o.Pager) {
		toSerialize["pager"] = o.Pager
	}
	return toSerialize, nil
}

func (o *GetOutletsResponse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"outlets",
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

	varGetOutletsResponse := _GetOutletsResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetOutletsResponse)

	if err != nil {
		return err
	}

	*o = GetOutletsResponse(varGetOutletsResponse)

	return err
}

type NullableGetOutletsResponse struct {
	value *GetOutletsResponse
	isSet bool
}

func (v NullableGetOutletsResponse) Get() *GetOutletsResponse {
	return v.value
}

func (v *NullableGetOutletsResponse) Set(val *GetOutletsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetOutletsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetOutletsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetOutletsResponse(val *GetOutletsResponse) *NullableGetOutletsResponse {
	return &NullableGetOutletsResponse{value: val, isSet: true}
}

func (v NullableGetOutletsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetOutletsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


