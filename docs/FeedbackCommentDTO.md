# Api.FeedbackCommentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Идентификатор ответа. | [optional] 
**parentId** | **Number** | Идентификатор родительского ответа. | [optional] 
**body** | **String** | Текст ответа. | [optional] 
**createdAt** | **Date** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**updatedAt** | **Date** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 


