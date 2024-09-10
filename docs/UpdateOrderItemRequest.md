

# UpdateOrderItemRequest

Запрос на обновление состава заказа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**Seq&lt;OrderItemModificationDTO&gt;**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | **OrderItemsModificationRequestReasonType** |  |  [optional]


