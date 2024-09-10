# OpenapiClient::GetCampaignOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **offers** | [**Array&lt;GetCampaignOfferDTO&gt;**](GetCampaignOfferDTO.md) | Страница списка товаров. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetCampaignOffersResultDTO.new(
  paging: null,
  offers: null
)
```

