# FeedbackCommentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор ответа. | [optional] [default to None]
**parent_id** | **i64** | Идентификатор родительского ответа. | [optional] [default to None]
**body** | **String** | Текст ответа. | [optional] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] [default to None]
**updated_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] [default to None]
**author** | [***models::FeedbackCommentAuthorDto**](FeedbackCommentAuthorDTO.md) |  | [optional] [default to None]
**children** | [**Vec<models::FeedbackCommentDto>**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


