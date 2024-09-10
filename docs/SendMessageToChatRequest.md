# SendMessageToChatRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** | Текст сообщения. Максимальная длина — 4096 символа. | 

## Examples

- Prepare the resource
```powershell
$SendMessageToChatRequest = Initialize-ympa_powershell_clientSendMessageToChatRequest  -Message null
```

- Convert the resource to JSON
```powershell
$SendMessageToChatRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

