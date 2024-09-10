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

// checks if the UpdateGoodsFeedbackCommentDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateGoodsFeedbackCommentDTO{}

// UpdateGoodsFeedbackCommentDTO Комментарий к отзыву или другому комментарию.
type UpdateGoodsFeedbackCommentDTO struct {
	// Идентификатор комментария к отзыву. 
	Id *int64 `json:"id,omitempty"`
	// Идентификатор комментария к отзыву. 
	ParentId *int64 `json:"parentId,omitempty"`
	// Текст комментария.
	Text string `json:"text"`
}

type _UpdateGoodsFeedbackCommentDTO UpdateGoodsFeedbackCommentDTO

// NewUpdateGoodsFeedbackCommentDTO instantiates a new UpdateGoodsFeedbackCommentDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateGoodsFeedbackCommentDTO(text string) *UpdateGoodsFeedbackCommentDTO {
	this := UpdateGoodsFeedbackCommentDTO{}
	this.Text = text
	return &this
}

// NewUpdateGoodsFeedbackCommentDTOWithDefaults instantiates a new UpdateGoodsFeedbackCommentDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateGoodsFeedbackCommentDTOWithDefaults() *UpdateGoodsFeedbackCommentDTO {
	this := UpdateGoodsFeedbackCommentDTO{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *UpdateGoodsFeedbackCommentDTO) GetId() int64 {
	if o == nil || IsNil(o.Id) {
		var ret int64
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateGoodsFeedbackCommentDTO) GetIdOk() (*int64, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *UpdateGoodsFeedbackCommentDTO) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int64 and assigns it to the Id field.
func (o *UpdateGoodsFeedbackCommentDTO) SetId(v int64) {
	o.Id = &v
}

// GetParentId returns the ParentId field value if set, zero value otherwise.
func (o *UpdateGoodsFeedbackCommentDTO) GetParentId() int64 {
	if o == nil || IsNil(o.ParentId) {
		var ret int64
		return ret
	}
	return *o.ParentId
}

// GetParentIdOk returns a tuple with the ParentId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateGoodsFeedbackCommentDTO) GetParentIdOk() (*int64, bool) {
	if o == nil || IsNil(o.ParentId) {
		return nil, false
	}
	return o.ParentId, true
}

// HasParentId returns a boolean if a field has been set.
func (o *UpdateGoodsFeedbackCommentDTO) HasParentId() bool {
	if o != nil && !IsNil(o.ParentId) {
		return true
	}

	return false
}

// SetParentId gets a reference to the given int64 and assigns it to the ParentId field.
func (o *UpdateGoodsFeedbackCommentDTO) SetParentId(v int64) {
	o.ParentId = &v
}

// GetText returns the Text field value
func (o *UpdateGoodsFeedbackCommentDTO) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *UpdateGoodsFeedbackCommentDTO) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *UpdateGoodsFeedbackCommentDTO) SetText(v string) {
	o.Text = v
}

func (o UpdateGoodsFeedbackCommentDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateGoodsFeedbackCommentDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.ParentId) {
		toSerialize["parentId"] = o.ParentId
	}
	toSerialize["text"] = o.Text
	return toSerialize, nil
}

func (o *UpdateGoodsFeedbackCommentDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"text",
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

	varUpdateGoodsFeedbackCommentDTO := _UpdateGoodsFeedbackCommentDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varUpdateGoodsFeedbackCommentDTO)

	if err != nil {
		return err
	}

	*o = UpdateGoodsFeedbackCommentDTO(varUpdateGoodsFeedbackCommentDTO)

	return err
}

type NullableUpdateGoodsFeedbackCommentDTO struct {
	value *UpdateGoodsFeedbackCommentDTO
	isSet bool
}

func (v NullableUpdateGoodsFeedbackCommentDTO) Get() *UpdateGoodsFeedbackCommentDTO {
	return v.value
}

func (v *NullableUpdateGoodsFeedbackCommentDTO) Set(val *UpdateGoodsFeedbackCommentDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateGoodsFeedbackCommentDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateGoodsFeedbackCommentDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateGoodsFeedbackCommentDTO(val *UpdateGoodsFeedbackCommentDTO) *NullableUpdateGoodsFeedbackCommentDTO {
	return &NullableUpdateGoodsFeedbackCommentDTO{value: val, isSet: true}
}

func (v NullableUpdateGoodsFeedbackCommentDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateGoodsFeedbackCommentDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


