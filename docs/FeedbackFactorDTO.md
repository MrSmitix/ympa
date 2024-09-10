# FeedbackFactorDTO

Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор параметра. | [optional] 
**title** | **str** | Название параметра. Например, &#x60;Скорость обработки заказа&#x60;. | [optional] 
**description** | **str** | Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;. | [optional] 
**value** | **int** | Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка).  | [optional] 

## Example

```python
from ympa_python_client.models.feedback_factor_dto import FeedbackFactorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackFactorDTO from a JSON string
feedback_factor_dto_instance = FeedbackFactorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackFactorDTO.to_json())

# convert the object into a dict
feedback_factor_dto_dict = feedback_factor_dto_instance.to_dict()
# create an instance of FeedbackFactorDTO from a dict
feedback_factor_dto_from_dict = FeedbackFactorDTO.from_dict(feedback_factor_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


