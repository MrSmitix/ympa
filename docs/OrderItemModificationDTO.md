
# Table `OrderItemModificationDTO`
(mapped from: OrderItemModificationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  | 
**count** | count | int UNSIGNED NOT NULL |  | **kotlin.Int** | Новое количество товара. | 
**instances** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  |  [optional]




# **Table `OrderItemModificationDTOBriefOrderItemInstanceDTO`**
(mapped from: OrderItemModificationDTOBriefOrderItemInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderItemModificationDTO | orderItemModificationDTO | long | | kotlin.Long | Primary Key | *one*
briefOrderItemInstanceDTO | briefOrderItemInstanceDTO | long | | kotlin.Long | Foreign Key | *many*



