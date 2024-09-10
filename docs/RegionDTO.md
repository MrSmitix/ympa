# RegionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор региона. | [optional] 
**Name** | **string** | Название региона. | 
**Type** | [**RegionType**](RegionType.md) |  | 
**Parent** | Pointer to [**RegionDTO**](RegionDTO.md) |  | [optional] 
**Children** | Pointer to [**[]RegionDTO**](RegionDTO.md) | Дочерние регионы. | [optional] 

## Methods

### NewRegionDTO

`func NewRegionDTO(name string, type_ RegionType, ) *RegionDTO`

NewRegionDTO instantiates a new RegionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRegionDTOWithDefaults

`func NewRegionDTOWithDefaults() *RegionDTO`

NewRegionDTOWithDefaults instantiates a new RegionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RegionDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RegionDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RegionDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *RegionDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *RegionDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RegionDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RegionDTO) SetName(v string)`

SetName sets Name field to given value.


### GetType

`func (o *RegionDTO) GetType() RegionType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RegionDTO) GetTypeOk() (*RegionType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RegionDTO) SetType(v RegionType)`

SetType sets Type field to given value.


### GetParent

`func (o *RegionDTO) GetParent() RegionDTO`

GetParent returns the Parent field if non-nil, zero value otherwise.

### GetParentOk

`func (o *RegionDTO) GetParentOk() (*RegionDTO, bool)`

GetParentOk returns a tuple with the Parent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParent

`func (o *RegionDTO) SetParent(v RegionDTO)`

SetParent sets Parent field to given value.

### HasParent

`func (o *RegionDTO) HasParent() bool`

HasParent returns a boolean if a field has been set.

### GetChildren

`func (o *RegionDTO) GetChildren() []RegionDTO`

GetChildren returns the Children field if non-nil, zero value otherwise.

### GetChildrenOk

`func (o *RegionDTO) GetChildrenOk() (*[]RegionDTO, bool)`

GetChildrenOk returns a tuple with the Children field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildren

`func (o *RegionDTO) SetChildren(v []RegionDTO)`

SetChildren sets Children field to given value.

### HasChildren

`func (o *RegionDTO) HasChildren() bool`

HasChildren returns a boolean if a field has been set.

### SetChildrenNil

`func (o *RegionDTO) SetChildrenNil(b bool)`

 SetChildrenNil sets the value for Children to be an explicit nil

### UnsetChildren
`func (o *RegionDTO) UnsetChildren()`

UnsetChildren ensures that no value is present for Children, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


