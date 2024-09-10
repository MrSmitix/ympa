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

// checks if the GetPricesByOfferIdsRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetPricesByOfferIdsRequest{}

// GetPricesByOfferIdsRequest Запрос списка цен.
type GetPricesByOfferIdsRequest struct {
	// Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	OfferIds []string `json:"offerIds,omitempty"`
}

// NewGetPricesByOfferIdsRequest instantiates a new GetPricesByOfferIdsRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetPricesByOfferIdsRequest() *GetPricesByOfferIdsRequest {
	this := GetPricesByOfferIdsRequest{}
	return &this
}

// NewGetPricesByOfferIdsRequestWithDefaults instantiates a new GetPricesByOfferIdsRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetPricesByOfferIdsRequestWithDefaults() *GetPricesByOfferIdsRequest {
	this := GetPricesByOfferIdsRequest{}
	return &this
}

// GetOfferIds returns the OfferIds field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetPricesByOfferIdsRequest) GetOfferIds() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.OfferIds
}

// GetOfferIdsOk returns a tuple with the OfferIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetPricesByOfferIdsRequest) GetOfferIdsOk() ([]string, bool) {
	if o == nil || IsNil(o.OfferIds) {
		return nil, false
	}
	return o.OfferIds, true
}

// HasOfferIds returns a boolean if a field has been set.
func (o *GetPricesByOfferIdsRequest) HasOfferIds() bool {
	if o != nil && !IsNil(o.OfferIds) {
		return true
	}

	return false
}

// SetOfferIds gets a reference to the given []string and assigns it to the OfferIds field.
func (o *GetPricesByOfferIdsRequest) SetOfferIds(v []string) {
	o.OfferIds = v
}

func (o GetPricesByOfferIdsRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetPricesByOfferIdsRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.OfferIds != nil {
		toSerialize["offerIds"] = o.OfferIds
	}
	return toSerialize, nil
}

type NullableGetPricesByOfferIdsRequest struct {
	value *GetPricesByOfferIdsRequest
	isSet bool
}

func (v NullableGetPricesByOfferIdsRequest) Get() *GetPricesByOfferIdsRequest {
	return v.value
}

func (v *NullableGetPricesByOfferIdsRequest) Set(val *GetPricesByOfferIdsRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableGetPricesByOfferIdsRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableGetPricesByOfferIdsRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetPricesByOfferIdsRequest(val *GetPricesByOfferIdsRequest) *NullableGetPricesByOfferIdsRequest {
	return &NullableGetPricesByOfferIdsRequest{value: val, isSet: true}
}

func (v NullableGetPricesByOfferIdsRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetPricesByOfferIdsRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


