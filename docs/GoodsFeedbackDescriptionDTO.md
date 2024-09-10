# GoodsFeedbackDescriptionDTO

Текстовая часть отзыва.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advantages** | **str** | Описание плюсов товара в отзыве. | [optional] 
**disadvantages** | **str** | Описание минусов товара в отзыве. | [optional] 
**comment** | **str** | Комментарий в отзыве. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.goods_feedback_description_dto import GoodsFeedbackDescriptionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackDescriptionDTO from a JSON string
goods_feedback_description_dto_instance = GoodsFeedbackDescriptionDTO.from_json(json)
# print the JSON string representation of the object
print GoodsFeedbackDescriptionDTO.to_json()

# convert the object into a dict
goods_feedback_description_dto_dict = goods_feedback_description_dto_instance.to_dict()
# create an instance of GoodsFeedbackDescriptionDTO from a dict
goods_feedback_description_dto_from_dict = GoodsFeedbackDescriptionDTO.from_dict(goods_feedback_description_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


