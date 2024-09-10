# ChatMessageDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageId** | **Int64** | Идентификатор сообщения. | 
**CreatedAt** | **System.DateTime** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**VarSender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**Message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] 
**Payload** | [**ChatMessagePayloadDTO[]**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatMessageDTO = Initialize-ympa_powershell_clientChatMessageDTO  -MessageId null `
 -CreatedAt null `
 -VarSender null `
 -Message null `
 -Payload null
```

- Convert the resource to JSON
```powershell
$ChatMessageDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

