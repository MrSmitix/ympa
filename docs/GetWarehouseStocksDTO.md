# GetWarehouseStocksDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Warehouses** | [**WarehouseOffersDTO[]**](WarehouseOffersDTO.md) | Страница списка складов. | 

## Examples

- Prepare the resource
```powershell
$GetWarehouseStocksDTO = Initialize-ympa_powershell_clientGetWarehouseStocksDTO  -Paging null `
 -Warehouses null
```

- Convert the resource to JSON
```powershell
$GetWarehouseStocksDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

