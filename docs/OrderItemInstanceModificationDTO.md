# ympa_r_client::OrderItemInstanceModificationDTO

Позиция в корзине, требующая маркировки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**instances** | [**array[BriefOrderItemInstanceDTO]**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  | 


