# SetOrderShipmentBoxesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**ShipmentBoxesDTO**](ShipmentBoxesDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SetOrderShipmentBoxesResponse = Initialize-ympa_powershell_clientSetOrderShipmentBoxesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$SetOrderShipmentBoxesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

