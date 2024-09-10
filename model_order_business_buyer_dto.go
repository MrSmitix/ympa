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

// checks if the OrderBusinessBuyerDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrderBusinessBuyerDTO{}

// OrderBusinessBuyerDTO Информация о покупателе. 
type OrderBusinessBuyerDTO struct {
	// ИНН.
	Inn *string `json:"inn,omitempty"`
	// КПП.
	Kpp *string `json:"kpp,omitempty"`
	// Наименование юридического лица.
	OrganizationName *string `json:"organizationName,omitempty"`
	// Юридический адрес.
	OrganizationJurAddress *string `json:"organizationJurAddress,omitempty"`
}

// NewOrderBusinessBuyerDTO instantiates a new OrderBusinessBuyerDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrderBusinessBuyerDTO() *OrderBusinessBuyerDTO {
	this := OrderBusinessBuyerDTO{}
	return &this
}

// NewOrderBusinessBuyerDTOWithDefaults instantiates a new OrderBusinessBuyerDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrderBusinessBuyerDTOWithDefaults() *OrderBusinessBuyerDTO {
	this := OrderBusinessBuyerDTO{}
	return &this
}

// GetInn returns the Inn field value if set, zero value otherwise.
func (o *OrderBusinessBuyerDTO) GetInn() string {
	if o == nil || IsNil(o.Inn) {
		var ret string
		return ret
	}
	return *o.Inn
}

// GetInnOk returns a tuple with the Inn field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderBusinessBuyerDTO) GetInnOk() (*string, bool) {
	if o == nil || IsNil(o.Inn) {
		return nil, false
	}
	return o.Inn, true
}

// HasInn returns a boolean if a field has been set.
func (o *OrderBusinessBuyerDTO) HasInn() bool {
	if o != nil && !IsNil(o.Inn) {
		return true
	}

	return false
}

// SetInn gets a reference to the given string and assigns it to the Inn field.
func (o *OrderBusinessBuyerDTO) SetInn(v string) {
	o.Inn = &v
}

// GetKpp returns the Kpp field value if set, zero value otherwise.
func (o *OrderBusinessBuyerDTO) GetKpp() string {
	if o == nil || IsNil(o.Kpp) {
		var ret string
		return ret
	}
	return *o.Kpp
}

// GetKppOk returns a tuple with the Kpp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderBusinessBuyerDTO) GetKppOk() (*string, bool) {
	if o == nil || IsNil(o.Kpp) {
		return nil, false
	}
	return o.Kpp, true
}

// HasKpp returns a boolean if a field has been set.
func (o *OrderBusinessBuyerDTO) HasKpp() bool {
	if o != nil && !IsNil(o.Kpp) {
		return true
	}

	return false
}

// SetKpp gets a reference to the given string and assigns it to the Kpp field.
func (o *OrderBusinessBuyerDTO) SetKpp(v string) {
	o.Kpp = &v
}

// GetOrganizationName returns the OrganizationName field value if set, zero value otherwise.
func (o *OrderBusinessBuyerDTO) GetOrganizationName() string {
	if o == nil || IsNil(o.OrganizationName) {
		var ret string
		return ret
	}
	return *o.OrganizationName
}

// GetOrganizationNameOk returns a tuple with the OrganizationName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderBusinessBuyerDTO) GetOrganizationNameOk() (*string, bool) {
	if o == nil || IsNil(o.OrganizationName) {
		return nil, false
	}
	return o.OrganizationName, true
}

// HasOrganizationName returns a boolean if a field has been set.
func (o *OrderBusinessBuyerDTO) HasOrganizationName() bool {
	if o != nil && !IsNil(o.OrganizationName) {
		return true
	}

	return false
}

// SetOrganizationName gets a reference to the given string and assigns it to the OrganizationName field.
func (o *OrderBusinessBuyerDTO) SetOrganizationName(v string) {
	o.OrganizationName = &v
}

// GetOrganizationJurAddress returns the OrganizationJurAddress field value if set, zero value otherwise.
func (o *OrderBusinessBuyerDTO) GetOrganizationJurAddress() string {
	if o == nil || IsNil(o.OrganizationJurAddress) {
		var ret string
		return ret
	}
	return *o.OrganizationJurAddress
}

// GetOrganizationJurAddressOk returns a tuple with the OrganizationJurAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderBusinessBuyerDTO) GetOrganizationJurAddressOk() (*string, bool) {
	if o == nil || IsNil(o.OrganizationJurAddress) {
		return nil, false
	}
	return o.OrganizationJurAddress, true
}

// HasOrganizationJurAddress returns a boolean if a field has been set.
func (o *OrderBusinessBuyerDTO) HasOrganizationJurAddress() bool {
	if o != nil && !IsNil(o.OrganizationJurAddress) {
		return true
	}

	return false
}

// SetOrganizationJurAddress gets a reference to the given string and assigns it to the OrganizationJurAddress field.
func (o *OrderBusinessBuyerDTO) SetOrganizationJurAddress(v string) {
	o.OrganizationJurAddress = &v
}

func (o OrderBusinessBuyerDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrderBusinessBuyerDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Inn) {
		toSerialize["inn"] = o.Inn
	}
	if !IsNil(o.Kpp) {
		toSerialize["kpp"] = o.Kpp
	}
	if !IsNil(o.OrganizationName) {
		toSerialize["organizationName"] = o.OrganizationName
	}
	if !IsNil(o.OrganizationJurAddress) {
		toSerialize["organizationJurAddress"] = o.OrganizationJurAddress
	}
	return toSerialize, nil
}

type NullableOrderBusinessBuyerDTO struct {
	value *OrderBusinessBuyerDTO
	isSet bool
}

func (v NullableOrderBusinessBuyerDTO) Get() *OrderBusinessBuyerDTO {
	return v.value
}

func (v *NullableOrderBusinessBuyerDTO) Set(val *OrderBusinessBuyerDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOrderBusinessBuyerDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOrderBusinessBuyerDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrderBusinessBuyerDTO(val *OrderBusinessBuyerDTO) *NullableOrderBusinessBuyerDTO {
	return &NullableOrderBusinessBuyerDTO{value: val, isSet: true}
}

func (v NullableOrderBusinessBuyerDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrderBusinessBuyerDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


