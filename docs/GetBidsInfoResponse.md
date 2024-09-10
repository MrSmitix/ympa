# GetBidsInfoResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetBidsInfoResponseDTO**](GetBidsInfoResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBidsInfoResponse = Initialize-ympa_powershell_clientGetBidsInfoResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetBidsInfoResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

