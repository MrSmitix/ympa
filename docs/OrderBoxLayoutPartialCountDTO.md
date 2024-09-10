# OrderBoxLayoutPartialCountDTO

Информация о части товара в коробке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **int** | Номер части, начиная с 1. | 
**total** | **int** | На сколько всего частей разделен товар. | 

## Example

```python
from ympa_python_client.models.order_box_layout_partial_count_dto import OrderBoxLayoutPartialCountDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBoxLayoutPartialCountDTO from a JSON string
order_box_layout_partial_count_dto_instance = OrderBoxLayoutPartialCountDTO.from_json(json)
# print the JSON string representation of the object
print(OrderBoxLayoutPartialCountDTO.to_json())

# convert the object into a dict
order_box_layout_partial_count_dto_dict = order_box_layout_partial_count_dto_instance.to_dict()
# create an instance of OrderBoxLayoutPartialCountDTO from a dict
order_box_layout_partial_count_dto_from_dict = OrderBoxLayoutPartialCountDTO.from_dict(order_box_layout_partial_count_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


