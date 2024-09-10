# WarehouseGroupDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Название группы складов. | 
**MainWarehouse** | [**WarehouseDTO**](WarehouseDTO.md) |  | 
**Warehouses** | [**[]WarehouseDTO**](WarehouseDTO.md) | Список складов, входящих в группу. | 

## Methods

### NewWarehouseGroupDTO

`func NewWarehouseGroupDTO(name string, mainWarehouse WarehouseDTO, warehouses []WarehouseDTO, ) *WarehouseGroupDTO`

NewWarehouseGroupDTO instantiates a new WarehouseGroupDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseGroupDTOWithDefaults

`func NewWarehouseGroupDTOWithDefaults() *WarehouseGroupDTO`

NewWarehouseGroupDTOWithDefaults instantiates a new WarehouseGroupDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *WarehouseGroupDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *WarehouseGroupDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *WarehouseGroupDTO) SetName(v string)`

SetName sets Name field to given value.


### GetMainWarehouse

`func (o *WarehouseGroupDTO) GetMainWarehouse() WarehouseDTO`

GetMainWarehouse returns the MainWarehouse field if non-nil, zero value otherwise.

### GetMainWarehouseOk

`func (o *WarehouseGroupDTO) GetMainWarehouseOk() (*WarehouseDTO, bool)`

GetMainWarehouseOk returns a tuple with the MainWarehouse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainWarehouse

`func (o *WarehouseGroupDTO) SetMainWarehouse(v WarehouseDTO)`

SetMainWarehouse sets MainWarehouse field to given value.


### GetWarehouses

`func (o *WarehouseGroupDTO) GetWarehouses() []WarehouseDTO`

GetWarehouses returns the Warehouses field if non-nil, zero value otherwise.

### GetWarehousesOk

`func (o *WarehouseGroupDTO) GetWarehousesOk() (*[]WarehouseDTO, bool)`

GetWarehousesOk returns a tuple with the Warehouses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouses

`func (o *WarehouseGroupDTO) SetWarehouses(v []WarehouseDTO)`

SetWarehouses sets Warehouses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


