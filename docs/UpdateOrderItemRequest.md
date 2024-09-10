# WWW::OpenAPIClient::Object::UpdateOrderItemRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::UpdateOrderItemRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**ARRAY[OrderItemModificationDTO]**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


