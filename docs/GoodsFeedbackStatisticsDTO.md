# GoodsFeedbackStatisticsDTO

Статистическая информация по отзыву.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rating** | **int** | Оценка товара. | 
**comments_count** | **int** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  | 
**recommended** | **bool** | Рекомендуют ли этот товар. | [optional] 
**paid_amount** | **int** | Количество баллов Плюса, которое автор получил за отзыв. | [optional] 

## Example

```python
from ympa_python_client.models.goods_feedback_statistics_dto import GoodsFeedbackStatisticsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackStatisticsDTO from a JSON string
goods_feedback_statistics_dto_instance = GoodsFeedbackStatisticsDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackStatisticsDTO.to_json())

# convert the object into a dict
goods_feedback_statistics_dto_dict = goods_feedback_statistics_dto_instance.to_dict()
# create an instance of GoodsFeedbackStatisticsDTO from a dict
goods_feedback_statistics_dto_from_dict = GoodsFeedbackStatisticsDTO.from_dict(goods_feedback_statistics_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


