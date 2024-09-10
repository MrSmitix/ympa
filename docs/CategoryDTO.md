# CategoryDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор категории. | 
**Name** | **string** | Название категории. | 
**Children** | Pointer to [**[]CategoryDTO**](CategoryDTO.md) | Дочерние категории. | [optional] 

## Methods

### NewCategoryDTO

`func NewCategoryDTO(id int64, name string, ) *CategoryDTO`

NewCategoryDTO instantiates a new CategoryDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCategoryDTOWithDefaults

`func NewCategoryDTOWithDefaults() *CategoryDTO`

NewCategoryDTOWithDefaults instantiates a new CategoryDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CategoryDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CategoryDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CategoryDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *CategoryDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CategoryDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CategoryDTO) SetName(v string)`

SetName sets Name field to given value.


### GetChildren

`func (o *CategoryDTO) GetChildren() []CategoryDTO`

GetChildren returns the Children field if non-nil, zero value otherwise.

### GetChildrenOk

`func (o *CategoryDTO) GetChildrenOk() (*[]CategoryDTO, bool)`

GetChildrenOk returns a tuple with the Children field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildren

`func (o *CategoryDTO) SetChildren(v []CategoryDTO)`

SetChildren sets Children field to given value.

### HasChildren

`func (o *CategoryDTO) HasChildren() bool`

HasChildren returns a boolean if a field has been set.

### SetChildrenNil

`func (o *CategoryDTO) SetChildrenNil(b bool)`

 SetChildrenNil sets the value for Children to be an explicit nil

### UnsetChildren
`func (o *CategoryDTO) UnsetChildren()`

UnsetChildren ensures that no value is present for Children, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


