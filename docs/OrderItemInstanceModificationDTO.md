# OpenapiClient::OrderItemInstanceModificationDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  |  |
| **instances** | [**Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderItemInstanceModificationDTO.new(
  id: null,
  instances: null
)
```

