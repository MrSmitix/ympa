# OpenapiClient::OfferForRecommendationDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] |
| **price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] |
| **cofinance_price** | [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] |
| **competitiveness** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] |
| **shows** | **Integer** | Количество показов карточки товара за последние 7 дней. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferForRecommendationDTO.new(
  offer_id: null,
  price: null,
  cofinance_price: null,
  competitiveness: null,
  shows: null
)
```

