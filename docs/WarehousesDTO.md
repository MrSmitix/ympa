# WarehousesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Warehouses** | [**WarehouseDTO[]**](WarehouseDTO.md) | Список складов, не входящих в группы. | 
**WarehouseGroups** | [**WarehouseGroupDTO[]**](WarehouseGroupDTO.md) | Список групп складов. | 

## Examples

- Prepare the resource
```powershell
$WarehousesDTO = Initialize-ympa_powershell_clientWarehousesDTO  -Warehouses null `
 -WarehouseGroups null
```

- Convert the resource to JSON
```powershell
$WarehousesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

