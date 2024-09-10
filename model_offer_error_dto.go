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

// checks if the OfferErrorDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OfferErrorDTO{}

// OfferErrorDTO Сообщение об ошибке, связанной с размещением товара.
type OfferErrorDTO struct {
	// Тип ошибки.
	Message *string `json:"message,omitempty"`
	// Пояснение.
	Comment *string `json:"comment,omitempty"`
}

// NewOfferErrorDTO instantiates a new OfferErrorDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOfferErrorDTO() *OfferErrorDTO {
	this := OfferErrorDTO{}
	return &this
}

// NewOfferErrorDTOWithDefaults instantiates a new OfferErrorDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOfferErrorDTOWithDefaults() *OfferErrorDTO {
	this := OfferErrorDTO{}
	return &this
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *OfferErrorDTO) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferErrorDTO) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *OfferErrorDTO) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *OfferErrorDTO) SetMessage(v string) {
	o.Message = &v
}

// GetComment returns the Comment field value if set, zero value otherwise.
func (o *OfferErrorDTO) GetComment() string {
	if o == nil || IsNil(o.Comment) {
		var ret string
		return ret
	}
	return *o.Comment
}

// GetCommentOk returns a tuple with the Comment field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OfferErrorDTO) GetCommentOk() (*string, bool) {
	if o == nil || IsNil(o.Comment) {
		return nil, false
	}
	return o.Comment, true
}

// HasComment returns a boolean if a field has been set.
func (o *OfferErrorDTO) HasComment() bool {
	if o != nil && !IsNil(o.Comment) {
		return true
	}

	return false
}

// SetComment gets a reference to the given string and assigns it to the Comment field.
func (o *OfferErrorDTO) SetComment(v string) {
	o.Comment = &v
}

func (o OfferErrorDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OfferErrorDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.Comment) {
		toSerialize["comment"] = o.Comment
	}
	return toSerialize, nil
}

type NullableOfferErrorDTO struct {
	value *OfferErrorDTO
	isSet bool
}

func (v NullableOfferErrorDTO) Get() *OfferErrorDTO {
	return v.value
}

func (v *NullableOfferErrorDTO) Set(val *OfferErrorDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableOfferErrorDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableOfferErrorDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOfferErrorDTO(val *OfferErrorDTO) *NullableOfferErrorDTO {
	return &NullableOfferErrorDTO{value: val, isSet: true}
}

func (v NullableOfferErrorDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOfferErrorDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


