# FulfillmentWarehouseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор склада. | 
**Name** | **String** | Название склада. | 
**Address** | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FulfillmentWarehouseDTO = Initialize-ympa_powershell_clientFulfillmentWarehouseDTO  -Id null `
 -Name null `
 -Address null
```

- Convert the resource to JSON
```powershell
$FulfillmentWarehouseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

