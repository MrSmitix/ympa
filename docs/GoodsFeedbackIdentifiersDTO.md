# GoodsFeedbackIdentifiersDTO

Идентификаторы, которые связаны с отзывом.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа на Маркете. | 
**model_id** | **int** | Идентификатор модели товара. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.goods_feedback_identifiers_dto import GoodsFeedbackIdentifiersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackIdentifiersDTO from a JSON string
goods_feedback_identifiers_dto_instance = GoodsFeedbackIdentifiersDTO.from_json(json)
# print the JSON string representation of the object
print GoodsFeedbackIdentifiersDTO.to_json()

# convert the object into a dict
goods_feedback_identifiers_dto_dict = goods_feedback_identifiers_dto_instance.to_dict()
# create an instance of GoodsFeedbackIdentifiersDTO from a dict
goods_feedback_identifiers_dto_from_dict = GoodsFeedbackIdentifiersDTO.from_dict(goods_feedback_identifiers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


