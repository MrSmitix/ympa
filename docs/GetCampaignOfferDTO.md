# OpenapiClient::GetCampaignOfferDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  |
| **quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] |
| **available** | **Boolean** | Есть ли товар в продаже.  | [optional] |
| **basic_price** | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] |
| **campaign_price** | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] |
| **status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] |
| **errors** | [**Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] |
| **warnings** | [**Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetCampaignOfferDTO.new(
  offer_id: null,
  quantum: null,
  available: null,
  basic_price: null,
  campaign_price: null,
  status: null,
  errors: null,
  warnings: null
)
```

