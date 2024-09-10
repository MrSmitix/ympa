# OpenapiClient::GoodsFeedbackStatisticsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rating** | **Integer** | Оценка товара. |  |
| **comments_count** | **Integer** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  |  |
| **recommended** | **Boolean** | Рекомендуют ли этот товар. | [optional] |
| **paid_amount** | **Integer** | Количество баллов Плюса, которое автор получил за отзыв. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsFeedbackStatisticsDTO.new(
  rating: null,
  comments_count: null,
  recommended: null,
  paid_amount: null
)
```

