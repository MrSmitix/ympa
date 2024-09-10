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

// checks if the GoodsFeedbackStatisticsDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GoodsFeedbackStatisticsDTO{}

// GoodsFeedbackStatisticsDTO Статистическая информация по отзыву.
type GoodsFeedbackStatisticsDTO struct {
	// Оценка товара.
	Rating int32 `json:"rating"`
	// Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	CommentsCount int64 `json:"commentsCount"`
	// Рекомендуют ли этот товар.
	Recommended *bool `json:"recommended,omitempty"`
	// Количество баллов Плюса, которое автор получил за отзыв.
	PaidAmount *int64 `json:"paidAmount,omitempty"`
}

type _GoodsFeedbackStatisticsDTO GoodsFeedbackStatisticsDTO

// NewGoodsFeedbackStatisticsDTO instantiates a new GoodsFeedbackStatisticsDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGoodsFeedbackStatisticsDTO(rating int32, commentsCount int64) *GoodsFeedbackStatisticsDTO {
	this := GoodsFeedbackStatisticsDTO{}
	this.Rating = rating
	this.CommentsCount = commentsCount
	return &this
}

// NewGoodsFeedbackStatisticsDTOWithDefaults instantiates a new GoodsFeedbackStatisticsDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGoodsFeedbackStatisticsDTOWithDefaults() *GoodsFeedbackStatisticsDTO {
	this := GoodsFeedbackStatisticsDTO{}
	return &this
}

// GetRating returns the Rating field value
func (o *GoodsFeedbackStatisticsDTO) GetRating() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Rating
}

// GetRatingOk returns a tuple with the Rating field value
// and a boolean to check if the value has been set.
func (o *GoodsFeedbackStatisticsDTO) GetRatingOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Rating, true
}

// SetRating sets field value
func (o *GoodsFeedbackStatisticsDTO) SetRating(v int32) {
	o.Rating = v
}

// GetCommentsCount returns the CommentsCount field value
func (o *GoodsFeedbackStatisticsDTO) GetCommentsCount() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.CommentsCount
}

// GetCommentsCountOk returns a tuple with the CommentsCount field value
// and a boolean to check if the value has been set.
func (o *GoodsFeedbackStatisticsDTO) GetCommentsCountOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CommentsCount, true
}

// SetCommentsCount sets field value
func (o *GoodsFeedbackStatisticsDTO) SetCommentsCount(v int64) {
	o.CommentsCount = v
}

// GetRecommended returns the Recommended field value if set, zero value otherwise.
func (o *GoodsFeedbackStatisticsDTO) GetRecommended() bool {
	if o == nil || IsNil(o.Recommended) {
		var ret bool
		return ret
	}
	return *o.Recommended
}

// GetRecommendedOk returns a tuple with the Recommended field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GoodsFeedbackStatisticsDTO) GetRecommendedOk() (*bool, bool) {
	if o == nil || IsNil(o.Recommended) {
		return nil, false
	}
	return o.Recommended, true
}

// HasRecommended returns a boolean if a field has been set.
func (o *GoodsFeedbackStatisticsDTO) HasRecommended() bool {
	if o != nil && !IsNil(o.Recommended) {
		return true
	}

	return false
}

// SetRecommended gets a reference to the given bool and assigns it to the Recommended field.
func (o *GoodsFeedbackStatisticsDTO) SetRecommended(v bool) {
	o.Recommended = &v
}

// GetPaidAmount returns the PaidAmount field value if set, zero value otherwise.
func (o *GoodsFeedbackStatisticsDTO) GetPaidAmount() int64 {
	if o == nil || IsNil(o.PaidAmount) {
		var ret int64
		return ret
	}
	return *o.PaidAmount
}

// GetPaidAmountOk returns a tuple with the PaidAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GoodsFeedbackStatisticsDTO) GetPaidAmountOk() (*int64, bool) {
	if o == nil || IsNil(o.PaidAmount) {
		return nil, false
	}
	return o.PaidAmount, true
}

// HasPaidAmount returns a boolean if a field has been set.
func (o *GoodsFeedbackStatisticsDTO) HasPaidAmount() bool {
	if o != nil && !IsNil(o.PaidAmount) {
		return true
	}

	return false
}

// SetPaidAmount gets a reference to the given int64 and assigns it to the PaidAmount field.
func (o *GoodsFeedbackStatisticsDTO) SetPaidAmount(v int64) {
	o.PaidAmount = &v
}

func (o GoodsFeedbackStatisticsDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GoodsFeedbackStatisticsDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["rating"] = o.Rating
	toSerialize["commentsCount"] = o.CommentsCount
	if !IsNil(o.Recommended) {
		toSerialize["recommended"] = o.Recommended
	}
	if !IsNil(o.PaidAmount) {
		toSerialize["paidAmount"] = o.PaidAmount
	}
	return toSerialize, nil
}

func (o *GoodsFeedbackStatisticsDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"rating",
		"commentsCount",
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

	varGoodsFeedbackStatisticsDTO := _GoodsFeedbackStatisticsDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGoodsFeedbackStatisticsDTO)

	if err != nil {
		return err
	}

	*o = GoodsFeedbackStatisticsDTO(varGoodsFeedbackStatisticsDTO)

	return err
}

type NullableGoodsFeedbackStatisticsDTO struct {
	value *GoodsFeedbackStatisticsDTO
	isSet bool
}

func (v NullableGoodsFeedbackStatisticsDTO) Get() *GoodsFeedbackStatisticsDTO {
	return v.value
}

func (v *NullableGoodsFeedbackStatisticsDTO) Set(val *GoodsFeedbackStatisticsDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableGoodsFeedbackStatisticsDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableGoodsFeedbackStatisticsDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGoodsFeedbackStatisticsDTO(val *GoodsFeedbackStatisticsDTO) *NullableGoodsFeedbackStatisticsDTO {
	return &NullableGoodsFeedbackStatisticsDTO{value: val, isSet: true}
}

func (v NullableGoodsFeedbackStatisticsDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGoodsFeedbackStatisticsDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


