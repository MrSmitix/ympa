# GoodsFeedbackMediaDTO

Фото и видео.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**photos** | **List[str]** | Ссылки на фото. | [optional] 
**videos** | **List[str]** | Ссылки на видео. | [optional] 

## Example

```python
from ympa_python_client.models.goods_feedback_media_dto import GoodsFeedbackMediaDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackMediaDTO from a JSON string
goods_feedback_media_dto_instance = GoodsFeedbackMediaDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackMediaDTO.to_json())

# convert the object into a dict
goods_feedback_media_dto_dict = goods_feedback_media_dto_instance.to_dict()
# create an instance of GoodsFeedbackMediaDTO from a dict
goods_feedback_media_dto_from_dict = GoodsFeedbackMediaDTO.from_dict(goods_feedback_media_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


