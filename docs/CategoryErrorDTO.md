# CategoryErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | Pointer to **int64** | Идентификатор категории. | [optional] 
**Type** | Pointer to [**CategoryErrorType**](CategoryErrorType.md) |  | [optional] 

## Methods

### NewCategoryErrorDTO

`func NewCategoryErrorDTO() *CategoryErrorDTO`

NewCategoryErrorDTO instantiates a new CategoryErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCategoryErrorDTOWithDefaults

`func NewCategoryErrorDTOWithDefaults() *CategoryErrorDTO`

NewCategoryErrorDTOWithDefaults instantiates a new CategoryErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryId

`func (o *CategoryErrorDTO) GetCategoryId() int64`

GetCategoryId returns the CategoryId field if non-nil, zero value otherwise.

### GetCategoryIdOk

`func (o *CategoryErrorDTO) GetCategoryIdOk() (*int64, bool)`

GetCategoryIdOk returns a tuple with the CategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryId

`func (o *CategoryErrorDTO) SetCategoryId(v int64)`

SetCategoryId sets CategoryId field to given value.

### HasCategoryId

`func (o *CategoryErrorDTO) HasCategoryId() bool`

HasCategoryId returns a boolean if a field has been set.

### GetType

`func (o *CategoryErrorDTO) GetType() CategoryErrorType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CategoryErrorDTO) GetTypeOk() (*CategoryErrorType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CategoryErrorDTO) SetType(v CategoryErrorType)`

SetType sets Type field to given value.

### HasType

`func (o *CategoryErrorDTO) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


