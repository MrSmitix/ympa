# FeedbackListDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**FeedbackList** | [**[]FeedbackDTO**](FeedbackDTO.md) | Список отзывов.  Содержит не более 20 отзывов.  | 

## Methods

### NewFeedbackListDTO

`func NewFeedbackListDTO(feedbackList []FeedbackDTO, ) *FeedbackListDTO`

NewFeedbackListDTO instantiates a new FeedbackListDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackListDTOWithDefaults

`func NewFeedbackListDTOWithDefaults() *FeedbackListDTO`

NewFeedbackListDTOWithDefaults instantiates a new FeedbackListDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *FeedbackListDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *FeedbackListDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *FeedbackListDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *FeedbackListDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetFeedbackList

`func (o *FeedbackListDTO) GetFeedbackList() []FeedbackDTO`

GetFeedbackList returns the FeedbackList field if non-nil, zero value otherwise.

### GetFeedbackListOk

`func (o *FeedbackListDTO) GetFeedbackListOk() (*[]FeedbackDTO, bool)`

GetFeedbackListOk returns a tuple with the FeedbackList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackList

`func (o *FeedbackListDTO) SetFeedbackList(v []FeedbackDTO)`

SetFeedbackList sets FeedbackList field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


