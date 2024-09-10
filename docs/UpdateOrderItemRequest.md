# ympa_r_client::UpdateOrderItemRequest

Запрос на обновление состава заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**array[OrderItemModificationDTO]**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | [Min. items: 1] 
**reason** | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] [Enum: ] 


