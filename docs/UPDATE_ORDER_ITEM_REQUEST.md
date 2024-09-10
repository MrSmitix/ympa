# UPDATE_ORDER_ITEM_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**LIST [ORDER_ITEM_MODIFICATION_DTO]**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | [default to null]
**reason** | [**ORDER_ITEMS_MODIFICATION_REQUEST_REASON_TYPE**](OrderItemsModificationRequestReasonType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


