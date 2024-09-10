# feedback_comment_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор ответа. | [optional] 
**parent_id** | **long** | Идентификатор родительского ответа. | [optional] 
**body** | **char \*** | Текст ответа. | [optional] 
**created_at** | **char \*** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**updated_at** | **char \*** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**author** | [**feedback_comment_author_dto_t**](feedback_comment_author_dto.md) \* |  | [optional] 
**children** | [**list_t**](feedback_comment_dto.md) \* | Дочерние ответы. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


