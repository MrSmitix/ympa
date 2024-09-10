# UpdateOrderItemRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**Vector{OrderItemModificationDTO}**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | [default to nothing]
**reason** | [***OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


