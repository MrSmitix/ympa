# GetGoodsFeedbackRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTimeFrom** | Pointer to **time.Time** | Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.  | [optional] 
**DateTimeTo** | Pointer to **time.Time** | Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  | [optional] 
**ReactionStatus** | Pointer to [**FeedbackReactionStatusType**](FeedbackReactionStatusType.md) |  | [optional] 
**RatingValues** | Pointer to **[]int32** | Оценка товара. | [optional] 
**ModelIds** | Pointer to **[]int64** | Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  | [optional] 
**Paid** | Pointer to **bool** | Фильтр отзывов за баллы Плюса. | [optional] 

## Methods

### NewGetGoodsFeedbackRequest

`func NewGetGoodsFeedbackRequest() *GetGoodsFeedbackRequest`

NewGetGoodsFeedbackRequest instantiates a new GetGoodsFeedbackRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetGoodsFeedbackRequestWithDefaults

`func NewGetGoodsFeedbackRequestWithDefaults() *GetGoodsFeedbackRequest`

NewGetGoodsFeedbackRequestWithDefaults instantiates a new GetGoodsFeedbackRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateTimeFrom

`func (o *GetGoodsFeedbackRequest) GetDateTimeFrom() time.Time`

GetDateTimeFrom returns the DateTimeFrom field if non-nil, zero value otherwise.

### GetDateTimeFromOk

`func (o *GetGoodsFeedbackRequest) GetDateTimeFromOk() (*time.Time, bool)`

GetDateTimeFromOk returns a tuple with the DateTimeFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeFrom

`func (o *GetGoodsFeedbackRequest) SetDateTimeFrom(v time.Time)`

SetDateTimeFrom sets DateTimeFrom field to given value.

### HasDateTimeFrom

`func (o *GetGoodsFeedbackRequest) HasDateTimeFrom() bool`

HasDateTimeFrom returns a boolean if a field has been set.

### GetDateTimeTo

`func (o *GetGoodsFeedbackRequest) GetDateTimeTo() time.Time`

GetDateTimeTo returns the DateTimeTo field if non-nil, zero value otherwise.

### GetDateTimeToOk

`func (o *GetGoodsFeedbackRequest) GetDateTimeToOk() (*time.Time, bool)`

GetDateTimeToOk returns a tuple with the DateTimeTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeTo

`func (o *GetGoodsFeedbackRequest) SetDateTimeTo(v time.Time)`

SetDateTimeTo sets DateTimeTo field to given value.

### HasDateTimeTo

`func (o *GetGoodsFeedbackRequest) HasDateTimeTo() bool`

HasDateTimeTo returns a boolean if a field has been set.

### GetReactionStatus

`func (o *GetGoodsFeedbackRequest) GetReactionStatus() FeedbackReactionStatusType`

GetReactionStatus returns the ReactionStatus field if non-nil, zero value otherwise.

### GetReactionStatusOk

`func (o *GetGoodsFeedbackRequest) GetReactionStatusOk() (*FeedbackReactionStatusType, bool)`

GetReactionStatusOk returns a tuple with the ReactionStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactionStatus

`func (o *GetGoodsFeedbackRequest) SetReactionStatus(v FeedbackReactionStatusType)`

SetReactionStatus sets ReactionStatus field to given value.

### HasReactionStatus

`func (o *GetGoodsFeedbackRequest) HasReactionStatus() bool`

HasReactionStatus returns a boolean if a field has been set.

### GetRatingValues

`func (o *GetGoodsFeedbackRequest) GetRatingValues() []int32`

GetRatingValues returns the RatingValues field if non-nil, zero value otherwise.

### GetRatingValuesOk

`func (o *GetGoodsFeedbackRequest) GetRatingValuesOk() (*[]int32, bool)`

GetRatingValuesOk returns a tuple with the RatingValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatingValues

`func (o *GetGoodsFeedbackRequest) SetRatingValues(v []int32)`

SetRatingValues sets RatingValues field to given value.

### HasRatingValues

`func (o *GetGoodsFeedbackRequest) HasRatingValues() bool`

HasRatingValues returns a boolean if a field has been set.

### SetRatingValuesNil

`func (o *GetGoodsFeedbackRequest) SetRatingValuesNil(b bool)`

 SetRatingValuesNil sets the value for RatingValues to be an explicit nil

### UnsetRatingValues
`func (o *GetGoodsFeedbackRequest) UnsetRatingValues()`

UnsetRatingValues ensures that no value is present for RatingValues, not even an explicit nil
### GetModelIds

`func (o *GetGoodsFeedbackRequest) GetModelIds() []int64`

GetModelIds returns the ModelIds field if non-nil, zero value otherwise.

### GetModelIdsOk

`func (o *GetGoodsFeedbackRequest) GetModelIdsOk() (*[]int64, bool)`

GetModelIdsOk returns a tuple with the ModelIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModelIds

`func (o *GetGoodsFeedbackRequest) SetModelIds(v []int64)`

SetModelIds sets ModelIds field to given value.

### HasModelIds

`func (o *GetGoodsFeedbackRequest) HasModelIds() bool`

HasModelIds returns a boolean if a field has been set.

### SetModelIdsNil

`func (o *GetGoodsFeedbackRequest) SetModelIdsNil(b bool)`

 SetModelIdsNil sets the value for ModelIds to be an explicit nil

### UnsetModelIds
`func (o *GetGoodsFeedbackRequest) UnsetModelIds()`

UnsetModelIds ensures that no value is present for ModelIds, not even an explicit nil
### GetPaid

`func (o *GetGoodsFeedbackRequest) GetPaid() bool`

GetPaid returns the Paid field if non-nil, zero value otherwise.

### GetPaidOk

`func (o *GetGoodsFeedbackRequest) GetPaidOk() (*bool, bool)`

GetPaidOk returns a tuple with the Paid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaid

`func (o *GetGoodsFeedbackRequest) SetPaid(v bool)`

SetPaid sets Paid field to given value.

### HasPaid

`func (o *GetGoodsFeedbackRequest) HasPaid() bool`

HasPaid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


