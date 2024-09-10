# VerifyOrderEacResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**EacVerificationResultDTO**](EacVerificationResultDTO.md) |  | [optional] 

## Methods

### NewVerifyOrderEacResponse

`func NewVerifyOrderEacResponse() *VerifyOrderEacResponse`

NewVerifyOrderEacResponse instantiates a new VerifyOrderEacResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVerifyOrderEacResponseWithDefaults

`func NewVerifyOrderEacResponseWithDefaults() *VerifyOrderEacResponse`

NewVerifyOrderEacResponseWithDefaults instantiates a new VerifyOrderEacResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *VerifyOrderEacResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *VerifyOrderEacResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *VerifyOrderEacResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *VerifyOrderEacResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *VerifyOrderEacResponse) GetResult() EacVerificationResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *VerifyOrderEacResponse) GetResultOk() (*EacVerificationResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *VerifyOrderEacResponse) SetResult(v EacVerificationResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *VerifyOrderEacResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


