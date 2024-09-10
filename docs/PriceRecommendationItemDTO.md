# OpenapiClient::PriceRecommendationItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании. |  |
| **price** | **Float** | Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PriceRecommendationItemDTO.new(
  campaign_id: null,
  price: null
)
```

