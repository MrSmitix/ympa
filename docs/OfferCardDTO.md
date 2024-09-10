# OpenapiClient::OfferCardDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  |
| **mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] |
| **parameter_values** | [**Array&lt;ParameterValueDTO&gt;**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] |
| **card_status** | [**OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] |
| **content_rating** | **Integer** | Процент заполненности карточки. | [optional] |
| **recommendations** | [**Array&lt;OfferCardRecommendationDTO&gt;**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] |
| **errors** | [**Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] |
| **warnings** | [**Array&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferCardDTO.new(
  offer_id: null,
  mapping: null,
  parameter_values: null,
  card_status: null,
  content_rating: null,
  recommendations: null,
  errors: null,
  warnings: null
)
```

