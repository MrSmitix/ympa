# ConfirmShipmentRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalShipmentId** | **String** | Идентификатор отгрузки в системе поставщика. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConfirmShipmentRequest = Initialize-ympa_powershell_clientConfirmShipmentRequest  -ExternalShipmentId null
```

- Convert the resource to JSON
```powershell
$ConfirmShipmentRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

