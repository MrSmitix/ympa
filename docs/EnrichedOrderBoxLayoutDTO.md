# EnrichedOrderBoxLayoutDTO

Информация о коробке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderBoxLayoutItemDTO]**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 
**box_id** | **int** | Идентификатор коробки. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.enriched_order_box_layout_dto import EnrichedOrderBoxLayoutDTO

# TODO update the JSON string below
json = "{}"
# create an instance of EnrichedOrderBoxLayoutDTO from a JSON string
enriched_order_box_layout_dto_instance = EnrichedOrderBoxLayoutDTO.from_json(json)
# print the JSON string representation of the object
print EnrichedOrderBoxLayoutDTO.to_json()

# convert the object into a dict
enriched_order_box_layout_dto_dict = enriched_order_box_layout_dto_instance.to_dict()
# create an instance of EnrichedOrderBoxLayoutDTO from a dict
enriched_order_box_layout_dto_from_dict = EnrichedOrderBoxLayoutDTO.from_dict(enriched_order_box_layout_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


