# GoodsStatsWarehouseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор склада. | [optional] 
**Name** | Pointer to **string** | Название склада. | [optional] 
**Stocks** | [**[]WarehouseStockDTO**](WarehouseStockDTO.md) | Информация об остатках товаров на складе. | 

## Methods

### NewGoodsStatsWarehouseDTO

`func NewGoodsStatsWarehouseDTO(stocks []WarehouseStockDTO, ) *GoodsStatsWarehouseDTO`

NewGoodsStatsWarehouseDTO instantiates a new GoodsStatsWarehouseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsStatsWarehouseDTOWithDefaults

`func NewGoodsStatsWarehouseDTOWithDefaults() *GoodsStatsWarehouseDTO`

NewGoodsStatsWarehouseDTOWithDefaults instantiates a new GoodsStatsWarehouseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GoodsStatsWarehouseDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GoodsStatsWarehouseDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GoodsStatsWarehouseDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *GoodsStatsWarehouseDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *GoodsStatsWarehouseDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GoodsStatsWarehouseDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GoodsStatsWarehouseDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GoodsStatsWarehouseDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStocks

`func (o *GoodsStatsWarehouseDTO) GetStocks() []WarehouseStockDTO`

GetStocks returns the Stocks field if non-nil, zero value otherwise.

### GetStocksOk

`func (o *GoodsStatsWarehouseDTO) GetStocksOk() (*[]WarehouseStockDTO, bool)`

GetStocksOk returns a tuple with the Stocks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStocks

`func (o *GoodsStatsWarehouseDTO) SetStocks(v []WarehouseStockDTO)`

SetStocks sets Stocks field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


