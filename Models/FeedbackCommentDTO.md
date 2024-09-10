# FeedbackCommentDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Long** | Идентификатор ответа. | [optional] [default to null] |
| **parentId** | **Long** | Идентификатор родительского ответа. | [optional] [default to null] |
| **body** | **String** | Текст ответа. | [optional] [default to null] |
| **createdAt** | **Date** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null] |
| **updatedAt** | **Date** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null] |
| **author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] [default to null] |
| **children** | [**List**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

