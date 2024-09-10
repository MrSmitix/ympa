# OpenapiClient::GetOffersResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offers** | [**Array&lt;OfferDTO&gt;**](OfferDTO.md) | Список предложений магазина. |  |
| **pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOffersResponse.new(
  offers: null,
  pager: null
)
```

