# OrderItemsModificationResultDTO

Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[BriefOrderItemDTO]**](BriefOrderItemDTO.md) | Список позиций в заказе, подлежащих маркировке. | 

## Example

```python
from ympa_python_client.models.order_items_modification_result_dto import OrderItemsModificationResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemsModificationResultDTO from a JSON string
order_items_modification_result_dto_instance = OrderItemsModificationResultDTO.from_json(json)
# print the JSON string representation of the object
print(OrderItemsModificationResultDTO.to_json())

# convert the object into a dict
order_items_modification_result_dto_dict = order_items_modification_result_dto_instance.to_dict()
# create an instance of OrderItemsModificationResultDTO from a dict
order_items_modification_result_dto_from_dict = OrderItemsModificationResultDTO.from_dict(order_items_modification_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


