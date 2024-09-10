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

// checks if the GetBusinessSettingsResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetBusinessSettingsResponse{}

// GetBusinessSettingsResponse Ответ на запрос настроек кабинета.
type GetBusinessSettingsResponse struct {
	Status *ApiResponseStatusType `json:"status,omitempty"`
	Result *GetBusinessSettingsInfoDTO `json:"result,omitempty"`
}

// NewGetBusinessSettingsResponse instantiates a new GetBusinessSettingsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetBusinessSettingsResponse() *GetBusinessSettingsResponse {
	this := GetBusinessSettingsResponse{}
	return &this
}

// NewGetBusinessSettingsResponseWithDefaults instantiates a new GetBusinessSettingsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetBusinessSettingsResponseWithDefaults() *GetBusinessSettingsResponse {
	this := GetBusinessSettingsResponse{}
	return &this
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *GetBusinessSettingsResponse) GetStatus() ApiResponseStatusType {
	if o == nil || IsNil(o.Status) {
		var ret ApiResponseStatusType
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetBusinessSettingsResponse) GetStatusOk() (*ApiResponseStatusType, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *GetBusinessSettingsResponse) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given ApiResponseStatusType and assigns it to the Status field.
func (o *GetBusinessSettingsResponse) SetStatus(v ApiResponseStatusType) {
	o.Status = &v
}

// GetResult returns the Result field value if set, zero value otherwise.
func (o *GetBusinessSettingsResponse) GetResult() GetBusinessSettingsInfoDTO {
	if o == nil || IsNil(o.Result) {
		var ret GetBusinessSettingsInfoDTO
		return ret
	}
	return *o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetBusinessSettingsResponse) GetResultOk() (*GetBusinessSettingsInfoDTO, bool) {
	if o == nil || IsNil(o.Result) {
		return nil, false
	}
	return o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *GetBusinessSettingsResponse) HasResult() bool {
	if o != nil && !IsNil(o.Result) {
		return true
	}

	return false
}

// SetResult gets a reference to the given GetBusinessSettingsInfoDTO and assigns it to the Result field.
func (o *GetBusinessSettingsResponse) SetResult(v GetBusinessSettingsInfoDTO) {
	o.Result = &v
}

func (o GetBusinessSettingsResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetBusinessSettingsResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !IsNil(o.Result) {
		toSerialize["result"] = o.Result
	}
	return toSerialize, nil
}

type NullableGetBusinessSettingsResponse struct {
	value *GetBusinessSettingsResponse
	isSet bool
}

func (v NullableGetBusinessSettingsResponse) Get() *GetBusinessSettingsResponse {
	return v.value
}

func (v *NullableGetBusinessSettingsResponse) Set(val *GetBusinessSettingsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetBusinessSettingsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetBusinessSettingsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetBusinessSettingsResponse(val *GetBusinessSettingsResponse) *NullableGetBusinessSettingsResponse {
	return &NullableGetBusinessSettingsResponse{value: val, isSet: true}
}

func (v NullableGetBusinessSettingsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetBusinessSettingsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


