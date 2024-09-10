# WarehousesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Warehouses** | [**[]WarehouseDTO**](WarehouseDTO.md) | Список складов, не входящих в группы. | 
**WarehouseGroups** | [**[]WarehouseGroupDTO**](WarehouseGroupDTO.md) | Список групп складов. | 

## Methods

### NewWarehousesDTO

`func NewWarehousesDTO(warehouses []WarehouseDTO, warehouseGroups []WarehouseGroupDTO, ) *WarehousesDTO`

NewWarehousesDTO instantiates a new WarehousesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehousesDTOWithDefaults

`func NewWarehousesDTOWithDefaults() *WarehousesDTO`

NewWarehousesDTOWithDefaults instantiates a new WarehousesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWarehouses

`func (o *WarehousesDTO) GetWarehouses() []WarehouseDTO`

GetWarehouses returns the Warehouses field if non-nil, zero value otherwise.

### GetWarehousesOk

`func (o *WarehousesDTO) GetWarehousesOk() (*[]WarehouseDTO, bool)`

GetWarehousesOk returns a tuple with the Warehouses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouses

`func (o *WarehousesDTO) SetWarehouses(v []WarehouseDTO)`

SetWarehouses sets Warehouses field to given value.


### GetWarehouseGroups

`func (o *WarehousesDTO) GetWarehouseGroups() []WarehouseGroupDTO`

GetWarehouseGroups returns the WarehouseGroups field if non-nil, zero value otherwise.

### GetWarehouseGroupsOk

`func (o *WarehousesDTO) GetWarehouseGroupsOk() (*[]WarehouseGroupDTO, bool)`

GetWarehouseGroupsOk returns a tuple with the WarehouseGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouseGroups

`func (o *WarehousesDTO) SetWarehouseGroups(v []WarehouseGroupDTO)`

SetWarehouseGroups sets WarehouseGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


