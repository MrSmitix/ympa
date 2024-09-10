# OpenapiClient::FeedbackFactorDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор параметра. | [optional] |
| **title** | **String** | Название параметра. Например, &#x60;Скорость обработки заказа&#x60;. | [optional] |
| **description** | **String** | Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;. | [optional] |
| **value** | **Integer** | Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка).  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedbackFactorDTO.new(
  id: null,
  title: null,
  description: null,
  value: null
)
```

