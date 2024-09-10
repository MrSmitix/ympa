
# Table `OrderBoxLayoutItemDTO`
(mapped from: OrderBoxLayoutItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    | 
**fullCount** | fullCount | int UNSIGNED |  | **kotlin.Int** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  |  [optional]
**partialCount** | partialCount | long |  | [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  |  [optional] [foreignkey]
**instances** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. |  [optional]





# **Table `OrderBoxLayoutItemDTOBriefOrderItemInstanceDTO`**
(mapped from: OrderBoxLayoutItemDTOBriefOrderItemInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderBoxLayoutItemDTO | orderBoxLayoutItemDTO | long | | kotlin.Long | Primary Key | *one*
briefOrderItemInstanceDTO | briefOrderItemInstanceDTO | long | | kotlin.Long | Foreign Key | *many*



