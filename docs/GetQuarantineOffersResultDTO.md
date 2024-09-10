# OpenapiClient::GetQuarantineOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **offers** | [**Array&lt;QuarantineOfferDTO&gt;**](QuarantineOfferDTO.md) | Страница списка товаров в карантине. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetQuarantineOffersResultDTO.new(
  paging: null,
  offers: null
)
```

