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

// checks if the GetFeedResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetFeedResponse{}

// GetFeedResponse Ответ на запрос информации о прайс-листе.
type GetFeedResponse struct {
	Feed *FeedDTO `json:"feed,omitempty"`
}

// NewGetFeedResponse instantiates a new GetFeedResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetFeedResponse() *GetFeedResponse {
	this := GetFeedResponse{}
	return &this
}

// NewGetFeedResponseWithDefaults instantiates a new GetFeedResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetFeedResponseWithDefaults() *GetFeedResponse {
	this := GetFeedResponse{}
	return &this
}

// GetFeed returns the Feed field value if set, zero value otherwise.
func (o *GetFeedResponse) GetFeed() FeedDTO {
	if o == nil || IsNil(o.Feed) {
		var ret FeedDTO
		return ret
	}
	return *o.Feed
}

// GetFeedOk returns a tuple with the Feed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetFeedResponse) GetFeedOk() (*FeedDTO, bool) {
	if o == nil || IsNil(o.Feed) {
		return nil, false
	}
	return o.Feed, true
}

// HasFeed returns a boolean if a field has been set.
func (o *GetFeedResponse) HasFeed() bool {
	if o != nil && !IsNil(o.Feed) {
		return true
	}

	return false
}

// SetFeed gets a reference to the given FeedDTO and assigns it to the Feed field.
func (o *GetFeedResponse) SetFeed(v FeedDTO) {
	o.Feed = &v
}

func (o GetFeedResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetFeedResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Feed) {
		toSerialize["feed"] = o.Feed
	}
	return toSerialize, nil
}

type NullableGetFeedResponse struct {
	value *GetFeedResponse
	isSet bool
}

func (v NullableGetFeedResponse) Get() *GetFeedResponse {
	return v.value
}

func (v *NullableGetFeedResponse) Set(val *GetFeedResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetFeedResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetFeedResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetFeedResponse(val *GetFeedResponse) *NullableGetFeedResponse {
	return &NullableGetFeedResponse{value: val, isSet: true}
}

func (v NullableGetFeedResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetFeedResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


