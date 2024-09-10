# FeedbackDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отзыва. | [optional] 
**createdAt** | **\DateTime** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. | [optional] 
**text** | **string** | Комментарий автора отзыва. | [optional] 
**state** | [**OpenAPI\Server\Model\FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**author** | [**OpenAPI\Server\Model\FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**pro** | **string** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **string** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**OpenAPI\Server\Model\FeedbackCommentDTO**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [**OpenAPI\Server\Model\FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**resolved** | **bool** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. | [optional] 
**verified** | **bool** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. | [optional] 
**recommend** | **bool** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. | [optional] 
**grades** | [**OpenAPI\Server\Model\FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**order** | [**OpenAPI\Server\Model\FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


