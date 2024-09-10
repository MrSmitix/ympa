# FeedbackCommentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор ответа. | [optional] 
**ParentId** | **Int64** | Идентификатор родительского ответа. | [optional] 
**Body** | **String** | Текст ответа. | [optional] 
**CreatedAt** | **System.DateTime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**UpdatedAt** | **System.DateTime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**Children** | [**FeedbackCommentDTO[]**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackCommentDTO = Initialize-ympa_powershell_clientFeedbackCommentDTO  -Id null `
 -ParentId null `
 -Body null `
 -CreatedAt null `
 -UpdatedAt null `
 -Author null `
 -Children null
```

- Convert the resource to JSON
```powershell
$FeedbackCommentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

