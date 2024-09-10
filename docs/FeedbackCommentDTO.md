# ympa_r_client::FeedbackCommentDTO

Комментарий к отзыву на магазин.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор ответа. | [optional] 
**parentId** | **integer** | Идентификатор родительского ответа. | [optional] 
**body** | **character** | Текст ответа. | [optional] 
**createdAt** | **character** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**updatedAt** | **character** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**array[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 


