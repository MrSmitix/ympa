# FeedbackGradesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Average** | Pointer to **float32** | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). | [optional] 
**AgreeCount** | Pointer to **int64** | Количество пользователей, считающих отзыв полезным. | [optional] 
**RejectCount** | Pointer to **int64** | Количество пользователей, считающих отзыв бесполезным. | [optional] 
**Factors** | [**[]FeedbackFactorDTO**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.  | 

## Methods

### NewFeedbackGradesDTO

`func NewFeedbackGradesDTO(factors []FeedbackFactorDTO, ) *FeedbackGradesDTO`

NewFeedbackGradesDTO instantiates a new FeedbackGradesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackGradesDTOWithDefaults

`func NewFeedbackGradesDTOWithDefaults() *FeedbackGradesDTO`

NewFeedbackGradesDTOWithDefaults instantiates a new FeedbackGradesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAverage

`func (o *FeedbackGradesDTO) GetAverage() float32`

GetAverage returns the Average field if non-nil, zero value otherwise.

### GetAverageOk

`func (o *FeedbackGradesDTO) GetAverageOk() (*float32, bool)`

GetAverageOk returns a tuple with the Average field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverage

`func (o *FeedbackGradesDTO) SetAverage(v float32)`

SetAverage sets Average field to given value.

### HasAverage

`func (o *FeedbackGradesDTO) HasAverage() bool`

HasAverage returns a boolean if a field has been set.

### GetAgreeCount

`func (o *FeedbackGradesDTO) GetAgreeCount() int64`

GetAgreeCount returns the AgreeCount field if non-nil, zero value otherwise.

### GetAgreeCountOk

`func (o *FeedbackGradesDTO) GetAgreeCountOk() (*int64, bool)`

GetAgreeCountOk returns a tuple with the AgreeCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgreeCount

`func (o *FeedbackGradesDTO) SetAgreeCount(v int64)`

SetAgreeCount sets AgreeCount field to given value.

### HasAgreeCount

`func (o *FeedbackGradesDTO) HasAgreeCount() bool`

HasAgreeCount returns a boolean if a field has been set.

### GetRejectCount

`func (o *FeedbackGradesDTO) GetRejectCount() int64`

GetRejectCount returns the RejectCount field if non-nil, zero value otherwise.

### GetRejectCountOk

`func (o *FeedbackGradesDTO) GetRejectCountOk() (*int64, bool)`

GetRejectCountOk returns a tuple with the RejectCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectCount

`func (o *FeedbackGradesDTO) SetRejectCount(v int64)`

SetRejectCount sets RejectCount field to given value.

### HasRejectCount

`func (o *FeedbackGradesDTO) HasRejectCount() bool`

HasRejectCount returns a boolean if a field has been set.

### GetFactors

`func (o *FeedbackGradesDTO) GetFactors() []FeedbackFactorDTO`

GetFactors returns the Factors field if non-nil, zero value otherwise.

### GetFactorsOk

`func (o *FeedbackGradesDTO) GetFactorsOk() (*[]FeedbackFactorDTO, bool)`

GetFactorsOk returns a tuple with the Factors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFactors

`func (o *FeedbackGradesDTO) SetFactors(v []FeedbackFactorDTO)`

SetFactors sets Factors field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


