# WarehouseStockDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**WarehouseStockType**](WarehouseStockType.md) |  | 
**Count** | **Int64** | Значение остатков. | 

## Examples

- Prepare the resource
```powershell
$WarehouseStockDTO = Initialize-ympa_powershell_clientWarehouseStockDTO  -Type null `
 -Count null
```

- Convert the resource to JSON
```powershell
$WarehouseStockDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

