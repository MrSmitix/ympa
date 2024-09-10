# WarehouseStockDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**WarehouseStockType**](WarehouseStockType.md) |  | 
**Count** | **int64** | Значение остатков. | 

## Methods

### NewWarehouseStockDTO

`func NewWarehouseStockDTO(type_ WarehouseStockType, count int64, ) *WarehouseStockDTO`

NewWarehouseStockDTO instantiates a new WarehouseStockDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseStockDTOWithDefaults

`func NewWarehouseStockDTOWithDefaults() *WarehouseStockDTO`

NewWarehouseStockDTOWithDefaults instantiates a new WarehouseStockDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *WarehouseStockDTO) GetType() WarehouseStockType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *WarehouseStockDTO) GetTypeOk() (*WarehouseStockType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *WarehouseStockDTO) SetType(v WarehouseStockType)`

SetType sets Type field to given value.


### GetCount

`func (o *WarehouseStockDTO) GetCount() int64`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *WarehouseStockDTO) GetCountOk() (*int64, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *WarehouseStockDTO) SetCount(v int64)`

SetCount sets Count field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


