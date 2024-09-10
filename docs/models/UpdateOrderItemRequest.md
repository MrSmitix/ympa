

# UpdateOrderItemRequest

Запрос на обновление состава заказа.

The class is defined in **[UpdateOrderItemRequest.java](../../src/main/java/org/openapitools/model/UpdateOrderItemRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [`List&lt;OrderItemModificationDTO&gt;`](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | `OrderItemsModificationRequestReasonType` |  |  [optional property]




