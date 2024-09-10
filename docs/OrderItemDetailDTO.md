# OrderItemDetailDTO

Детали по товару в заказе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_count** | **int** | Количество единиц товара. | [optional] 
**item_status** | [**OrderItemStatusType**](OrderItemStatusType.md) |  | [optional] 
**update_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.order_item_detail_dto import OrderItemDetailDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemDetailDTO from a JSON string
order_item_detail_dto_instance = OrderItemDetailDTO.from_json(json)
# print the JSON string representation of the object
print(OrderItemDetailDTO.to_json())

# convert the object into a dict
order_item_detail_dto_dict = order_item_detail_dto_instance.to_dict()
# create an instance of OrderItemDetailDTO from a dict
order_item_detail_dto_from_dict = OrderItemDetailDTO.from_dict(order_item_detail_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


