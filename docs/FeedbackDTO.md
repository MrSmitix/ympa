# FeedbackDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор отзыва. | [optional] [default to nothing]
**createdAt** | **ZonedDateTime** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to nothing]
**text** | **String** | Комментарий автора отзыва. | [optional] [default to nothing]
**state** | [***FeedbackStateType**](FeedbackStateType.md) |  | [optional] [default to nothing]
**author** | [***FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] [default to nothing]
**pro** | **String** | Достоинства магазина, описанные в отзыве. | [optional] [default to nothing]
**contra** | **String** | Недостатки магазина, описанные в отзыве. | [optional] [default to nothing]
**comments** | [**Vector{FeedbackCommentDTO}**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | [default to nothing]
**shop** | [***FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] [default to nothing]
**resolved** | **Bool** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] [default to nothing]
**verified** | **Bool** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to nothing]
**recommend** | **Bool** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to nothing]
**grades** | [***FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] [default to nothing]
**order** | [***FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


