
# Table `UpdateOrderItemRequest`
(mapped from: UpdateOrderItemRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderItemModificationDTO&gt;**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | reason | long |  | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  |  [optional] [foreignkey]


# **Table `UpdateOrderItemRequestOrderItemModificationDTO`**
(mapped from: UpdateOrderItemRequestOrderItemModificationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOrderItemRequest | updateOrderItemRequest | long | | kotlin.Long | Primary Key | *one*
orderItemModificationDTO | orderItemModificationDTO | long | | kotlin.Long | Foreign Key | *many*




