# GoodsStatsWarehouseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор склада. | [optional] 
**Name** | **String** | Название склада. | [optional] 
**Stocks** | [**WarehouseStockDTO[]**](WarehouseStockDTO.md) | Информация об остатках товаров на складе. | 

## Examples

- Prepare the resource
```powershell
$GoodsStatsWarehouseDTO = Initialize-ympa_powershell_clientGoodsStatsWarehouseDTO  -Id null `
 -Name null `
 -Stocks null
```

- Convert the resource to JSON
```powershell
$GoodsStatsWarehouseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

