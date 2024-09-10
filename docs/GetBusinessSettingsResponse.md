# GetBusinessSettingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**GetBusinessSettingsInfoDTO**](GetBusinessSettingsInfoDTO.md) |  | [optional] 

## Methods

### NewGetBusinessSettingsResponse

`func NewGetBusinessSettingsResponse() *GetBusinessSettingsResponse`

NewGetBusinessSettingsResponse instantiates a new GetBusinessSettingsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBusinessSettingsResponseWithDefaults

`func NewGetBusinessSettingsResponseWithDefaults() *GetBusinessSettingsResponse`

NewGetBusinessSettingsResponseWithDefaults instantiates a new GetBusinessSettingsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetBusinessSettingsResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetBusinessSettingsResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetBusinessSettingsResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetBusinessSettingsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetBusinessSettingsResponse) GetResult() GetBusinessSettingsInfoDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetBusinessSettingsResponse) GetResultOk() (*GetBusinessSettingsInfoDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetBusinessSettingsResponse) SetResult(v GetBusinessSettingsInfoDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetBusinessSettingsResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


