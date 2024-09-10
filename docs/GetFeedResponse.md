# GetFeedResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feed** | Pointer to [**FeedDTO**](FeedDTO.md) |  | [optional] 

## Methods

### NewGetFeedResponse

`func NewGetFeedResponse() *GetFeedResponse`

NewGetFeedResponse instantiates a new GetFeedResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetFeedResponseWithDefaults

`func NewGetFeedResponseWithDefaults() *GetFeedResponse`

NewGetFeedResponseWithDefaults instantiates a new GetFeedResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeed

`func (o *GetFeedResponse) GetFeed() FeedDTO`

GetFeed returns the Feed field if non-nil, zero value otherwise.

### GetFeedOk

`func (o *GetFeedResponse) GetFeedOk() (*FeedDTO, bool)`

GetFeedOk returns a tuple with the Feed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeed

`func (o *GetFeedResponse) SetFeed(v FeedDTO)`

SetFeed sets Feed field to given value.

### HasFeed

`func (o *GetFeedResponse) HasFeed() bool`

HasFeed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


