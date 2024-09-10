# OpenapiClient::FeedbackOrderDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **shop_order_id** | **String** | Номер заказа, указанный в отзыве. | [optional] |
| **delivery** | [**FeedbackDeliveryType**](FeedbackDeliveryType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedbackOrderDTO.new(
  shop_order_id: null,
  delivery: null
)
```

