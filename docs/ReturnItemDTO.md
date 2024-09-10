# OpenapiClient::ReturnItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **market_sku** | **Integer** | SKU на Маркете. | [optional] |
| **shop_sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  |
| **count** | **Integer** | Количество единиц товара. |  |
| **decisions** | [**Array&lt;ReturnDecisionDTO&gt;**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] |
| **instances** | [**Array&lt;ReturnInstanceDTO&gt;**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] |
| **tracks** | [**Array&lt;TrackDTO&gt;**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ReturnItemDTO.new(
  market_sku: null,
  shop_sku: null,
  count: null,
  decisions: null,
  instances: null,
  tracks: null
)
```

