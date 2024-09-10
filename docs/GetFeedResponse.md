# GetFeedResponse

Ответ на запрос информации о прайс-листе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed** | [**FeedDTO**](FeedDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_feed_response import GetFeedResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFeedResponse from a JSON string
get_feed_response_instance = GetFeedResponse.from_json(json)
# print the JSON string representation of the object
print(GetFeedResponse.to_json())

# convert the object into a dict
get_feed_response_dict = get_feed_response_instance.to_dict()
# create an instance of GetFeedResponse from a dict
get_feed_response_from_dict = GetFeedResponse.from_dict(get_feed_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


