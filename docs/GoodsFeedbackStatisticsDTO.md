# GoodsFeedbackStatisticsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rating** | **int32** | Оценка товара. | 
**CommentsCount** | **int64** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  | 
**Recommended** | Pointer to **bool** | Рекомендуют ли этот товар. | [optional] 
**PaidAmount** | Pointer to **int64** | Количество баллов Плюса, которое автор получил за отзыв. | [optional] 

## Methods

### NewGoodsFeedbackStatisticsDTO

`func NewGoodsFeedbackStatisticsDTO(rating int32, commentsCount int64, ) *GoodsFeedbackStatisticsDTO`

NewGoodsFeedbackStatisticsDTO instantiates a new GoodsFeedbackStatisticsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsFeedbackStatisticsDTOWithDefaults

`func NewGoodsFeedbackStatisticsDTOWithDefaults() *GoodsFeedbackStatisticsDTO`

NewGoodsFeedbackStatisticsDTOWithDefaults instantiates a new GoodsFeedbackStatisticsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRating

`func (o *GoodsFeedbackStatisticsDTO) GetRating() int32`

GetRating returns the Rating field if non-nil, zero value otherwise.

### GetRatingOk

`func (o *GoodsFeedbackStatisticsDTO) GetRatingOk() (*int32, bool)`

GetRatingOk returns a tuple with the Rating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRating

`func (o *GoodsFeedbackStatisticsDTO) SetRating(v int32)`

SetRating sets Rating field to given value.


### GetCommentsCount

`func (o *GoodsFeedbackStatisticsDTO) GetCommentsCount() int64`

GetCommentsCount returns the CommentsCount field if non-nil, zero value otherwise.

### GetCommentsCountOk

`func (o *GoodsFeedbackStatisticsDTO) GetCommentsCountOk() (*int64, bool)`

GetCommentsCountOk returns a tuple with the CommentsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommentsCount

`func (o *GoodsFeedbackStatisticsDTO) SetCommentsCount(v int64)`

SetCommentsCount sets CommentsCount field to given value.


### GetRecommended

`func (o *GoodsFeedbackStatisticsDTO) GetRecommended() bool`

GetRecommended returns the Recommended field if non-nil, zero value otherwise.

### GetRecommendedOk

`func (o *GoodsFeedbackStatisticsDTO) GetRecommendedOk() (*bool, bool)`

GetRecommendedOk returns a tuple with the Recommended field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommended

`func (o *GoodsFeedbackStatisticsDTO) SetRecommended(v bool)`

SetRecommended sets Recommended field to given value.

### HasRecommended

`func (o *GoodsFeedbackStatisticsDTO) HasRecommended() bool`

HasRecommended returns a boolean if a field has been set.

### GetPaidAmount

`func (o *GoodsFeedbackStatisticsDTO) GetPaidAmount() int64`

GetPaidAmount returns the PaidAmount field if non-nil, zero value otherwise.

### GetPaidAmountOk

`func (o *GoodsFeedbackStatisticsDTO) GetPaidAmountOk() (*int64, bool)`

GetPaidAmountOk returns a tuple with the PaidAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaidAmount

`func (o *GoodsFeedbackStatisticsDTO) SetPaidAmount(v int64)`

SetPaidAmount sets PaidAmount field to given value.

### HasPaidAmount

`func (o *GoodsFeedbackStatisticsDTO) HasPaidAmount() bool`

HasPaidAmount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


