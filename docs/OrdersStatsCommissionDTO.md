# OpenapiClient::OrdersStatsCommissionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OrdersStatsCommissionType**](OrdersStatsCommissionType.md) |  | [optional] |
| **actual** | **Float** | Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsCommissionDTO.new(
  type: null,
  actual: null
)
```

