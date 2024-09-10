# ExtensionShipmentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CurrentStatus** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**AvailableActions** | [**ShipmentActionType[]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Examples

- Prepare the resource
```powershell
$ExtensionShipmentDTO = Initialize-ympa_powershell_clientExtensionShipmentDTO  -CurrentStatus null `
 -AvailableActions null
```

- Convert the resource to JSON
```powershell
$ExtensionShipmentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

