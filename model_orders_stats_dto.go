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

// checks if the OrdersStatsDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrdersStatsDTO{}

// OrdersStatsDTO Информация по заказам.
type OrdersStatsDTO struct {
	// Список заказов.
	Orders []OrdersStatsOrderDTO `json:"orders"`
	Paging *ForwardScrollingPagerDTO `json:"paging,omitempty"`
}

type _OrdersStatsDTO OrdersStatsDTO

// NewOrdersStatsDTO instantiates a new OrdersStatsDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrdersStatsDTO(orders []OrdersStatsOrderDTO) *OrdersStatsDTO {
	this := OrdersStatsDTO{}
	this.Orders = orders
	return &this
}

// NewOrdersStatsDTOWithDefaults instantiates a new OrdersStatsDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrdersStatsDTOWithDefaults() *OrdersStatsDTO {
	this := OrdersStatsDTO{}
	return &this
}

// GetOrders returns the Orders field value
func (o *OrdersStatsDTO) GetOrders() []OrdersStatsOrderDTO {
	if o == nil {
		var ret []OrdersStatsOrderDTO
		return ret
	}

	return o.Orders
}

// GetOrdersOk returns a tuple with the Orders field value
// and a boolean to check if the value has been set.
func (o *OrdersStatsDTO) GetOrdersOk() ([]OrdersStatsOrderDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Orders, true
}

// SetOrders sets field value
func (o *OrdersStatsDTO) SetOrders(v []OrdersStatsOrderDTO) {
	o.Orders = v
}

// GetPaging returns the Paging field value if set, zero value otherwise.
func (o *OrdersStatsDTO) GetPaging() ForwardScrollingPagerDTO {
	if o == nil || IsNil(o.Paging) {
		var ret ForwardScrollingPagerDTO
		return ret
	}
	return *o.Paging
}

// GetPagingOk returns a tuple with the Paging field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrdersStatsDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool) {
	if o == nil || IsNil(o.Paging) {
		return nil, false
	}
	return o.Paging, true
}

// HasPaging returns a boolean if a field has been set.
func (o *OrdersStatsDTO) HasPaging() bool {
	if o != nil && !IsNil(o.Paging) {
		return true
	}

	return false
}

// SetPaging gets a reference to the given ForwardScrollingPagerDTO and assigns it to the Paging field.
func (o *OrdersStatsDTO) SetPaging(v ForwardScrollingPagerDTO) {
	o.Paging = &v
}

func (o OrdersStatsDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrdersStatsDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["orders"] = o.Orders
	if !IsNil(o.Paging) {
		toSerialize["paging"] = o.Paging
	}
	return toSerialize, nil
}

func (o *OrdersStatsDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"orders",
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

	varOrdersStatsDTO := _OrdersStatsDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varOrdersStatsDTO)

	if err != nil {
		return err
	}

	*o = OrdersStatsDTO(varOrdersStatsDTO)

	return err
}

type NullableOrdersStatsDTO struct {
	value *OrdersStatsDTO
	isSet bool
}

func (v NullableOrdersStatsDTO) Get() *OrdersStatsDTO {
	return v.value
}

func (v *NullableOrdersStatsDTO) Set(val *OrdersStatsDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOrdersStatsDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOrdersStatsDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrdersStatsDTO(val *OrdersStatsDTO) *NullableOrdersStatsDTO {
	return &NullableOrdersStatsDTO{value: val, isSet: true}
}

func (v NullableOrdersStatsDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrdersStatsDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


