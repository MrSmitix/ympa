# OpenapiClient::GetPromoOffersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **promo_id** | **String** | Идентификатор акции. |  |
| **status_type** | [**PromoOfferParticipationStatusFilterType**](PromoOfferParticipationStatusFilterType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPromoOffersRequest.new(
  promo_id: null,
  status_type: null
)
```

