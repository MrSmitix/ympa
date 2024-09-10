# GetCategoriesMaxSaleQuantumDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Results** | [**[]MaxSaleQuantumDTO**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**Errors** | Pointer to [**[]CategoryErrorDTO**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

## Methods

### NewGetCategoriesMaxSaleQuantumDTO

`func NewGetCategoriesMaxSaleQuantumDTO(results []MaxSaleQuantumDTO, ) *GetCategoriesMaxSaleQuantumDTO`

NewGetCategoriesMaxSaleQuantumDTO instantiates a new GetCategoriesMaxSaleQuantumDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCategoriesMaxSaleQuantumDTOWithDefaults

`func NewGetCategoriesMaxSaleQuantumDTOWithDefaults() *GetCategoriesMaxSaleQuantumDTO`

NewGetCategoriesMaxSaleQuantumDTOWithDefaults instantiates a new GetCategoriesMaxSaleQuantumDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResults

`func (o *GetCategoriesMaxSaleQuantumDTO) GetResults() []MaxSaleQuantumDTO`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *GetCategoriesMaxSaleQuantumDTO) GetResultsOk() (*[]MaxSaleQuantumDTO, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *GetCategoriesMaxSaleQuantumDTO) SetResults(v []MaxSaleQuantumDTO)`

SetResults sets Results field to given value.


### GetErrors

`func (o *GetCategoriesMaxSaleQuantumDTO) GetErrors() []CategoryErrorDTO`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *GetCategoriesMaxSaleQuantumDTO) GetErrorsOk() (*[]CategoryErrorDTO, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *GetCategoriesMaxSaleQuantumDTO) SetErrors(v []CategoryErrorDTO)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *GetCategoriesMaxSaleQuantumDTO) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### SetErrorsNil

`func (o *GetCategoriesMaxSaleQuantumDTO) SetErrorsNil(b bool)`

 SetErrorsNil sets the value for Errors to be an explicit nil

### UnsetErrors
`func (o *GetCategoriesMaxSaleQuantumDTO) UnsetErrors()`

UnsetErrors ensures that no value is present for Errors, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


