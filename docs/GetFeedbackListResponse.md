# GetFeedbackListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**FeedbackListDTO**](FeedbackListDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_feedback_list_response import GetFeedbackListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFeedbackListResponse from a JSON string
get_feedback_list_response_instance = GetFeedbackListResponse.from_json(json)
# print the JSON string representation of the object
print(GetFeedbackListResponse.to_json())

# convert the object into a dict
get_feedback_list_response_dict = get_feedback_list_response_instance.to_dict()
# create an instance of GetFeedbackListResponse from a dict
get_feedback_list_response_from_dict = GetFeedbackListResponse.from_dict(get_feedback_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


