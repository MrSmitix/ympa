# GetPromosResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetPromosResultDTO**](GetPromosResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromosResponse = Initialize-ympa_powershell_clientGetPromosResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetPromosResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

