# GetChatHistoryResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**ChatMessagesResultDTO**](ChatMessagesResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetChatHistoryResponse = Initialize-ympa_powershell_clientGetChatHistoryResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetChatHistoryResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

