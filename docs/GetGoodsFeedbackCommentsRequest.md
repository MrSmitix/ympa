# GetGoodsFeedbackCommentsRequest

Фильтр запроса комментариев отзыва. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_id** | **int** | Идентификатор отзыва.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsFeedbackCommentsRequest from a JSON string
get_goods_feedback_comments_request_instance = GetGoodsFeedbackCommentsRequest.from_json(json)
# print the JSON string representation of the object
print GetGoodsFeedbackCommentsRequest.to_json()

# convert the object into a dict
get_goods_feedback_comments_request_dict = get_goods_feedback_comments_request_instance.to_dict()
# create an instance of GetGoodsFeedbackCommentsRequest from a dict
get_goods_feedback_comments_request_from_dict = GetGoodsFeedbackCommentsRequest.from_dict(get_goods_feedback_comments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


