# OpenapiClient::GetPriceWithDiscountDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **value** | **Float** | Значение. |  |
| **currency_id** | [**CurrencyType**](CurrencyType.md) |  |  |
| **discount_base** | **Float** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] |
| **updated_at** | **Time** | Время последнего обновления. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPriceWithDiscountDTO.new(
  value: null,
  currency_id: null,
  discount_base: null,
  updated_at: null
)
```

