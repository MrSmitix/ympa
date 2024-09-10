# FeedbackListDTO

Отзывы пользователей Яндекс Маркета об указанном магазине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**feedback_list** | [**List[FeedbackDTO]**](FeedbackDTO.md) | Список отзывов.  Содержит не более 20 отзывов.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.feedback_list_dto import FeedbackListDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackListDTO from a JSON string
feedback_list_dto_instance = FeedbackListDTO.from_json(json)
# print the JSON string representation of the object
print FeedbackListDTO.to_json()

# convert the object into a dict
feedback_list_dto_dict = feedback_list_dto_instance.to_dict()
# create an instance of FeedbackListDTO from a dict
feedback_list_dto_from_dict = FeedbackListDTO.from_dict(feedback_list_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


