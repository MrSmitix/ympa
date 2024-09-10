# OpenapiClient::PromoOfferDiscountParamsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **price** | **Integer** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] |
| **promo_price** | **Integer** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] |
| **max_promo_price** | **Integer** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PromoOfferDiscountParamsDTO.new(
  price: null,
  promo_price: null,
  max_promo_price: null
)
```

