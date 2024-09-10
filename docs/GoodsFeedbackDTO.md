# GoodsFeedbackDTO

Отзыв о товаре.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **int** | Идентификатор отзыва.  | 
**created_at** | **datetime** | Дата и время создания отзыва. | 
**need_reaction** | **bool** | Нужен ли ответ на отзыв. | 
**identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**author** | **str** | Имя автора отзыва. | [optional] 
**description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] 
**media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] 
**statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 

## Example

```python
from ympa_python_client.models.goods_feedback_dto import GoodsFeedbackDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackDTO from a JSON string
goods_feedback_dto_instance = GoodsFeedbackDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackDTO.to_json())

# convert the object into a dict
goods_feedback_dto_dict = goods_feedback_dto_instance.to_dict()
# create an instance of GoodsFeedbackDTO from a dict
goods_feedback_dto_from_dict = GoodsFeedbackDTO.from_dict(goods_feedback_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


