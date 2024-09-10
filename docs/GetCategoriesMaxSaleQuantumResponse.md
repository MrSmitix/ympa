# GetCategoriesMaxSaleQuantumResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Results** | [**[]MaxSaleQuantumDTO**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**Errors** | Pointer to [**[]CategoryErrorDTO**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

## Methods

### NewGetCategoriesMaxSaleQuantumResponse

`func NewGetCategoriesMaxSaleQuantumResponse(results []MaxSaleQuantumDTO, ) *GetCategoriesMaxSaleQuantumResponse`

NewGetCategoriesMaxSaleQuantumResponse instantiates a new GetCategoriesMaxSaleQuantumResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCategoriesMaxSaleQuantumResponseWithDefaults

`func NewGetCategoriesMaxSaleQuantumResponseWithDefaults() *GetCategoriesMaxSaleQuantumResponse`

NewGetCategoriesMaxSaleQuantumResponseWithDefaults instantiates a new GetCategoriesMaxSaleQuantumResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetCategoriesMaxSaleQuantumResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetCategoriesMaxSaleQuantumResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetCategoriesMaxSaleQuantumResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetCategoriesMaxSaleQuantumResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResults

`func (o *GetCategoriesMaxSaleQuantumResponse) GetResults() []MaxSaleQuantumDTO`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *GetCategoriesMaxSaleQuantumResponse) GetResultsOk() (*[]MaxSaleQuantumDTO, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *GetCategoriesMaxSaleQuantumResponse) SetResults(v []MaxSaleQuantumDTO)`

SetResults sets Results field to given value.


### GetErrors

`func (o *GetCategoriesMaxSaleQuantumResponse) GetErrors() []CategoryErrorDTO`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *GetCategoriesMaxSaleQuantumResponse) GetErrorsOk() (*[]CategoryErrorDTO, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *GetCategoriesMaxSaleQuantumResponse) SetErrors(v []CategoryErrorDTO)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *GetCategoriesMaxSaleQuantumResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### SetErrorsNil

`func (o *GetCategoriesMaxSaleQuantumResponse) SetErrorsNil(b bool)`

 SetErrorsNil sets the value for Errors to be an explicit nil

### UnsetErrors
`func (o *GetCategoriesMaxSaleQuantumResponse) UnsetErrors()`

UnsetErrors ensures that no value is present for Errors, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


