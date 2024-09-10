# OrdersStatsWarehouseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор склада. | [optional] 
**Name** | **String** | Название склада. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsWarehouseDTO = Initialize-ympa_powershell_clientOrdersStatsWarehouseDTO  -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$OrdersStatsWarehouseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

