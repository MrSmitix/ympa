# GetFeedIndexLogsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**FeedIndexLogsResultDTO**](FeedIndexLogsResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_feed_index_logs_response import GetFeedIndexLogsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFeedIndexLogsResponse from a JSON string
get_feed_index_logs_response_instance = GetFeedIndexLogsResponse.from_json(json)
# print the JSON string representation of the object
print(GetFeedIndexLogsResponse.to_json())

# convert the object into a dict
get_feed_index_logs_response_dict = get_feed_index_logs_response_instance.to_dict()
# create an instance of GetFeedIndexLogsResponse from a dict
get_feed_index_logs_response_from_dict = GetFeedIndexLogsResponse.from_dict(get_feed_index_logs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


