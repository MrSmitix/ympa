# OpenapiClient::UpdateStockDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  |
| **items** | [**Array&lt;UpdateStockItemDTO&gt;**](UpdateStockItemDTO.md) | Информация об остатках товара.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateStockDTO.new(
  sku: null,
  items: null
)
```

