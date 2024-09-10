# GoodsFeedbackCommentAuthorDTO

Информация об авторе комментария.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**GoodsFeedbackCommentAuthorType**](GoodsFeedbackCommentAuthorType.md) |  | [optional] 
**name** | **str** | Имя автора или название кабинета. | [optional] 

## Example

```python
from ympa_python_client.models.goods_feedback_comment_author_dto import GoodsFeedbackCommentAuthorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackCommentAuthorDTO from a JSON string
goods_feedback_comment_author_dto_instance = GoodsFeedbackCommentAuthorDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackCommentAuthorDTO.to_json())

# convert the object into a dict
goods_feedback_comment_author_dto_dict = goods_feedback_comment_author_dto_instance.to_dict()
# create an instance of GoodsFeedbackCommentAuthorDTO from a dict
goods_feedback_comment_author_dto_from_dict = GoodsFeedbackCommentAuthorDTO.from_dict(goods_feedback_comment_author_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


