# OpenapiClient::OrderItemPromoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OrderPromoType**](OrderPromoType.md) |  |  |
| **discount** | **Float** | Размер пользовательской скидки в валюте покупателя.  | [optional] |
| **subsidy** | **Float** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] |
| **shop_promo_id** | **String** | Идентификатор акции поставщика.  | [optional] |
| **market_promo_id** | **String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderItemPromoDTO.new(
  type: null,
  discount: null,
  subsidy: null,
  shop_promo_id: null,
  market_promo_id: null
)
```

