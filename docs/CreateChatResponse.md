# CreateChatResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**CreateChatResultDTO**](CreateChatResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateChatResponse = Initialize-ympa_powershell_clientCreateChatResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$CreateChatResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

