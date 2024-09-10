# ApiLockedErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Errors** | Pointer to [**[]ApiErrorDTO**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Methods

### NewApiLockedErrorResponse

`func NewApiLockedErrorResponse() *ApiLockedErrorResponse`

NewApiLockedErrorResponse instantiates a new ApiLockedErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiLockedErrorResponseWithDefaults

`func NewApiLockedErrorResponseWithDefaults() *ApiLockedErrorResponse`

NewApiLockedErrorResponseWithDefaults instantiates a new ApiLockedErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ApiLockedErrorResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ApiLockedErrorResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ApiLockedErrorResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ApiLockedErrorResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetErrors

`func (o *ApiLockedErrorResponse) GetErrors() []ApiErrorDTO`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ApiLockedErrorResponse) GetErrorsOk() (*[]ApiErrorDTO, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ApiLockedErrorResponse) SetErrors(v []ApiErrorDTO)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *ApiLockedErrorResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### SetErrorsNil

`func (o *ApiLockedErrorResponse) SetErrorsNil(b bool)`

 SetErrorsNil sets the value for Errors to be an explicit nil

### UnsetErrors
`func (o *ApiLockedErrorResponse) UnsetErrors()`

UnsetErrors ensures that no value is present for Errors, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


