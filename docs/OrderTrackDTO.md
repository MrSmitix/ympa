# OpenapiClient::OrderTrackDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **track_code** | **String** | Трек‑номер посылки. | [optional] |
| **delivery_service_id** | **Integer** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderTrackDTO.new(
  track_code: null,
  delivery_service_id: null
)
```

