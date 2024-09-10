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

// checks if the GetCategoriesMaxSaleQuantumDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetCategoriesMaxSaleQuantumDTO{}

// GetCategoriesMaxSaleQuantumDTO Категории и лимит на установку кванта и минимального количества товаров.
type GetCategoriesMaxSaleQuantumDTO struct {
	// Категории и лимит на установку кванта и минимального количества товаров.
	Results []MaxSaleQuantumDTO `json:"results"`
	// Ошибки, которые появились из-за переданных категорий.
	Errors []CategoryErrorDTO `json:"errors,omitempty"`
}

type _GetCategoriesMaxSaleQuantumDTO GetCategoriesMaxSaleQuantumDTO

// NewGetCategoriesMaxSaleQuantumDTO instantiates a new GetCategoriesMaxSaleQuantumDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetCategoriesMaxSaleQuantumDTO(results []MaxSaleQuantumDTO) *GetCategoriesMaxSaleQuantumDTO {
	this := GetCategoriesMaxSaleQuantumDTO{}
	this.Results = results
	return &this
}

// NewGetCategoriesMaxSaleQuantumDTOWithDefaults instantiates a new GetCategoriesMaxSaleQuantumDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetCategoriesMaxSaleQuantumDTOWithDefaults() *GetCategoriesMaxSaleQuantumDTO {
	this := GetCategoriesMaxSaleQuantumDTO{}
	return &this
}

// GetResults returns the Results field value
func (o *GetCategoriesMaxSaleQuantumDTO) GetResults() []MaxSaleQuantumDTO {
	if o == nil {
		var ret []MaxSaleQuantumDTO
		return ret
	}

	return o.Results
}

// GetResultsOk returns a tuple with the Results field value
// and a boolean to check if the value has been set.
func (o *GetCategoriesMaxSaleQuantumDTO) GetResultsOk() ([]MaxSaleQuantumDTO, bool) {
	if o == nil {
		return nil, false
	}
	return o.Results, true
}

// SetResults sets field value
func (o *GetCategoriesMaxSaleQuantumDTO) SetResults(v []MaxSaleQuantumDTO) {
	o.Results = v
}

// GetErrors returns the Errors field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetCategoriesMaxSaleQuantumDTO) GetErrors() []CategoryErrorDTO {
	if o == nil {
		var ret []CategoryErrorDTO
		return ret
	}
	return o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetCategoriesMaxSaleQuantumDTO) GetErrorsOk() ([]CategoryErrorDTO, bool) {
	if o == nil || IsNil(o.Errors) {
		return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *GetCategoriesMaxSaleQuantumDTO) HasErrors() bool {
	if o != nil && !IsNil(o.Errors) {
		return true
	}

	return false
}

// SetErrors gets a reference to the given []CategoryErrorDTO and assigns it to the Errors field.
func (o *GetCategoriesMaxSaleQuantumDTO) SetErrors(v []CategoryErrorDTO) {
	o.Errors = v
}

func (o GetCategoriesMaxSaleQuantumDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetCategoriesMaxSaleQuantumDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["results"] = o.Results
	if o.Errors != nil {
		toSerialize["errors"] = o.Errors
	}
	return toSerialize, nil
}

func (o *GetCategoriesMaxSaleQuantumDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"results",
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

	varGetCategoriesMaxSaleQuantumDTO := _GetCategoriesMaxSaleQuantumDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetCategoriesMaxSaleQuantumDTO)

	if err != nil {
		return err
	}

	*o = GetCategoriesMaxSaleQuantumDTO(varGetCategoriesMaxSaleQuantumDTO)

	return err
}

type NullableGetCategoriesMaxSaleQuantumDTO struct {
	value *GetCategoriesMaxSaleQuantumDTO
	isSet bool
}

func (v NullableGetCategoriesMaxSaleQuantumDTO) Get() *GetCategoriesMaxSaleQuantumDTO {
	return v.value
}

func (v *NullableGetCategoriesMaxSaleQuantumDTO) Set(val *GetCategoriesMaxSaleQuantumDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableGetCategoriesMaxSaleQuantumDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableGetCategoriesMaxSaleQuantumDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetCategoriesMaxSaleQuantumDTO(val *GetCategoriesMaxSaleQuantumDTO) *NullableGetCategoriesMaxSaleQuantumDTO {
	return &NullableGetCategoriesMaxSaleQuantumDTO{value: val, isSet: true}
}

func (v NullableGetCategoriesMaxSaleQuantumDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetCategoriesMaxSaleQuantumDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


