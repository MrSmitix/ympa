# CalculateTariffsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**CalculateTariffsResponseDTO**](CalculateTariffsResponseDTO.md) |  | [optional] 

## Methods

### NewCalculateTariffsResponse

`func NewCalculateTariffsResponse() *CalculateTariffsResponse`

NewCalculateTariffsResponse instantiates a new CalculateTariffsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCalculateTariffsResponseWithDefaults

`func NewCalculateTariffsResponseWithDefaults() *CalculateTariffsResponse`

NewCalculateTariffsResponseWithDefaults instantiates a new CalculateTariffsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *CalculateTariffsResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CalculateTariffsResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CalculateTariffsResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CalculateTariffsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *CalculateTariffsResponse) GetResult() CalculateTariffsResponseDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *CalculateTariffsResponse) GetResultOk() (*CalculateTariffsResponseDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *CalculateTariffsResponse) SetResult(v CalculateTariffsResponseDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *CalculateTariffsResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


