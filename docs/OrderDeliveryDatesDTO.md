# OpenapiClient::OrderDeliveryDatesDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **from_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |
| **to_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |
| **from_time** | **String** | Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.  | [optional] |
| **to_time** | **String** | Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.  | [optional] |
| **real_delivery_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderDeliveryDatesDTO.new(
  from_date: 23-09-2022,
  to_date: 23-09-2022,
  from_time: null,
  to_time: null,
  real_delivery_date: 23-09-2022
)
```

