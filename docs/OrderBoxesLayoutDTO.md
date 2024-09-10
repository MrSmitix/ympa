# OrderBoxesLayoutDTO

Распределение товаров по коробкам.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boxes** | [**List[EnrichedOrderBoxLayoutDTO]**](EnrichedOrderBoxLayoutDTO.md) | Список коробок. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_boxes_layout_dto import OrderBoxesLayoutDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBoxesLayoutDTO from a JSON string
order_boxes_layout_dto_instance = OrderBoxesLayoutDTO.from_json(json)
# print the JSON string representation of the object
print OrderBoxesLayoutDTO.to_json()

# convert the object into a dict
order_boxes_layout_dto_dict = order_boxes_layout_dto_instance.to_dict()
# create an instance of OrderBoxesLayoutDTO from a dict
order_boxes_layout_dto_from_dict = OrderBoxesLayoutDTO.from_dict(order_boxes_layout_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


