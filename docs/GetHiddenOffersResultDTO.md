# OpenapiClient::GetHiddenOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **hidden_offers** | [**Array&lt;HiddenOfferDTO&gt;**](HiddenOfferDTO.md) | Список скрытых товаров. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetHiddenOffersResultDTO.new(
  paging: null,
  hidden_offers: null
)
```

