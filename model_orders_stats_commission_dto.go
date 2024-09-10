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

// checks if the OrdersStatsCommissionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrdersStatsCommissionDTO{}

// OrdersStatsCommissionDTO Информация о стоимости услуг.
type OrdersStatsCommissionDTO struct {
	Type *OrdersStatsCommissionType `json:"type,omitempty"`
	// Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	Actual *float32 `json:"actual,omitempty"`
}

// NewOrdersStatsCommissionDTO instantiates a new OrdersStatsCommissionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrdersStatsCommissionDTO() *OrdersStatsCommissionDTO {
	this := OrdersStatsCommissionDTO{}
	return &this
}

// NewOrdersStatsCommissionDTOWithDefaults instantiates a new OrdersStatsCommissionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrdersStatsCommissionDTOWithDefaults() *OrdersStatsCommissionDTO {
	this := OrdersStatsCommissionDTO{}
	return &this
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *OrdersStatsCommissionDTO) GetType() OrdersStatsCommissionType {
	if o == nil || IsNil(o.Type) {
		var ret OrdersStatsCommissionType
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrdersStatsCommissionDTO) GetTypeOk() (*OrdersStatsCommissionType, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *OrdersStatsCommissionDTO) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given OrdersStatsCommissionType and assigns it to the Type field.
func (o *OrdersStatsCommissionDTO) SetType(v OrdersStatsCommissionType) {
	o.Type = &v
}

// GetActual returns the Actual field value if set, zero value otherwise.
func (o *OrdersStatsCommissionDTO) GetActual() float32 {
	if o == nil || IsNil(o.Actual) {
		var ret float32
		return ret
	}
	return *o.Actual
}

// GetActualOk returns a tuple with the Actual field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrdersStatsCommissionDTO) GetActualOk() (*float32, bool) {
	if o == nil || IsNil(o.Actual) {
		return nil, false
	}
	return o.Actual, true
}

// HasActual returns a boolean if a field has been set.
func (o *OrdersStatsCommissionDTO) HasActual() bool {
	if o != nil && !IsNil(o.Actual) {
		return true
	}

	return false
}

// SetActual gets a reference to the given float32 and assigns it to the Actual field.
func (o *OrdersStatsCommissionDTO) SetActual(v float32) {
	o.Actual = &v
}

func (o OrdersStatsCommissionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrdersStatsCommissionDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Actual) {
		toSerialize["actual"] = o.Actual
	}
	return toSerialize, nil
}

type NullableOrdersStatsCommissionDTO struct {
	value *OrdersStatsCommissionDTO
	isSet bool
}

func (v NullableOrdersStatsCommissionDTO) Get() *OrdersStatsCommissionDTO {
	return v.value
}

func (v *NullableOrdersStatsCommissionDTO) Set(val *OrdersStatsCommissionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOrdersStatsCommissionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOrdersStatsCommissionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrdersStatsCommissionDTO(val *OrdersStatsCommissionDTO) *NullableOrdersStatsCommissionDTO {
	return &NullableOrdersStatsCommissionDTO{value: val, isSet: true}
}

func (v NullableOrdersStatsCommissionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrdersStatsCommissionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


