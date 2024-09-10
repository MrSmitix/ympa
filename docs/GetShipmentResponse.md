# GetShipmentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**ShipmentDTO**](ShipmentDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetShipmentResponse = Initialize-ympa_powershell_clientGetShipmentResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetShipmentResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

