# SearchShipmentsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**SearchShipmentsResponseDTO**](SearchShipmentsResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SearchShipmentsResponse = Initialize-ympa_powershell_clientSearchShipmentsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$SearchShipmentsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

