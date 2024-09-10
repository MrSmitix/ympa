# FeedIndexLogsFeedDTO

Информация о прайс-листе.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор прайс-листа. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.feed_index_logs_feed_dto import FeedIndexLogsFeedDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedIndexLogsFeedDTO from a JSON string
feed_index_logs_feed_dto_instance = FeedIndexLogsFeedDTO.from_json(json)
# print the JSON string representation of the object
print FeedIndexLogsFeedDTO.to_json()

# convert the object into a dict
feed_index_logs_feed_dto_dict = feed_index_logs_feed_dto_instance.to_dict()
# create an instance of FeedIndexLogsFeedDTO from a dict
feed_index_logs_feed_dto_from_dict = FeedIndexLogsFeedDTO.from_dict(feed_index_logs_feed_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


