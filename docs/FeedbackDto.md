# FeedbackDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор отзыва. | [optional] [default to null]
**createdAt** | **String!** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null]
**text** | **String!** | Комментарий автора отзыва. | [optional] [default to null]
**state** | [***FeedbackStateType**](FeedbackStateType.md) |  | [optional] [default to null]
**author** | [***FeedbackAuthorDto**](FeedbackAuthorDTO.md) |  | [optional] [default to null]
**pro** | **String!** | Достоинства магазина, описанные в отзыве. | [optional] [default to null]
**contra** | **String!** | Недостатки магазина, описанные в отзыве. | [optional] [default to null]
**comments** | [**FeedbackCommentDto**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | [default to null]
**shop** | [***FeedbackShopDto**](FeedbackShopDTO.md) |  | [optional] [default to null]
**resolved** | **Boolean!** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] [default to null]
**verified** | **Boolean!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to null]
**recommend** | **Boolean!** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to null]
**grades** | [***FeedbackGradesDto**](FeedbackGradesDTO.md) |  | [optional] [default to null]
**order** | [***FeedbackOrderDto**](FeedbackOrderDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


