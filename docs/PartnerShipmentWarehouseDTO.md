# PartnerShipmentWarehouseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор склада отправления. | [optional] 
**Name** | **String** | Наименование склада отправления. | [optional] 
**Address** | **String** | Адрес склада отправления. | [optional] 

## Examples

- Prepare the resource
```powershell
$PartnerShipmentWarehouseDTO = Initialize-ympa_powershell_clientPartnerShipmentWarehouseDTO  -Id null `
 -Name null `
 -Address null
```

- Convert the resource to JSON
```powershell
$PartnerShipmentWarehouseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

