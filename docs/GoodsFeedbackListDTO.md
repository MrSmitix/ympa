# GoodsFeedbackListDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbacks** | [**[]GoodsFeedbackDTO**](GoodsFeedbackDTO.md) | Список отзывов. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGoodsFeedbackListDTO

`func NewGoodsFeedbackListDTO(feedbacks []GoodsFeedbackDTO, ) *GoodsFeedbackListDTO`

NewGoodsFeedbackListDTO instantiates a new GoodsFeedbackListDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsFeedbackListDTOWithDefaults

`func NewGoodsFeedbackListDTOWithDefaults() *GoodsFeedbackListDTO`

NewGoodsFeedbackListDTOWithDefaults instantiates a new GoodsFeedbackListDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbacks

`func (o *GoodsFeedbackListDTO) GetFeedbacks() []GoodsFeedbackDTO`

GetFeedbacks returns the Feedbacks field if non-nil, zero value otherwise.

### GetFeedbacksOk

`func (o *GoodsFeedbackListDTO) GetFeedbacksOk() (*[]GoodsFeedbackDTO, bool)`

GetFeedbacksOk returns a tuple with the Feedbacks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacks

`func (o *GoodsFeedbackListDTO) SetFeedbacks(v []GoodsFeedbackDTO)`

SetFeedbacks sets Feedbacks field to given value.


### GetPaging

`func (o *GoodsFeedbackListDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GoodsFeedbackListDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GoodsFeedbackListDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GoodsFeedbackListDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


