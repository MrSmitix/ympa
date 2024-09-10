# OpenapiClient::UpdateOrderStorageLimitRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **new_date** | **Date** | Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOrderStorageLimitRequest.new(
  new_date: null
)
```

