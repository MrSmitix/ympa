# UpdateGoodsFeedbackCommentDTO

Комментарий к отзыву или другому комментарию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор комментария к отзыву.  | [optional] 
**parent_id** | **int** | Идентификатор комментария к отзыву.  | [optional] 
**text** | **str** | Текст комментария. | 

## Example

```python
from ympa_python_client.models.update_goods_feedback_comment_dto import UpdateGoodsFeedbackCommentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGoodsFeedbackCommentDTO from a JSON string
update_goods_feedback_comment_dto_instance = UpdateGoodsFeedbackCommentDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateGoodsFeedbackCommentDTO.to_json())

# convert the object into a dict
update_goods_feedback_comment_dto_dict = update_goods_feedback_comment_dto_instance.to_dict()
# create an instance of UpdateGoodsFeedbackCommentDTO from a dict
update_goods_feedback_comment_dto_from_dict = UpdateGoodsFeedbackCommentDTO.from_dict(update_goods_feedback_comment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


