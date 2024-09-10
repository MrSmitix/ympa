# OrderBoxLayoutDTO

Информация о коробке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderBoxLayoutItemDTO]**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_box_layout_dto import OrderBoxLayoutDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderBoxLayoutDTO from a JSON string
order_box_layout_dto_instance = OrderBoxLayoutDTO.from_json(json)
# print the JSON string representation of the object
print OrderBoxLayoutDTO.to_json()

# convert the object into a dict
order_box_layout_dto_dict = order_box_layout_dto_instance.to_dict()
# create an instance of OrderBoxLayoutDTO from a dict
order_box_layout_dto_from_dict = OrderBoxLayoutDTO.from_dict(order_box_layout_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


