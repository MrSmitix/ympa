# FeedbackCommentDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор ответа. | [optional] [default to nothing]
**parentId** | **Int64** | Идентификатор родительского ответа. | [optional] [default to nothing]
**body** | **String** | Текст ответа. | [optional] [default to nothing]
**createdAt** | **ZonedDateTime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to nothing]
**updatedAt** | **ZonedDateTime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to nothing]
**author** | [***FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] [default to nothing]
**children** | [**Vector{FeedbackCommentDTO}**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


