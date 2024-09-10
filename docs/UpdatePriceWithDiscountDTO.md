# OpenapiClient::UpdatePriceWithDiscountDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **value** | **Float** | Значение. |  |
| **currency_id** | [**CurrencyType**](CurrencyType.md) |  |  |
| **discount_base** | **Float** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdatePriceWithDiscountDTO.new(
  value: null,
  currency_id: null,
  discount_base: null
)
```

