# FeedbackFactorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор параметра. | [optional] 
**Title** | Pointer to **string** | Название параметра. Например, &#x60;Скорость обработки заказа&#x60;. | [optional] 
**Description** | Pointer to **string** | Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;. | [optional] 
**Value** | Pointer to **int32** | Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка).  | [optional] 

## Methods

### NewFeedbackFactorDTO

`func NewFeedbackFactorDTO() *FeedbackFactorDTO`

NewFeedbackFactorDTO instantiates a new FeedbackFactorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackFactorDTOWithDefaults

`func NewFeedbackFactorDTOWithDefaults() *FeedbackFactorDTO`

NewFeedbackFactorDTOWithDefaults instantiates a new FeedbackFactorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FeedbackFactorDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FeedbackFactorDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FeedbackFactorDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *FeedbackFactorDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetTitle

`func (o *FeedbackFactorDTO) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *FeedbackFactorDTO) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *FeedbackFactorDTO) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *FeedbackFactorDTO) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDescription

`func (o *FeedbackFactorDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *FeedbackFactorDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *FeedbackFactorDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *FeedbackFactorDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetValue

`func (o *FeedbackFactorDTO) GetValue() int32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *FeedbackFactorDTO) GetValueOk() (*int32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *FeedbackFactorDTO) SetValue(v int32)`

SetValue sets Value field to given value.

### HasValue

`func (o *FeedbackFactorDTO) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


