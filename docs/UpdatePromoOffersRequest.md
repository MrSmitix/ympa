# OpenapiClient::UpdatePromoOffersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **promo_id** | **String** | Идентификатор акции. |  |
| **offers** | [**Array&lt;UpdatePromoOfferDTO&gt;**](UpdatePromoOfferDTO.md) | Товары, которые необходимо добавить в акцию или цены которых нужно изменить. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdatePromoOffersRequest.new(
  promo_id: null,
  offers: null
)
```

