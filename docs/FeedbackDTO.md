# ympa_csharp_client.Model.FeedbackDTO
Отзыв пользователя Яндекс Маркета об указанном магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор отзыва. | [optional] 
**CreatedAt** | **DateTime** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Text** | **string** | Комментарий автора отзыва. | [optional] 
**State** | **FeedbackStateType** |  | [optional] 
**Author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**Pro** | **string** | Достоинства магазина, описанные в отзыве. | [optional] 
**Contra** | **string** | Недостатки магазина, описанные в отзыве. | [optional] 
**Comments** | [**List&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**Shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**Resolved** | **bool** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**Verified** | **bool** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Recommend** | **bool** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**Order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

