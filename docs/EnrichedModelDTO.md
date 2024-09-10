# OpenapiClient::EnrichedModelDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор модели товара. | [optional] |
| **name** | **String** | Название модели товара. | [optional] |
| **prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] |
| **offers** | [**Array&lt;ModelOfferDTO&gt;**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] |
| **offline_offers** | **Integer** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] |
| **online_offers** | **Integer** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::EnrichedModelDTO.new(
  id: null,
  name: null,
  prices: null,
  offers: null,
  offline_offers: null,
  online_offers: null
)
```

