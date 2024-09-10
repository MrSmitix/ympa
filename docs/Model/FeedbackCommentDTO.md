# FeedbackCommentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор ответа. | [optional] 
**parentId** | **int** | Идентификатор родительского ответа. | [optional] 
**body** | **string** | Текст ответа. | [optional] 
**createdAt** | **\DateTime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. | [optional] 
**updatedAt** | **\DateTime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. | [optional] 
**author** | [**OpenAPI\Server\Model\FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**OpenAPI\Server\Model\FeedbackCommentDTO**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


