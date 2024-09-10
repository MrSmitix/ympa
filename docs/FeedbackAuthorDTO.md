# FeedbackAuthorDTO

Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Имя автора отзыва. | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feedback_author_dto import FeedbackAuthorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackAuthorDTO from a JSON string
feedback_author_dto_instance = FeedbackAuthorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackAuthorDTO.to_json())

# convert the object into a dict
feedback_author_dto_dict = feedback_author_dto_instance.to_dict()
# create an instance of FeedbackAuthorDTO from a dict
feedback_author_dto_from_dict = FeedbackAuthorDTO.from_dict(feedback_author_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


