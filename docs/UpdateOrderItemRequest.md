# UpdateOrderItemRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**Vec<models::OrderItemModificationDto>**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | [***models::OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


