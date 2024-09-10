# FEEDBACK_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор отзыва. | [optional] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] [default to null]
**text** | [**STRING_32**](STRING_32.md) | Комментарий автора отзыва. | [optional] [default to null]
**state** | [**FEEDBACK_STATE_TYPE**](FeedbackStateType.md) |  | [optional] [default to null]
**author** | [**FEEDBACK_AUTHOR_DTO**](FeedbackAuthorDTO.md) |  | [optional] [default to null]
**pro** | [**STRING_32**](STRING_32.md) | Достоинства магазина, описанные в отзыве. | [optional] [default to null]
**contra** | [**STRING_32**](STRING_32.md) | Недостатки магазина, описанные в отзыве. | [optional] [default to null]
**comments** | [**LIST [FEEDBACK_COMMENT_DTO]**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | [default to null]
**shop** | [**FEEDBACK_SHOP_DTO**](FeedbackShopDTO.md) |  | [optional] [default to null]
**resolved** | **BOOLEAN** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] [default to null]
**verified** | **BOOLEAN** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to null]
**recommend** | **BOOLEAN** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] [default to null]
**grades** | [**FEEDBACK_GRADES_DTO**](FeedbackGradesDTO.md) |  | [optional] [default to null]
**order** | [**FEEDBACK_ORDER_DTO**](FeedbackOrderDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


