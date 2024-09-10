# FEEDBACK_COMMENT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор ответа. | [optional] [default to null]
**parent_id** | **INTEGER_64** | Идентификатор родительского ответа. | [optional] [default to null]
**body** | [**STRING_32**](STRING_32.md) | Текст ответа. | [optional] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null]
**author** | [**FEEDBACK_COMMENT_AUTHOR_DTO**](FeedbackCommentAuthorDTO.md) |  | [optional] [default to null]
**children** | [**LIST [FEEDBACK_COMMENT_DTO]**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


