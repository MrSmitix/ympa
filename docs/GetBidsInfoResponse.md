# GetBidsInfoResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**GetBidsInfoResponseDTO**](GetBidsInfoResponseDTO.md) |  | [optional] 

## Methods

### NewGetBidsInfoResponse

`func NewGetBidsInfoResponse() *GetBidsInfoResponse`

NewGetBidsInfoResponse instantiates a new GetBidsInfoResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBidsInfoResponseWithDefaults

`func NewGetBidsInfoResponseWithDefaults() *GetBidsInfoResponse`

NewGetBidsInfoResponseWithDefaults instantiates a new GetBidsInfoResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetBidsInfoResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetBidsInfoResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetBidsInfoResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetBidsInfoResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetBidsInfoResponse) GetResult() GetBidsInfoResponseDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetBidsInfoResponse) GetResultOk() (*GetBidsInfoResponseDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetBidsInfoResponse) SetResult(v GetBidsInfoResponseDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetBidsInfoResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


