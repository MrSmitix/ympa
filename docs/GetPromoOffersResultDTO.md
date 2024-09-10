# OpenapiClient::GetPromoOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offers** | [**Array&lt;GetPromoOfferDTO&gt;**](GetPromoOfferDTO.md) | Товары, которые участвуют или могут участвовать в акции. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPromoOffersResultDTO.new(
  offers: null,
  paging: null
)
```

