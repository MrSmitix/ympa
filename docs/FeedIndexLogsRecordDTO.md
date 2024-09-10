# FeedIndexLogsRecordDTO

Список отчетов по индексации прайс-листа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_time** | **datetime** | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**file_time** | **datetime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**generation_id** | **int** | Идентификатор индексации. | [optional] 
**index_type** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**published_time** | **datetime** | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feed_index_logs_record_dto import FeedIndexLogsRecordDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedIndexLogsRecordDTO from a JSON string
feed_index_logs_record_dto_instance = FeedIndexLogsRecordDTO.from_json(json)
# print the JSON string representation of the object
print(FeedIndexLogsRecordDTO.to_json())

# convert the object into a dict
feed_index_logs_record_dto_dict = feed_index_logs_record_dto_instance.to_dict()
# create an instance of FeedIndexLogsRecordDTO from a dict
feed_index_logs_record_dto_from_dict = FeedIndexLogsRecordDTO.from_dict(feed_index_logs_record_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


