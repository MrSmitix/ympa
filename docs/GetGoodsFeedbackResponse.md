# GetGoodsFeedbackResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GoodsFeedbackListDTO**](GoodsFeedbackListDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_goods_feedback_response import GetGoodsFeedbackResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsFeedbackResponse from a JSON string
get_goods_feedback_response_instance = GetGoodsFeedbackResponse.from_json(json)
# print the JSON string representation of the object
print(GetGoodsFeedbackResponse.to_json())

# convert the object into a dict
get_goods_feedback_response_dict = get_goods_feedback_response_instance.to_dict()
# create an instance of GetGoodsFeedbackResponse from a dict
get_goods_feedback_response_from_dict = GetGoodsFeedbackResponse.from_dict(get_goods_feedback_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


