/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"time"
)

// checks if the GetGoodsFeedbackRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetGoodsFeedbackRequest{}

// GetGoodsFeedbackRequest Фильтр запроса отзывов в кабинете. 
type GetGoodsFeedbackRequest struct {
	// Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
	DateTimeFrom *time.Time `json:"dateTimeFrom,omitempty"`
	// Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
	DateTimeTo *time.Time `json:"dateTimeTo,omitempty"`
	ReactionStatus *FeedbackReactionStatusType `json:"reactionStatus,omitempty"`
	// Оценка товара.
	RatingValues []int32 `json:"ratingValues,omitempty"`
	// Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
	ModelIds []int64 `json:"modelIds,omitempty"`
	// Фильтр отзывов за баллы Плюса.
	Paid *bool `json:"paid,omitempty"`
}

// NewGetGoodsFeedbackRequest instantiates a new GetGoodsFeedbackRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetGoodsFeedbackRequest() *GetGoodsFeedbackRequest {
	this := GetGoodsFeedbackRequest{}
	return &this
}

// NewGetGoodsFeedbackRequestWithDefaults instantiates a new GetGoodsFeedbackRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetGoodsFeedbackRequestWithDefaults() *GetGoodsFeedbackRequest {
	this := GetGoodsFeedbackRequest{}
	return &this
}

// GetDateTimeFrom returns the DateTimeFrom field value if set, zero value otherwise.
func (o *GetGoodsFeedbackRequest) GetDateTimeFrom() time.Time {
	if o == nil || IsNil(o.DateTimeFrom) {
		var ret time.Time
		return ret
	}
	return *o.DateTimeFrom
}

// GetDateTimeFromOk returns a tuple with the DateTimeFrom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetGoodsFeedbackRequest) GetDateTimeFromOk() (*time.Time, bool) {
	if o == nil || IsNil(o.DateTimeFrom) {
		return nil, false
	}
	return o.DateTimeFrom, true
}

// HasDateTimeFrom returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasDateTimeFrom() bool {
	if o != nil && !IsNil(o.DateTimeFrom) {
		return true
	}

	return false
}

// SetDateTimeFrom gets a reference to the given time.Time and assigns it to the DateTimeFrom field.
func (o *GetGoodsFeedbackRequest) SetDateTimeFrom(v time.Time) {
	o.DateTimeFrom = &v
}

// GetDateTimeTo returns the DateTimeTo field value if set, zero value otherwise.
func (o *GetGoodsFeedbackRequest) GetDateTimeTo() time.Time {
	if o == nil || IsNil(o.DateTimeTo) {
		var ret time.Time
		return ret
	}
	return *o.DateTimeTo
}

// GetDateTimeToOk returns a tuple with the DateTimeTo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetGoodsFeedbackRequest) GetDateTimeToOk() (*time.Time, bool) {
	if o == nil || IsNil(o.DateTimeTo) {
		return nil, false
	}
	return o.DateTimeTo, true
}

// HasDateTimeTo returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasDateTimeTo() bool {
	if o != nil && !IsNil(o.DateTimeTo) {
		return true
	}

	return false
}

// SetDateTimeTo gets a reference to the given time.Time and assigns it to the DateTimeTo field.
func (o *GetGoodsFeedbackRequest) SetDateTimeTo(v time.Time) {
	o.DateTimeTo = &v
}

// GetReactionStatus returns the ReactionStatus field value if set, zero value otherwise.
func (o *GetGoodsFeedbackRequest) GetReactionStatus() FeedbackReactionStatusType {
	if o == nil || IsNil(o.ReactionStatus) {
		var ret FeedbackReactionStatusType
		return ret
	}
	return *o.ReactionStatus
}

// GetReactionStatusOk returns a tuple with the ReactionStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetGoodsFeedbackRequest) GetReactionStatusOk() (*FeedbackReactionStatusType, bool) {
	if o == nil || IsNil(o.ReactionStatus) {
		return nil, false
	}
	return o.ReactionStatus, true
}

// HasReactionStatus returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasReactionStatus() bool {
	if o != nil && !IsNil(o.ReactionStatus) {
		return true
	}

	return false
}

// SetReactionStatus gets a reference to the given FeedbackReactionStatusType and assigns it to the ReactionStatus field.
func (o *GetGoodsFeedbackRequest) SetReactionStatus(v FeedbackReactionStatusType) {
	o.ReactionStatus = &v
}

// GetRatingValues returns the RatingValues field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetGoodsFeedbackRequest) GetRatingValues() []int32 {
	if o == nil {
		var ret []int32
		return ret
	}
	return o.RatingValues
}

// GetRatingValuesOk returns a tuple with the RatingValues field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetGoodsFeedbackRequest) GetRatingValuesOk() ([]int32, bool) {
	if o == nil || IsNil(o.RatingValues) {
		return nil, false
	}
	return o.RatingValues, true
}

// HasRatingValues returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasRatingValues() bool {
	if o != nil && !IsNil(o.RatingValues) {
		return true
	}

	return false
}

// SetRatingValues gets a reference to the given []int32 and assigns it to the RatingValues field.
func (o *GetGoodsFeedbackRequest) SetRatingValues(v []int32) {
	o.RatingValues = v
}

// GetModelIds returns the ModelIds field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *GetGoodsFeedbackRequest) GetModelIds() []int64 {
	if o == nil {
		var ret []int64
		return ret
	}
	return o.ModelIds
}

// GetModelIdsOk returns a tuple with the ModelIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *GetGoodsFeedbackRequest) GetModelIdsOk() ([]int64, bool) {
	if o == nil || IsNil(o.ModelIds) {
		return nil, false
	}
	return o.ModelIds, true
}

// HasModelIds returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasModelIds() bool {
	if o != nil && !IsNil(o.ModelIds) {
		return true
	}

	return false
}

// SetModelIds gets a reference to the given []int64 and assigns it to the ModelIds field.
func (o *GetGoodsFeedbackRequest) SetModelIds(v []int64) {
	o.ModelIds = v
}

// GetPaid returns the Paid field value if set, zero value otherwise.
func (o *GetGoodsFeedbackRequest) GetPaid() bool {
	if o == nil || IsNil(o.Paid) {
		var ret bool
		return ret
	}
	return *o.Paid
}

// GetPaidOk returns a tuple with the Paid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetGoodsFeedbackRequest) GetPaidOk() (*bool, bool) {
	if o == nil || IsNil(o.Paid) {
		return nil, false
	}
	return o.Paid, true
}

// HasPaid returns a boolean if a field has been set.
func (o *GetGoodsFeedbackRequest) HasPaid() bool {
	if o != nil && !IsNil(o.Paid) {
		return true
	}

	return false
}

// SetPaid gets a reference to the given bool and assigns it to the Paid field.
func (o *GetGoodsFeedbackRequest) SetPaid(v bool) {
	o.Paid = &v
}

func (o GetGoodsFeedbackRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetGoodsFeedbackRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.DateTimeFrom) {
		toSerialize["dateTimeFrom"] = o.DateTimeFrom
	}
	if !IsNil(o.DateTimeTo) {
		toSerialize["dateTimeTo"] = o.DateTimeTo
	}
	if !IsNil(o.ReactionStatus) {
		toSerialize["reactionStatus"] = o.ReactionStatus
	}
	if o.RatingValues != nil {
		toSerialize["ratingValues"] = o.RatingValues
	}
	if o.ModelIds != nil {
		toSerialize["modelIds"] = o.ModelIds
	}
	if !IsNil(o.Paid) {
		toSerialize["paid"] = o.Paid
	}
	return toSerialize, nil
}

type NullableGetGoodsFeedbackRequest struct {
	value *GetGoodsFeedbackRequest
	isSet bool
}

func (v NullableGetGoodsFeedbackRequest) Get() *GetGoodsFeedbackRequest {
	return v.value
}

func (v *NullableGetGoodsFeedbackRequest) Set(val *GetGoodsFeedbackRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableGetGoodsFeedbackRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableGetGoodsFeedbackRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetGoodsFeedbackRequest(val *GetGoodsFeedbackRequest) *NullableGetGoodsFeedbackRequest {
	return &NullableGetGoodsFeedbackRequest{value: val, isSet: true}
}

func (v NullableGetGoodsFeedbackRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetGoodsFeedbackRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


