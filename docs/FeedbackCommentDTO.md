
# Table `FeedbackCommentDTO`
(mapped from: FeedbackCommentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор ответа. |  [optional]
**parentId** | parentId | long |  | **kotlin.Long** | Идентификатор родительского ответа. |  [optional]
**body** | body | text |  | **kotlin.String** | Текст ответа. |  [optional]
**createdAt** | createdAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional]
**updatedAt** | updatedAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional]
**author** | author | long |  | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  |  [optional] [foreignkey]
**children** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Дочерние ответы. |  [optional]








# **Table `FeedbackCommentDTOFeedbackCommentDTO`**
(mapped from: FeedbackCommentDTOFeedbackCommentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedbackCommentDTO | feedbackCommentDTO | long | | kotlin.Long | Primary Key | *one*
feedbackCommentDTO | feedbackCommentDTO | long | | kotlin.Long | Foreign Key | *many*



