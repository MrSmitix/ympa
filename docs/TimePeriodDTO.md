# OpenapiClient::TimePeriodDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **time_period** | **Integer** | Продолжительность в указанных единицах. |  |
| **time_unit** | [**TimeUnitType**](TimeUnitType.md) |  |  |
| **comment** | **String** | Комментарий. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TimePeriodDTO.new(
  time_period: null,
  time_unit: null,
  comment: null
)
```

