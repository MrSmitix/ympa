# GetFeedIndexLogsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**FeedIndexLogsResultDTO**](FeedIndexLogsResultDTO.md) |  | [optional] 

## Methods

### NewGetFeedIndexLogsResponse

`func NewGetFeedIndexLogsResponse() *GetFeedIndexLogsResponse`

NewGetFeedIndexLogsResponse instantiates a new GetFeedIndexLogsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetFeedIndexLogsResponseWithDefaults

`func NewGetFeedIndexLogsResponseWithDefaults() *GetFeedIndexLogsResponse`

NewGetFeedIndexLogsResponseWithDefaults instantiates a new GetFeedIndexLogsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetFeedIndexLogsResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetFeedIndexLogsResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetFeedIndexLogsResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetFeedIndexLogsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetFeedIndexLogsResponse) GetResult() FeedIndexLogsResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetFeedIndexLogsResponse) GetResultOk() (*FeedIndexLogsResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetFeedIndexLogsResponse) SetResult(v FeedIndexLogsResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetFeedIndexLogsResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


