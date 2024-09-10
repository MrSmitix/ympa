# GetWarehouseStocksDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Warehouses** | [**[]WarehouseOffersDTO**](WarehouseOffersDTO.md) | Страница списка складов. | 

## Methods

### NewGetWarehouseStocksDTO

`func NewGetWarehouseStocksDTO(warehouses []WarehouseOffersDTO, ) *GetWarehouseStocksDTO`

NewGetWarehouseStocksDTO instantiates a new GetWarehouseStocksDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetWarehouseStocksDTOWithDefaults

`func NewGetWarehouseStocksDTOWithDefaults() *GetWarehouseStocksDTO`

NewGetWarehouseStocksDTOWithDefaults instantiates a new GetWarehouseStocksDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *GetWarehouseStocksDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetWarehouseStocksDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetWarehouseStocksDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetWarehouseStocksDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetWarehouses

`func (o *GetWarehouseStocksDTO) GetWarehouses() []WarehouseOffersDTO`

GetWarehouses returns the Warehouses field if non-nil, zero value otherwise.

### GetWarehousesOk

`func (o *GetWarehouseStocksDTO) GetWarehousesOk() (*[]WarehouseOffersDTO, bool)`

GetWarehousesOk returns a tuple with the Warehouses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouses

`func (o *GetWarehouseStocksDTO) SetWarehouses(v []WarehouseOffersDTO)`

SetWarehouses sets Warehouses field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


