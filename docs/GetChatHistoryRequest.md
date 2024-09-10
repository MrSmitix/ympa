# GetChatHistoryRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageIdFrom** | **Int64** | Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetChatHistoryRequest = Initialize-ympa_powershell_clientGetChatHistoryRequest  -MessageIdFrom null
```

- Convert the resource to JSON
```powershell
$GetChatHistoryRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

