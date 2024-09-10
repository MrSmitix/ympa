# OpenapiClient::GoodsFeedbackDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feedback_id** | **Integer** | Идентификатор отзыва.  |  |
| **created_at** | **Time** | Дата и время создания отзыва. |  |
| **need_reaction** | **Boolean** | Нужен ли ответ на отзыв. |  |
| **identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  |  |
| **author** | **String** | Имя автора отзыва. | [optional] |
| **description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] |
| **media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] |
| **statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsFeedbackDTO.new(
  feedback_id: null,
  created_at: null,
  need_reaction: null,
  identifiers: null,
  author: null,
  description: null,
  media: null,
  statistics: null
)
```

