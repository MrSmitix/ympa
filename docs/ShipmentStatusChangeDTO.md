# ShipmentStatusChangeDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**Description** | **String** | Описание статуса отгрузки. | [optional] 
**UpdateTime** | **System.DateTime** | Время последнего изменения статуса отгрузки. | [optional] 

## Examples

- Prepare the resource
```powershell
$ShipmentStatusChangeDTO = Initialize-ympa_powershell_clientShipmentStatusChangeDTO  -Status null `
 -Description null `
 -UpdateTime null
```

- Convert the resource to JSON
```powershell
$ShipmentStatusChangeDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

