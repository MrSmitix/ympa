# UpdateOrderItemRequest

Запрос на обновление состава заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderItemModificationDTO]**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**reason** | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_order_item_request import UpdateOrderItemRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOrderItemRequest from a JSON string
update_order_item_request_instance = UpdateOrderItemRequest.from_json(json)
# print the JSON string representation of the object
print UpdateOrderItemRequest.to_json()

# convert the object into a dict
update_order_item_request_dict = update_order_item_request_instance.to_dict()
# create an instance of UpdateOrderItemRequest from a dict
update_order_item_request_from_dict = UpdateOrderItemRequest.from_dict(update_order_item_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


