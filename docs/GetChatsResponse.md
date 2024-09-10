# GetChatsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetChatsInfoDTO**](GetChatsInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetChatsResponse = Initialize-ympa_powershell_clientGetChatsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetChatsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

