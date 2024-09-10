# OpenapiClient::OfferRecommendationsResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **offer_recommendations** | [**Array&lt;OfferRecommendationDTO&gt;**](OfferRecommendationDTO.md) | Страница списка товаров. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferRecommendationsResultDTO.new(
  paging: null,
  offer_recommendations: null
)
```

