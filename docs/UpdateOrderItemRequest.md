# OpenapiClient::UpdateOrderItemRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;OrderItemModificationDTO&gt;**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  |  |
| **reason** | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOrderItemRequest.new(
  items: null,
  reason: null
)
```

