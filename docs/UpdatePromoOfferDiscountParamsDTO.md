# OpenapiClient::UpdatePromoOfferDiscountParamsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **price** | **Integer** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  | [optional] |
| **promo_price** | **Integer** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdatePromoOfferDiscountParamsDTO.new(
  price: null,
  promo_price: null
)
```

