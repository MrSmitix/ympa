# GetChatInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChatId** | **Int64** | Идентификатор чата. | 
**OrderId** | **Int64** | Идентификатор заказа. | 
**Type** | [**ChatType**](ChatType.md) |  | 
**Status** | [**ChatStatusType**](ChatStatusType.md) |  | 
**CreatedAt** | **System.DateTime** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**UpdatedAt** | **System.DateTime** | Дата и время последнего сообщения в чате. | 

## Examples

- Prepare the resource
```powershell
$GetChatInfoDTO = Initialize-ympa_powershell_clientGetChatInfoDTO  -ChatId null `
 -OrderId null `
 -Type null `
 -Status null `
 -CreatedAt null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$GetChatInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

