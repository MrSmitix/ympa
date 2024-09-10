
# Table `OrderItemInstanceModificationDTO`
(mapped from: OrderItemInstanceModificationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  | 
**instances** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Список кодов маркировки единиц товара.  | 



# **Table `OrderItemInstanceModificationDTOBriefOrderItemInstanceDTO`**
(mapped from: OrderItemInstanceModificationDTOBriefOrderItemInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderItemInstanceModificationDTO | orderItemInstanceModificationDTO | long | | kotlin.Long | Primary Key | *one*
briefOrderItemInstanceDTO | briefOrderItemInstanceDTO | long | | kotlin.Long | Foreign Key | *many*



