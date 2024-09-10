# OAIFeedbackCommentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор ответа. | [optional] 
**parentId** | **NSNumber*** | Идентификатор родительского ответа. | [optional] 
**body** | **NSString*** | Текст ответа. | [optional] 
**createdAt** | **NSDate*** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**updatedAt** | **NSDate*** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**author** | [**OAIFeedbackCommentAuthorDTO***](OAIFeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**NSArray&lt;OAIFeedbackCommentDTO&gt;***](OAIFeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


