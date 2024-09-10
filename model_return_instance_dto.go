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

// checks if the ReturnInstanceDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ReturnInstanceDTO{}

// ReturnInstanceDTO Логистическая информация по возврату.
type ReturnInstanceDTO struct {
	StockType *ReturnInstanceStockType `json:"stockType,omitempty"`
	Status *ReturnInstanceStatusType `json:"status,omitempty"`
	// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	Cis *string `json:"cis,omitempty"`
	// Международный идентификатор мобильного оборудования.
	Imei *string `json:"imei,omitempty"`
}

// NewReturnInstanceDTO instantiates a new ReturnInstanceDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReturnInstanceDTO() *ReturnInstanceDTO {
	this := ReturnInstanceDTO{}
	return &this
}

// NewReturnInstanceDTOWithDefaults instantiates a new ReturnInstanceDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReturnInstanceDTOWithDefaults() *ReturnInstanceDTO {
	this := ReturnInstanceDTO{}
	return &this
}

// GetStockType returns the StockType field value if set, zero value otherwise.
func (o *ReturnInstanceDTO) GetStockType() ReturnInstanceStockType {
	if o == nil || IsNil(o.StockType) {
		var ret ReturnInstanceStockType
		return ret
	}
	return *o.StockType
}

// GetStockTypeOk returns a tuple with the StockType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReturnInstanceDTO) GetStockTypeOk() (*ReturnInstanceStockType, bool) {
	if o == nil || IsNil(o.StockType) {
		return nil, false
	}
	return o.StockType, true
}

// HasStockType returns a boolean if a field has been set.
func (o *ReturnInstanceDTO) HasStockType() bool {
	if o != nil && !IsNil(o.StockType) {
		return true
	}

	return false
}

// SetStockType gets a reference to the given ReturnInstanceStockType and assigns it to the StockType field.
func (o *ReturnInstanceDTO) SetStockType(v ReturnInstanceStockType) {
	o.StockType = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *ReturnInstanceDTO) GetStatus() ReturnInstanceStatusType {
	if o == nil || IsNil(o.Status) {
		var ret ReturnInstanceStatusType
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReturnInstanceDTO) GetStatusOk() (*ReturnInstanceStatusType, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *ReturnInstanceDTO) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given ReturnInstanceStatusType and assigns it to the Status field.
func (o *ReturnInstanceDTO) SetStatus(v ReturnInstanceStatusType) {
	o.Status = &v
}

// GetCis returns the Cis field value if set, zero value otherwise.
func (o *ReturnInstanceDTO) GetCis() string {
	if o == nil || IsNil(o.Cis) {
		var ret string
		return ret
	}
	return *o.Cis
}

// GetCisOk returns a tuple with the Cis field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReturnInstanceDTO) GetCisOk() (*string, bool) {
	if o == nil || IsNil(o.Cis) {
		return nil, false
	}
	return o.Cis, true
}

// HasCis returns a boolean if a field has been set.
func (o *ReturnInstanceDTO) HasCis() bool {
	if o != nil && !IsNil(o.Cis) {
		return true
	}

	return false
}

// SetCis gets a reference to the given string and assigns it to the Cis field.
func (o *ReturnInstanceDTO) SetCis(v string) {
	o.Cis = &v
}

// GetImei returns the Imei field value if set, zero value otherwise.
func (o *ReturnInstanceDTO) GetImei() string {
	if o == nil || IsNil(o.Imei) {
		var ret string
		return ret
	}
	return *o.Imei
}

// GetImeiOk returns a tuple with the Imei field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ReturnInstanceDTO) GetImeiOk() (*string, bool) {
	if o == nil || IsNil(o.Imei) {
		return nil, false
	}
	return o.Imei, true
}

// HasImei returns a boolean if a field has been set.
func (o *ReturnInstanceDTO) HasImei() bool {
	if o != nil && !IsNil(o.Imei) {
		return true
	}

	return false
}

// SetImei gets a reference to the given string and assigns it to the Imei field.
func (o *ReturnInstanceDTO) SetImei(v string) {
	o.Imei = &v
}

func (o ReturnInstanceDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ReturnInstanceDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.StockType) {
		toSerialize["stockType"] = o.StockType
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !IsNil(o.Cis) {
		toSerialize["cis"] = o.Cis
	}
	if !IsNil(o.Imei) {
		toSerialize["imei"] = o.Imei
	}
	return toSerialize, nil
}

type NullableReturnInstanceDTO struct {
	value *ReturnInstanceDTO
	isSet bool
}

func (v NullableReturnInstanceDTO) Get() *ReturnInstanceDTO {
	return v.value
}

func (v *NullableReturnInstanceDTO) Set(val *ReturnInstanceDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableReturnInstanceDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableReturnInstanceDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReturnInstanceDTO(val *ReturnInstanceDTO) *NullableReturnInstanceDTO {
	return &NullableReturnInstanceDTO{value: val, isSet: true}
}

func (v NullableReturnInstanceDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReturnInstanceDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


