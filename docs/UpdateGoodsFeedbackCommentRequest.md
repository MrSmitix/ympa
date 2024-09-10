# UpdateGoodsFeedbackCommentRequest

Комментарий к отзыву.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **int** | Идентификатор отзыва.  | 
**comment** | [**UpdateGoodsFeedbackCommentDTO**](UpdateGoodsFeedbackCommentDTO.md) |  | 

## Example

```python
from ympa_python_client.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGoodsFeedbackCommentRequest from a JSON string
update_goods_feedback_comment_request_instance = UpdateGoodsFeedbackCommentRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateGoodsFeedbackCommentRequest.to_json())

# convert the object into a dict
update_goods_feedback_comment_request_dict = update_goods_feedback_comment_request_instance.to_dict()
# create an instance of UpdateGoodsFeedbackCommentRequest from a dict
update_goods_feedback_comment_request_from_dict = UpdateGoodsFeedbackCommentRequest.from_dict(update_goods_feedback_comment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


