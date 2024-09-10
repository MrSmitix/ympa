# FeedbackCommentAuthorDTO

Информация об авторе комментария.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**FeedbackCommentAuthorType**](FeedbackCommentAuthorType.md) |  | [optional] 
**name** | **str** | Имя автора отзыва или название магазина. | [optional] 

## Example

```python
from ympa_python_client.models.feedback_comment_author_dto import FeedbackCommentAuthorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackCommentAuthorDTO from a JSON string
feedback_comment_author_dto_instance = FeedbackCommentAuthorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackCommentAuthorDTO.to_json())

# convert the object into a dict
feedback_comment_author_dto_dict = feedback_comment_author_dto_instance.to_dict()
# create an instance of FeedbackCommentAuthorDTO from a dict
feedback_comment_author_dto_from_dict = FeedbackCommentAuthorDTO.from_dict(feedback_comment_author_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


