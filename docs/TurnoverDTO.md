# OpenapiClient::TurnoverDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **turnover** | [**TurnoverType**](TurnoverType.md) |  |  |
| **turnover_days** | **Float** | Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TurnoverDTO.new(
  turnover: null,
  turnover_days: null
)
```

