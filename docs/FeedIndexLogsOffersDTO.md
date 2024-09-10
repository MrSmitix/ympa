# FeedIndexLogsOffersDTO

Информация о предложениях прайс-листа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_count** | **int** | Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. | [optional] 
**total_count** | **int** | Количество предложений в прайс-листе. | [optional] 

## Example

```python
from ympa_python_client.models.feed_index_logs_offers_dto import FeedIndexLogsOffersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedIndexLogsOffersDTO from a JSON string
feed_index_logs_offers_dto_instance = FeedIndexLogsOffersDTO.from_json(json)
# print the JSON string representation of the object
print(FeedIndexLogsOffersDTO.to_json())

# convert the object into a dict
feed_index_logs_offers_dto_dict = feed_index_logs_offers_dto_instance.to_dict()
# create an instance of FeedIndexLogsOffersDTO from a dict
feed_index_logs_offers_dto_from_dict = FeedIndexLogsOffersDTO.from_dict(feed_index_logs_offers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


