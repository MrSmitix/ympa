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

// checks if the CategoryDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CategoryDTO{}

// CategoryDTO Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
type CategoryDTO struct {
	// Идентификатор категории.
	Id int64 `json:"id"`
	// Название категории.
	Name string `json:"name"`
	// Дочерние категории.
	Children []CategoryDTO `json:"children,omitempty"`
}

type _CategoryDTO CategoryDTO

// NewCategoryDTO instantiates a new CategoryDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCategoryDTO(id int64, name string) *CategoryDTO {
	this := CategoryDTO{}
	this.Id = id
	this.Name = name
	return &this
}

// NewCategoryDTOWithDefaults instantiates a new CategoryDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCategoryDTOWithDefaults() *CategoryDTO {
	this := CategoryDTO{}
	return &this
}

// GetId returns the Id field value
func (o *CategoryDTO) GetId() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CategoryDTO) GetIdOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CategoryDTO) SetId(v int64) {
	o.Id = v
}

// GetName returns the Name field value
func (o *CategoryDTO) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CategoryDTO) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CategoryDTO) SetName(v string) {
	o.Name = v
}

// GetChildren returns the Children field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CategoryDTO) GetChildren() []CategoryDTO {
	if o == nil {
		var ret []CategoryDTO
		return ret
	}
	return o.Children
}

// GetChildrenOk returns a tuple with the Children field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CategoryDTO) GetChildrenOk() ([]CategoryDTO, bool) {
	if o == nil || IsNil(o.Children) {
		return nil, false
	}
	return o.Children, true
}

// HasChildren returns a boolean if a field has been set.
func (o *CategoryDTO) HasChildren() bool {
	if o != nil && !IsNil(o.Children) {
		return true
	}

	return false
}

// SetChildren gets a reference to the given []CategoryDTO and assigns it to the Children field.
func (o *CategoryDTO) SetChildren(v []CategoryDTO) {
	o.Children = v
}

func (o CategoryDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CategoryDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["name"] = o.Name
	if o.Children != nil {
		toSerialize["children"] = o.Children
	}
	return toSerialize, nil
}

func (o *CategoryDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"name",
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

	varCategoryDTO := _CategoryDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCategoryDTO)

	if err != nil {
		return err
	}

	*o = CategoryDTO(varCategoryDTO)

	return err
}

type NullableCategoryDTO struct {
	value *CategoryDTO
	isSet bool
}

func (v NullableCategoryDTO) Get() *CategoryDTO {
	return v.value
}

func (v *NullableCategoryDTO) Set(val *CategoryDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCategoryDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCategoryDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCategoryDTO(val *CategoryDTO) *NullableCategoryDTO {
	return &NullableCategoryDTO{value: val, isSet: true}
}

func (v NullableCategoryDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCategoryDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


