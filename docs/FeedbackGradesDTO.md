# FeedbackGradesDTO

Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | **float** | Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»). | [optional] 
**agree_count** | **int** | Количество пользователей, считающих отзыв полезным. | [optional] 
**reject_count** | **int** | Количество пользователей, считающих отзыв бесполезным. | [optional] 
**factors** | [**List[FeedbackFactorDTO]**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.  | 

## Example

```python
from ympa_python_client.models.feedback_grades_dto import FeedbackGradesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackGradesDTO from a JSON string
feedback_grades_dto_instance = FeedbackGradesDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackGradesDTO.to_json())

# convert the object into a dict
feedback_grades_dto_dict = feedback_grades_dto_instance.to_dict()
# create an instance of FeedbackGradesDTO from a dict
feedback_grades_dto_from_dict = FeedbackGradesDTO.from_dict(feedback_grades_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


