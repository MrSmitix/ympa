# OpenapiClient::OutletWorkingScheduleItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_day** | [**DayOfWeekType**](DayOfWeekType.md) |  |  |
| **end_day** | [**DayOfWeekType**](DayOfWeekType.md) |  |  |
| **start_time** | **String** | Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  |  |
| **end_time** | **String** | Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OutletWorkingScheduleItemDTO.new(
  start_day: null,
  end_day: null,
  start_time: null,
  end_time: null
)
```

