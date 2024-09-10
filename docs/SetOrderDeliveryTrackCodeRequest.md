# OpenapiClient::SetOrderDeliveryTrackCodeRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **track_code** | **String** | Трек‑номер посылки. |  |
| **delivery_service_id** | **Integer** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SetOrderDeliveryTrackCodeRequest.new(
  track_code: null,
  delivery_service_id: null
)
```

