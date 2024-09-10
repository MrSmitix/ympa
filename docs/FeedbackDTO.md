
# Table `FeedbackDTO`
(mapped from: FeedbackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**comments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор отзыва. |  [optional]
**createdAt** | createdAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  [optional]
**text** | text | text |  | **kotlin.String** | Комментарий автора отзыва. |  [optional]
**state** | state | long |  | [**FeedbackStateType**](FeedbackStateType.md) |  |  [optional] [foreignkey]
**author** | author | long |  | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  |  [optional] [foreignkey]
**pro** | pro | text |  | **kotlin.String** | Достоинства магазина, описанные в отзыве. |  [optional]
**contra** | contra | text |  | **kotlin.String** | Недостатки магазина, описанные в отзыве. |  [optional]
**shop** | shop | long |  | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  |  [optional] [foreignkey]
**resolved** | resolved | boolean |  | **kotlin.Boolean** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  |  [optional]
**verified** | verified | boolean |  | **kotlin.Boolean** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional]
**recommend** | recommend | boolean |  | **kotlin.Boolean** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  |  [optional]
**grades** | grades | long |  | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  |  [optional] [foreignkey]
**order** | order | long |  | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  |  [optional] [foreignkey]


# **Table `FeedbackDTOFeedbackCommentDTO`**
(mapped from: FeedbackDTOFeedbackCommentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedbackDTO | feedbackDTO | long | | kotlin.Long | Primary Key | *one*
feedbackCommentDTO | feedbackCommentDTO | long | | kotlin.Long | Foreign Key | *many*
















