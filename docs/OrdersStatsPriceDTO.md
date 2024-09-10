# OpenapiClient::OrdersStatsPriceDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OrdersStatsPriceType**](OrdersStatsPriceType.md) |  | [optional] |
| **cost_per_item** | **Float** | Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] |
| **total** | **Float** | Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsPriceDTO.new(
  type: null,
  cost_per_item: null,
  total: null
)
```

