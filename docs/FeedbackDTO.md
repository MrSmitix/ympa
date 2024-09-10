# OpenapiClient::FeedbackDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор отзыва. | [optional] |
| **created_at** | **Time** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] |
| **text** | **String** | Комментарий автора отзыва. | [optional] |
| **state** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] |
| **author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] |
| **pro** | **String** | Достоинства магазина, описанные в отзыве. | [optional] |
| **contra** | **String** | Недостатки магазина, описанные в отзыве. | [optional] |
| **comments** | [**Array&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. |  |
| **shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] |
| **resolved** | **Boolean** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] |
| **verified** | **Boolean** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] |
| **recommend** | **Boolean** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] |
| **grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] |
| **order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedbackDTO.new(
  id: null,
  created_at: null,
  text: null,
  state: null,
  author: null,
  pro: null,
  contra: null,
  comments: null,
  shop: null,
  resolved: null,
  verified: null,
  recommend: null,
  grades: null,
  order: null
)
```

