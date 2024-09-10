# OpenapiClient::CampaignSettingsScheduleDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **available_on_holidays** | **Boolean** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] |
| **custom_holidays** | **Array&lt;String&gt;** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. |  |
| **custom_working_days** | **Array&lt;String&gt;** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. |  |
| **period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] |
| **total_holidays** | **Array&lt;String&gt;** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. |  |
| **weekly_holidays** | **Array&lt;Integer&gt;** | Список выходных дней недели и государственных праздников. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CampaignSettingsScheduleDTO.new(
  available_on_holidays: null,
  custom_holidays: null,
  custom_working_days: null,
  period: null,
  total_holidays: null,
  weekly_holidays: null
)
```

