# OpenapiClient::DeletePromoOffersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **promo_id** | **String** | Идентификатор акции. |  |
| **delete_all_offers** | **Boolean** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] |
| **offer_ids** | **Array&lt;String&gt;** | Товары, которые нужно убрать из акции. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DeletePromoOffersRequest.new(
  promo_id: null,
  delete_all_offers: null,
  offer_ids: null
)
```

