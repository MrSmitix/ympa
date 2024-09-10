# OpenapiClient::OutletWorkingScheduleDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **work_in_holiday** | **Boolean** | Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.  | [optional] |
| **schedule_items** | [**Array&lt;OutletWorkingScheduleItemDTO&gt;**](OutletWorkingScheduleItemDTO.md) | Список расписаний работы точки продаж.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OutletWorkingScheduleDTO.new(
  work_in_holiday: null,
  schedule_items: null
)
```

