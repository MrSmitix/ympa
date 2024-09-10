
# OrderItemInstanceModificationDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  |  |
| **instances** | [**kotlin.collections.List&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  |  |



