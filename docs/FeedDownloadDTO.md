# FeedDownloadDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**Error** | Pointer to [**FeedDownloadErrorDTO**](FeedDownloadErrorDTO.md) |  | [optional] 

## Methods

### NewFeedDownloadDTO

`func NewFeedDownloadDTO() *FeedDownloadDTO`

NewFeedDownloadDTO instantiates a new FeedDownloadDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedDownloadDTOWithDefaults

`func NewFeedDownloadDTOWithDefaults() *FeedDownloadDTO`

NewFeedDownloadDTOWithDefaults instantiates a new FeedDownloadDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *FeedDownloadDTO) GetStatus() FeedStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FeedDownloadDTO) GetStatusOk() (*FeedStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FeedDownloadDTO) SetStatus(v FeedStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *FeedDownloadDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetError

`func (o *FeedDownloadDTO) GetError() FeedDownloadErrorDTO`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *FeedDownloadDTO) GetErrorOk() (*FeedDownloadErrorDTO, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *FeedDownloadDTO) SetError(v FeedDownloadErrorDTO)`

SetError sets Error field to given value.

### HasError

`func (o *FeedDownloadDTO) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


