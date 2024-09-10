# GoodsFeedbackDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedbackId** | **int64** | Идентификатор отзыва.  | 
**CreatedAt** | **time.Time** | Дата и время создания отзыва. | 
**NeedReaction** | **bool** | Нужен ли ответ на отзыв. | 
**Identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**Author** | Pointer to **string** | Имя автора отзыва. | [optional] 
**Description** | Pointer to [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] 
**Media** | Pointer to [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] 
**Statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 

## Methods

### NewGoodsFeedbackDTO

`func NewGoodsFeedbackDTO(feedbackId int64, createdAt time.Time, needReaction bool, identifiers GoodsFeedbackIdentifiersDTO, statistics GoodsFeedbackStatisticsDTO, ) *GoodsFeedbackDTO`

NewGoodsFeedbackDTO instantiates a new GoodsFeedbackDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsFeedbackDTOWithDefaults

`func NewGoodsFeedbackDTOWithDefaults() *GoodsFeedbackDTO`

NewGoodsFeedbackDTOWithDefaults instantiates a new GoodsFeedbackDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackId

`func (o *GoodsFeedbackDTO) GetFeedbackId() int64`

GetFeedbackId returns the FeedbackId field if non-nil, zero value otherwise.

### GetFeedbackIdOk

`func (o *GoodsFeedbackDTO) GetFeedbackIdOk() (*int64, bool)`

GetFeedbackIdOk returns a tuple with the FeedbackId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackId

`func (o *GoodsFeedbackDTO) SetFeedbackId(v int64)`

SetFeedbackId sets FeedbackId field to given value.


### GetCreatedAt

`func (o *GoodsFeedbackDTO) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *GoodsFeedbackDTO) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *GoodsFeedbackDTO) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetNeedReaction

`func (o *GoodsFeedbackDTO) GetNeedReaction() bool`

GetNeedReaction returns the NeedReaction field if non-nil, zero value otherwise.

### GetNeedReactionOk

`func (o *GoodsFeedbackDTO) GetNeedReactionOk() (*bool, bool)`

GetNeedReactionOk returns a tuple with the NeedReaction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedReaction

`func (o *GoodsFeedbackDTO) SetNeedReaction(v bool)`

SetNeedReaction sets NeedReaction field to given value.


### GetIdentifiers

`func (o *GoodsFeedbackDTO) GetIdentifiers() GoodsFeedbackIdentifiersDTO`

GetIdentifiers returns the Identifiers field if non-nil, zero value otherwise.

### GetIdentifiersOk

`func (o *GoodsFeedbackDTO) GetIdentifiersOk() (*GoodsFeedbackIdentifiersDTO, bool)`

GetIdentifiersOk returns a tuple with the Identifiers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentifiers

`func (o *GoodsFeedbackDTO) SetIdentifiers(v GoodsFeedbackIdentifiersDTO)`

SetIdentifiers sets Identifiers field to given value.


### GetAuthor

`func (o *GoodsFeedbackDTO) GetAuthor() string`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *GoodsFeedbackDTO) GetAuthorOk() (*string, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *GoodsFeedbackDTO) SetAuthor(v string)`

SetAuthor sets Author field to given value.

### HasAuthor

`func (o *GoodsFeedbackDTO) HasAuthor() bool`

HasAuthor returns a boolean if a field has been set.

### GetDescription

`func (o *GoodsFeedbackDTO) GetDescription() GoodsFeedbackDescriptionDTO`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *GoodsFeedbackDTO) GetDescriptionOk() (*GoodsFeedbackDescriptionDTO, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *GoodsFeedbackDTO) SetDescription(v GoodsFeedbackDescriptionDTO)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *GoodsFeedbackDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetMedia

`func (o *GoodsFeedbackDTO) GetMedia() GoodsFeedbackMediaDTO`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *GoodsFeedbackDTO) GetMediaOk() (*GoodsFeedbackMediaDTO, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *GoodsFeedbackDTO) SetMedia(v GoodsFeedbackMediaDTO)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *GoodsFeedbackDTO) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetStatistics

`func (o *GoodsFeedbackDTO) GetStatistics() GoodsFeedbackStatisticsDTO`

GetStatistics returns the Statistics field if non-nil, zero value otherwise.

### GetStatisticsOk

`func (o *GoodsFeedbackDTO) GetStatisticsOk() (*GoodsFeedbackStatisticsDTO, bool)`

GetStatisticsOk returns a tuple with the Statistics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatistics

`func (o *GoodsFeedbackDTO) SetStatistics(v GoodsFeedbackStatisticsDTO)`

SetStatistics sets Statistics field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


