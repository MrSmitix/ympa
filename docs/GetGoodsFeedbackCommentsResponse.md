# GetGoodsFeedbackCommentsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GoodsFeedbackCommentListDTO**](GoodsFeedbackCommentListDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsFeedbackCommentsResponse from a JSON string
get_goods_feedback_comments_response_instance = GetGoodsFeedbackCommentsResponse.from_json(json)
# print the JSON string representation of the object
print GetGoodsFeedbackCommentsResponse.to_json()

# convert the object into a dict
get_goods_feedback_comments_response_dict = get_goods_feedback_comments_response_instance.to_dict()
# create an instance of GetGoodsFeedbackCommentsResponse from a dict
get_goods_feedback_comments_response_from_dict = GetGoodsFeedbackCommentsResponse.from_dict(get_goods_feedback_comments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


