

# OrderItemInstanceModificationDTO

Позиция в корзине, требующая маркировки.

The class is defined in **[OrderItemInstanceModificationDTO.java](../../src/main/java/org/openapitools/model/OrderItemInstanceModificationDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**instances** | [`List&lt;BriefOrderItemInstanceDTO&gt;`](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  | 




