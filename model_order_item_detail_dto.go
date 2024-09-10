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

// checks if the OrderItemDetailDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrderItemDetailDTO{}

// OrderItemDetailDTO Детали по товару в заказе.
type OrderItemDetailDTO struct {
	// Количество единиц товара.
	ItemCount *int64 `json:"itemCount,omitempty"`
	ItemStatus *OrderItemStatusType `json:"itemStatus,omitempty"`
	// Формат даты: `ДД-ММ-ГГГГ`. 
	UpdateDate *string `json:"updateDate,omitempty"`
}

// NewOrderItemDetailDTO instantiates a new OrderItemDetailDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrderItemDetailDTO() *OrderItemDetailDTO {
	this := OrderItemDetailDTO{}
	return &this
}

// NewOrderItemDetailDTOWithDefaults instantiates a new OrderItemDetailDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrderItemDetailDTOWithDefaults() *OrderItemDetailDTO {
	this := OrderItemDetailDTO{}
	return &this
}

// GetItemCount returns the ItemCount field value if set, zero value otherwise.
func (o *OrderItemDetailDTO) GetItemCount() int64 {
	if o == nil || IsNil(o.ItemCount) {
		var ret int64
		return ret
	}
	return *o.ItemCount
}

// GetItemCountOk returns a tuple with the ItemCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderItemDetailDTO) GetItemCountOk() (*int64, bool) {
	if o == nil || IsNil(o.ItemCount) {
		return nil, false
	}
	return o.ItemCount, true
}

// HasItemCount returns a boolean if a field has been set.
func (o *OrderItemDetailDTO) HasItemCount() bool {
	if o != nil && !IsNil(o.ItemCount) {
		return true
	}

	return false
}

// SetItemCount gets a reference to the given int64 and assigns it to the ItemCount field.
func (o *OrderItemDetailDTO) SetItemCount(v int64) {
	o.ItemCount = &v
}

// GetItemStatus returns the ItemStatus field value if set, zero value otherwise.
func (o *OrderItemDetailDTO) GetItemStatus() OrderItemStatusType {
	if o == nil || IsNil(o.ItemStatus) {
		var ret OrderItemStatusType
		return ret
	}
	return *o.ItemStatus
}

// GetItemStatusOk returns a tuple with the ItemStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderItemDetailDTO) GetItemStatusOk() (*OrderItemStatusType, bool) {
	if o == nil || IsNil(o.ItemStatus) {
		return nil, false
	}
	return o.ItemStatus, true
}

// HasItemStatus returns a boolean if a field has been set.
func (o *OrderItemDetailDTO) HasItemStatus() bool {
	if o != nil && !IsNil(o.ItemStatus) {
		return true
	}

	return false
}

// SetItemStatus gets a reference to the given OrderItemStatusType and assigns it to the ItemStatus field.
func (o *OrderItemDetailDTO) SetItemStatus(v OrderItemStatusType) {
	o.ItemStatus = &v
}

// GetUpdateDate returns the UpdateDate field value if set, zero value otherwise.
func (o *OrderItemDetailDTO) GetUpdateDate() string {
	if o == nil || IsNil(o.UpdateDate) {
		var ret string
		return ret
	}
	return *o.UpdateDate
}

// GetUpdateDateOk returns a tuple with the UpdateDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderItemDetailDTO) GetUpdateDateOk() (*string, bool) {
	if o == nil || IsNil(o.UpdateDate) {
		return nil, false
	}
	return o.UpdateDate, true
}

// HasUpdateDate returns a boolean if a field has been set.
func (o *OrderItemDetailDTO) HasUpdateDate() bool {
	if o != nil && !IsNil(o.UpdateDate) {
		return true
	}

	return false
}

// SetUpdateDate gets a reference to the given string and assigns it to the UpdateDate field.
func (o *OrderItemDetailDTO) SetUpdateDate(v string) {
	o.UpdateDate = &v
}

func (o OrderItemDetailDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrderItemDetailDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ItemCount) {
		toSerialize["itemCount"] = o.ItemCount
	}
	if !IsNil(o.ItemStatus) {
		toSerialize["itemStatus"] = o.ItemStatus
	}
	if !IsNil(o.UpdateDate) {
		toSerialize["updateDate"] = o.UpdateDate
	}
	return toSerialize, nil
}

type NullableOrderItemDetailDTO struct {
	value *OrderItemDetailDTO
	isSet bool
}

func (v NullableOrderItemDetailDTO) Get() *OrderItemDetailDTO {
	return v.value
}

func (v *NullableOrderItemDetailDTO) Set(val *OrderItemDetailDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOrderItemDetailDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOrderItemDetailDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrderItemDetailDTO(val *OrderItemDetailDTO) *NullableOrderItemDetailDTO {
	return &NullableOrderItemDetailDTO{value: val, isSet: true}
}

func (v NullableOrderItemDetailDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrderItemDetailDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


