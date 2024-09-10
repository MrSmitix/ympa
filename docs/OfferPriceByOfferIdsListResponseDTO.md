# OpenapiClient::OfferPriceByOfferIdsListResponseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offers** | [**Array&lt;OfferPriceByOfferIdsResponseDTO&gt;**](OfferPriceByOfferIdsResponseDTO.md) | Страница списка цен. |  |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferPriceByOfferIdsListResponseDTO.new(
  offers: null,
  paging: null
)
```

