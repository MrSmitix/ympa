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

// checks if the WarehouseGroupDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &WarehouseGroupDTO{}

// WarehouseGroupDTO Информация о группе складов.
type WarehouseGroupDTO struct {
	// Название группы складов.
	Name string `json:"name"`
	MainWarehouse WarehouseDTO `json:"mainWarehouse"`
	// Список складов, входящих в группу.
	Warehouses []WarehouseDTO `json:"warehouses"`
}

type _WarehouseGroupDTO WarehouseGroupDTO

// NewWarehouseGroupDTO instantiates a new WarehouseGroupDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewWarehouseGroupDTO(name string, mainWarehouse WarehouseDTO, warehouses []WarehouseDTO) *WarehouseGroupDTO {
	this := WarehouseGroupDTO{}
	this.Name = name
	this.MainWarehouse = mainWarehouse
	this.Warehouses = warehouses
	return &this
}

// NewWarehouseGroupDTOWithDefaults instantiates a new WarehouseGroupDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewWarehouseGroupDTOWithDefaults() *WarehouseGroupDTO {
	this := WarehouseGroupDTO{}
	return &this
}

// GetName returns the Name field value
func (o *WarehouseGroupDTO) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *WarehouseGroupDTO) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *WarehouseGroupDTO) SetName(v string) {
	o.Name = v
}

// GetMainWarehouse returns the MainWarehouse field value
func (o *WarehouseGroupDTO) GetMainWarehouse() WarehouseDTO {
	if o == nil {
		var ret WarehouseDTO
		return ret
	}

	return o.MainWarehouse
}

// GetMainWarehouseOk returns a tuple with the MainWarehouse field value
// and a boolean to check if the value has been set.
func (o *WarehouseGroupDTO) GetMainWarehouseOk() (*WarehouseDTO, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MainWarehouse, true
}

// SetMainWarehouse sets field value
func (o *WarehouseGroupDTO) SetMainWarehouse(v WarehouseDTO) {
	o.MainWarehouse = v
}

// GetWarehouses returns the Warehouses field value
func (o *WarehouseGroupDTO) GetWarehouses() []WarehouseDTO {
	if o == nil {
		var ret []WarehouseDTO
		return ret
	}

	return o.Warehouses
}

// GetWarehousesOk returns a tuple with the Warehouses field value
// and a boolean to check if the value has been set.
func (o *WarehouseGroupDTO) GetWarehousesOk() ([]WarehouseDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Warehouses, true
}

// SetWarehouses sets field value
func (o *WarehouseGroupDTO) SetWarehouses(v []WarehouseDTO) {
	o.Warehouses = v
}

func (o WarehouseGroupDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o WarehouseGroupDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	toSerialize["mainWarehouse"] = o.MainWarehouse
	toSerialize["warehouses"] = o.Warehouses
	return toSerialize, nil
}

func (o *WarehouseGroupDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
		"mainWarehouse",
		"warehouses",
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

	varWarehouseGroupDTO := _WarehouseGroupDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varWarehouseGroupDTO)

	if err != nil {
		return err
	}

	*o = WarehouseGroupDTO(varWarehouseGroupDTO)

	return err
}

type NullableWarehouseGroupDTO struct {
	value *WarehouseGroupDTO
	isSet bool
}

func (v NullableWarehouseGroupDTO) Get() *WarehouseGroupDTO {
	return v.value
}

func (v *NullableWarehouseGroupDTO) Set(val *WarehouseGroupDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableWarehouseGroupDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableWarehouseGroupDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWarehouseGroupDTO(val *WarehouseGroupDTO) *NullableWarehouseGroupDTO {
	return &NullableWarehouseGroupDTO{value: val, isSet: true}
}

func (v NullableWarehouseGroupDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWarehouseGroupDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


