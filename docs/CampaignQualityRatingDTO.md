# OpenapiClient::CampaignQualityRatingDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор магазина. |  |
| **ratings** | [**Array&lt;QualityRatingDTO&gt;**](QualityRatingDTO.md) | Список значений индекса качества. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CampaignQualityRatingDTO.new(
  campaign_id: null,
  ratings: null
)
```

