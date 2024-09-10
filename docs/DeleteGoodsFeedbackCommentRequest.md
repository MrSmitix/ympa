# DeleteGoodsFeedbackCommentRequest

Фильтр запроса отзывов по бизнесу. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор комментария к отзыву.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteGoodsFeedbackCommentRequest from a JSON string
delete_goods_feedback_comment_request_instance = DeleteGoodsFeedbackCommentRequest.from_json(json)
# print the JSON string representation of the object
print DeleteGoodsFeedbackCommentRequest.to_json()

# convert the object into a dict
delete_goods_feedback_comment_request_dict = delete_goods_feedback_comment_request_instance.to_dict()
# create an instance of DeleteGoodsFeedbackCommentRequest from a dict
delete_goods_feedback_comment_request_from_dict = DeleteGoodsFeedbackCommentRequest.from_dict(delete_goods_feedback_comment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


