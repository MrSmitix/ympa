# ChatMessagePayloadDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Имя файла. | 
**Url** | **String** | Ссылка для скачивания файла. | 
**Size** | **Int32** | Размер файла в байтах. | 

## Examples

- Prepare the resource
```powershell
$ChatMessagePayloadDTO = Initialize-ympa_powershell_clientChatMessagePayloadDTO  -Name null `
 -Url null `
 -Size null
```

- Convert the resource to JSON
```powershell
$ChatMessagePayloadDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

