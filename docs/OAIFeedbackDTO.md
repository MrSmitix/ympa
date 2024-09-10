# OAIFeedbackDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор отзыва. | [optional] 
**createdAt** | **NSDate*** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**text** | **NSString*** | Комментарий автора отзыва. | [optional] 
**state** | [**OAIFeedbackStateType***](OAIFeedbackStateType.md) |  | [optional] 
**author** | [**OAIFeedbackAuthorDTO***](OAIFeedbackAuthorDTO.md) |  | [optional] 
**pro** | **NSString*** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **NSString*** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**NSArray&lt;OAIFeedbackCommentDTO&gt;***](OAIFeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [**OAIFeedbackShopDTO***](OAIFeedbackShopDTO.md) |  | [optional] 
**resolved** | **NSNumber*** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **NSNumber*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**recommend** | **NSNumber*** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**grades** | [**OAIFeedbackGradesDTO***](OAIFeedbackGradesDTO.md) |  | [optional] 
**order** | [**OAIFeedbackOrderDTO***](OAIFeedbackOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


