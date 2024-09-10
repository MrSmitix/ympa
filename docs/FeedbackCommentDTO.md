# ympa_csharp_client.Model.FeedbackCommentDTO
Комментарий к отзыву на магазин.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор ответа. | [optional] 
**ParentId** | **long** | Идентификатор родительского ответа. | [optional] 
**Body** | **string** | Текст ответа. | [optional] 
**CreatedAt** | **DateTime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**UpdatedAt** | **DateTime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**Children** | [**List&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

