# OpenapiClient::GetOfferRecommendationsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_ids** | **Array&lt;String&gt;** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] |
| **cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] |
| **recommended_cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] |
| **competitiveness_filter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOfferRecommendationsRequest.new(
  offer_ids: null,
  cofinance_price_filter: null,
  recommended_cofinance_price_filter: null,
  competitiveness_filter: null
)
```

