# CategoryContentParametersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **int32** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | 
**Parameters** | Pointer to [**[]CategoryParameterDTO**](CategoryParameterDTO.md) | Список характеристик. | [optional] 

## Methods

### NewCategoryContentParametersDTO

`func NewCategoryContentParametersDTO(categoryId int32, ) *CategoryContentParametersDTO`

NewCategoryContentParametersDTO instantiates a new CategoryContentParametersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCategoryContentParametersDTOWithDefaults

`func NewCategoryContentParametersDTOWithDefaults() *CategoryContentParametersDTO`

NewCategoryContentParametersDTOWithDefaults instantiates a new CategoryContentParametersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryId

`func (o *CategoryContentParametersDTO) GetCategoryId() int32`

GetCategoryId returns the CategoryId field if non-nil, zero value otherwise.

### GetCategoryIdOk

`func (o *CategoryContentParametersDTO) GetCategoryIdOk() (*int32, bool)`

GetCategoryIdOk returns a tuple with the CategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryId

`func (o *CategoryContentParametersDTO) SetCategoryId(v int32)`

SetCategoryId sets CategoryId field to given value.


### GetParameters

`func (o *CategoryContentParametersDTO) GetParameters() []CategoryParameterDTO`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *CategoryContentParametersDTO) GetParametersOk() (*[]CategoryParameterDTO, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *CategoryContentParametersDTO) SetParameters(v []CategoryParameterDTO)`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *CategoryContentParametersDTO) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### SetParametersNil

`func (o *CategoryContentParametersDTO) SetParametersNil(b bool)`

 SetParametersNil sets the value for Parameters to be an explicit nil

### UnsetParameters
`func (o *CategoryContentParametersDTO) UnsetParameters()`

UnsetParameters ensures that no value is present for Parameters, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


