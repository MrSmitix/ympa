# GetCategoryContentParametersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**CategoryContentParametersDTO**](CategoryContentParametersDTO.md) |  | [optional] 

## Methods

### NewGetCategoryContentParametersResponse

`func NewGetCategoryContentParametersResponse() *GetCategoryContentParametersResponse`

NewGetCategoryContentParametersResponse instantiates a new GetCategoryContentParametersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCategoryContentParametersResponseWithDefaults

`func NewGetCategoryContentParametersResponseWithDefaults() *GetCategoryContentParametersResponse`

NewGetCategoryContentParametersResponseWithDefaults instantiates a new GetCategoryContentParametersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetCategoryContentParametersResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetCategoryContentParametersResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetCategoryContentParametersResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetCategoryContentParametersResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetCategoryContentParametersResponse) GetResult() CategoryContentParametersDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetCategoryContentParametersResponse) GetResultOk() (*CategoryContentParametersDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetCategoryContentParametersResponse) SetResult(v CategoryContentParametersDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetCategoryContentParametersResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


