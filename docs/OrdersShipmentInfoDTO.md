# OpenapiClient::OrdersShipmentInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_ids_with_labels** | **Array&lt;Integer&gt;** | Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. |  |
| **order_ids_without_labels** | **Array&lt;Integer&gt;** | Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersShipmentInfoDTO.new(
  order_ids_with_labels: null,
  order_ids_without_labels: null
)
```

