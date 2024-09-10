

# FeedbackCommentDTO

Комментарий к отзыву на магазин.

The class is defined in **[FeedbackCommentDTO.java](../../src/main/java/org/openapitools/model/FeedbackCommentDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор ответа. |  [optional property]
**parentId** | `Long` | Идентификатор родительского ответа. |  [optional property]
**_body** | `String` | Текст ответа. |  [optional property]
**createdAt** | `OffsetDateTime` | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional property]
**updatedAt** | `OffsetDateTime` | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional property]
**author** | [`FeedbackCommentAuthorDTO`](FeedbackCommentAuthorDTO.md) |  |  [optional property]
**children** | [`List&lt;FeedbackCommentDTO&gt;`](FeedbackCommentDTO.md) | Дочерние ответы. |  [optional property]









