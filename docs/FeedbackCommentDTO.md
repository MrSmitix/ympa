

# FeedbackCommentDTO

Комментарий к отзыву на магазин.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор ответа. |  [optional]
**parentId** | **Long** | Идентификатор родительского ответа. |  [optional]
**body** | **String** | Текст ответа. |  [optional]
**createdAt** | **OffsetDateTime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional]
**updatedAt** | **OffsetDateTime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional]
**author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  |  [optional]
**children** | [**Seq&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Дочерние ответы. |  [optional]



