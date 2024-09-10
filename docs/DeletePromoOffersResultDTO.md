# OpenapiClient::DeletePromoOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rejected_offers** | [**Array&lt;RejectedPromoOfferDeleteDTO&gt;**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DeletePromoOffersResultDTO.new(
  rejected_offers: null
)
```

