# FeedbackCommentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор ответа. | [optional]
**parent_id** | Option<**i64**> | Идентификатор родительского ответа. | [optional]
**body** | Option<**String**> | Текст ответа. | [optional]
**created_at** | Option<**String**> | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional]
**updated_at** | Option<**String**> | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional]
**author** | Option<[**models::FeedbackCommentAuthorDto**](FeedbackCommentAuthorDTO.md)> |  | [optional]
**children** | Option<[**Vec<models::FeedbackCommentDto>**](FeedbackCommentDTO.md)> | Дочерние ответы. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


