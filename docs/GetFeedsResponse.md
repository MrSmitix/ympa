# GetFeedsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feeds** | [**[]FeedDTO**](FeedDTO.md) | Список прайс-листов. | 

## Methods

### NewGetFeedsResponse

`func NewGetFeedsResponse(feeds []FeedDTO, ) *GetFeedsResponse`

NewGetFeedsResponse instantiates a new GetFeedsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetFeedsResponseWithDefaults

`func NewGetFeedsResponseWithDefaults() *GetFeedsResponse`

NewGetFeedsResponseWithDefaults instantiates a new GetFeedsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeeds

`func (o *GetFeedsResponse) GetFeeds() []FeedDTO`

GetFeeds returns the Feeds field if non-nil, zero value otherwise.

### GetFeedsOk

`func (o *GetFeedsResponse) GetFeedsOk() (*[]FeedDTO, bool)`

GetFeedsOk returns a tuple with the Feeds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeds

`func (o *GetFeedsResponse) SetFeeds(v []FeedDTO)`

SetFeeds sets Feeds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


