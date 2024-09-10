# FulfillmentWarehousesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Warehouses** | [**FulfillmentWarehouseDTO[]**](FulfillmentWarehouseDTO.md) | Список складов Маркета (FBY). | 

## Examples

- Prepare the resource
```powershell
$FulfillmentWarehousesDTO = Initialize-ympa_powershell_clientFulfillmentWarehousesDTO  -Warehouses null
```

- Convert the resource to JSON
```powershell
$FulfillmentWarehousesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

