# WarehouseGroupDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Название группы складов. | 
**MainWarehouse** | [**WarehouseDTO**](WarehouseDTO.md) |  | 
**Warehouses** | [**WarehouseDTO[]**](WarehouseDTO.md) | Список складов, входящих в группу. | 

## Examples

- Prepare the resource
```powershell
$WarehouseGroupDTO = Initialize-ympa_powershell_clientWarehouseGroupDTO  -Name null `
 -MainWarehouse null `
 -Warehouses null
```

- Convert the resource to JSON
```powershell
$WarehouseGroupDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

