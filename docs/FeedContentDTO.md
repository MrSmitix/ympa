# FeedContentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffersCount** | Pointer to **int64** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**Status** | Pointer to [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**TotalOffersCount** | Pointer to **int64** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**Error** | Pointer to [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

## Methods

### NewFeedContentDTO

`func NewFeedContentDTO() *FeedContentDTO`

NewFeedContentDTO instantiates a new FeedContentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedContentDTOWithDefaults

`func NewFeedContentDTOWithDefaults() *FeedContentDTO`

NewFeedContentDTOWithDefaults instantiates a new FeedContentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRejectedOffersCount

`func (o *FeedContentDTO) GetRejectedOffersCount() int64`

GetRejectedOffersCount returns the RejectedOffersCount field if non-nil, zero value otherwise.

### GetRejectedOffersCountOk

`func (o *FeedContentDTO) GetRejectedOffersCountOk() (*int64, bool)`

GetRejectedOffersCountOk returns a tuple with the RejectedOffersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedOffersCount

`func (o *FeedContentDTO) SetRejectedOffersCount(v int64)`

SetRejectedOffersCount sets RejectedOffersCount field to given value.

### HasRejectedOffersCount

`func (o *FeedContentDTO) HasRejectedOffersCount() bool`

HasRejectedOffersCount returns a boolean if a field has been set.

### GetStatus

`func (o *FeedContentDTO) GetStatus() FeedStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedContentDTO) GetStatusOk() (*FeedStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedContentDTO) SetStatus(v FeedStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FeedContentDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTotalOffersCount

`func (o *FeedContentDTO) GetTotalOffersCount() int64`

GetTotalOffersCount returns the TotalOffersCount field if non-nil, zero value otherwise.

### GetTotalOffersCountOk

`func (o *FeedContentDTO) GetTotalOffersCountOk() (*int64, bool)`

GetTotalOffersCountOk returns a tuple with the TotalOffersCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalOffersCount

`func (o *FeedContentDTO) SetTotalOffersCount(v int64)`

SetTotalOffersCount sets TotalOffersCount field to given value.

### HasTotalOffersCount

`func (o *FeedContentDTO) HasTotalOffersCount() bool`

HasTotalOffersCount returns a boolean if a field has been set.

### GetError

`func (o *FeedContentDTO) GetError() FeedContentErrorDTO`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *FeedContentDTO) GetErrorOk() (*FeedContentErrorDTO, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *FeedContentDTO) SetError(v FeedContentErrorDTO)`

SetError sets Error field to given value.

### HasError

`func (o *FeedContentDTO) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


