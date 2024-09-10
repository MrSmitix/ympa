
# FeedbackDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **comments** | [**kotlin.collections.List&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. |  |
| **id** | **kotlin.Long** | Идентификатор отзыва. |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional] |
| **text** | **kotlin.String** | Комментарий автора отзыва. |  [optional] |
| **state** | [**FeedbackStateType**](FeedbackStateType.md) |  |  [optional] |
| **author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  |  [optional] |
| **pro** | **kotlin.String** | Достоинства магазина, описанные в отзыве. |  [optional] |
| **contra** | **kotlin.String** | Недостатки магазина, описанные в отзыве. |  [optional] |
| **shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  |  [optional] |
| **resolved** | **kotlin.Boolean** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  |  [optional] |
| **verified** | **kotlin.Boolean** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional] |
| **recommend** | **kotlin.Boolean** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional] |
| **grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  |  [optional] |
| **order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  |  [optional] |



