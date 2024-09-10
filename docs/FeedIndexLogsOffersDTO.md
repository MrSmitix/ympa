# FeedIndexLogsOffersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedCount** | Pointer to **int64** | Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. | [optional] 
**TotalCount** | Pointer to **int64** | Количество предложений в прайс-листе. | [optional] 

## Methods

### NewFeedIndexLogsOffersDTO

`func NewFeedIndexLogsOffersDTO() *FeedIndexLogsOffersDTO`

NewFeedIndexLogsOffersDTO instantiates a new FeedIndexLogsOffersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedIndexLogsOffersDTOWithDefaults

`func NewFeedIndexLogsOffersDTOWithDefaults() *FeedIndexLogsOffersDTO`

NewFeedIndexLogsOffersDTOWithDefaults instantiates a new FeedIndexLogsOffersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRejectedCount

`func (o *FeedIndexLogsOffersDTO) GetRejectedCount() int64`

GetRejectedCount returns the RejectedCount field if non-nil, zero value otherwise.

### GetRejectedCountOk

`func (o *FeedIndexLogsOffersDTO) GetRejectedCountOk() (*int64, bool)`

GetRejectedCountOk returns a tuple with the RejectedCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedCount

`func (o *FeedIndexLogsOffersDTO) SetRejectedCount(v int64)`

SetRejectedCount sets RejectedCount field to given value.

### HasRejectedCount

`func (o *FeedIndexLogsOffersDTO) HasRejectedCount() bool`

HasRejectedCount returns a boolean if a field has been set.

### GetTotalCount

`func (o *FeedIndexLogsOffersDTO) GetTotalCount() int64`

GetTotalCount returns the TotalCount field if non-nil, zero value otherwise.

### GetTotalCountOk

`func (o *FeedIndexLogsOffersDTO) GetTotalCountOk() (*int64, bool)`

GetTotalCountOk returns a tuple with the TotalCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalCount

`func (o *FeedIndexLogsOffersDTO) SetTotalCount(v int64)`

SetTotalCount sets TotalCount field to given value.

### HasTotalCount

`func (o *FeedIndexLogsOffersDTO) HasTotalCount() bool`

HasTotalCount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


