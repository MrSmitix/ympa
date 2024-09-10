

# FeedbackDTO

Отзыв пользователя Яндекс Маркета об указанном магазине.

The class is defined in **[FeedbackDTO.java](../../src/main/java/org/openapitools/model/FeedbackDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор отзыва. |  [optional property]
**createdAt** | `OffsetDateTime` | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional property]
**text** | `String` | Комментарий автора отзыва. |  [optional property]
**state** | `FeedbackStateType` |  |  [optional property]
**author** | [`FeedbackAuthorDTO`](FeedbackAuthorDTO.md) |  |  [optional property]
**pro** | `String` | Достоинства магазина, описанные в отзыве. |  [optional property]
**contra** | `String` | Недостатки магазина, описанные в отзыве. |  [optional property]
**comments** | [`List&lt;FeedbackCommentDTO&gt;`](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [`FeedbackShopDTO`](FeedbackShopDTO.md) |  |  [optional property]
**resolved** | `Boolean` | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  |  [optional property]
**verified** | `Boolean` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional property]
**recommend** | `Boolean` | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional property]
**grades** | [`FeedbackGradesDTO`](FeedbackGradesDTO.md) |  |  [optional property]
**order** | [`FeedbackOrderDTO`](FeedbackOrderDTO.md) |  |  [optional property]
















