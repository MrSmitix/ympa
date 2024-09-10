# GetReturnResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**ReturnDTO**](ReturnDTO.md) |  | [optional] 

## Methods

### NewGetReturnResponse

`func NewGetReturnResponse() *GetReturnResponse`

NewGetReturnResponse instantiates a new GetReturnResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetReturnResponseWithDefaults

`func NewGetReturnResponseWithDefaults() *GetReturnResponse`

NewGetReturnResponseWithDefaults instantiates a new GetReturnResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetReturnResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetReturnResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetReturnResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetReturnResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetReturnResponse) GetResult() ReturnDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetReturnResponse) GetResultOk() (*ReturnDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetReturnResponse) SetResult(v ReturnDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetReturnResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


