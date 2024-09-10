# SetOrderBoxLayoutRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boxes** | [**List[OrderBoxLayoutDTO]**](OrderBoxLayoutDTO.md) | Список коробок. | 
**allow_remove** | **bool** | Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа. | [optional] [default to False]

## Example

```python
from ympa_python_pydantic_v1_client.models.set_order_box_layout_request import SetOrderBoxLayoutRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderBoxLayoutRequest from a JSON string
set_order_box_layout_request_instance = SetOrderBoxLayoutRequest.from_json(json)
# print the JSON string representation of the object
print SetOrderBoxLayoutRequest.to_json()

# convert the object into a dict
set_order_box_layout_request_dict = set_order_box_layout_request_instance.to_dict()
# create an instance of SetOrderBoxLayoutRequest from a dict
set_order_box_layout_request_from_dict = SetOrderBoxLayoutRequest.from_dict(set_order_box_layout_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


