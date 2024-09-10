# UpdateGoodsFeedbackCommentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GoodsFeedbackCommentDTO**](GoodsFeedbackCommentDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGoodsFeedbackCommentResponse from a JSON string
update_goods_feedback_comment_response_instance = UpdateGoodsFeedbackCommentResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateGoodsFeedbackCommentResponse.to_json())

# convert the object into a dict
update_goods_feedback_comment_response_dict = update_goods_feedback_comment_response_instance.to_dict()
# create an instance of UpdateGoodsFeedbackCommentResponse from a dict
update_goods_feedback_comment_response_from_dict = UpdateGoodsFeedbackCommentResponse.from_dict(update_goods_feedback_comment_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


