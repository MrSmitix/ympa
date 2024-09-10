# FeedIndexLogsResultDTO

Результат выполнения запроса отчета по индексации прайс-листа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed** | [**FeedIndexLogsFeedDTO**](FeedIndexLogsFeedDTO.md) |  | [optional] 
**index_log_records** | [**List[FeedIndexLogsRecordDTO]**](FeedIndexLogsRecordDTO.md) | Список отчетов по индексации прайс-листа. | 
**total** | **int** | Количество отчетов на всех страницах выходных данных. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.feed_index_logs_result_dto import FeedIndexLogsResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedIndexLogsResultDTO from a JSON string
feed_index_logs_result_dto_instance = FeedIndexLogsResultDTO.from_json(json)
# print the JSON string representation of the object
print FeedIndexLogsResultDTO.to_json()

# convert the object into a dict
feed_index_logs_result_dto_dict = feed_index_logs_result_dto_instance.to_dict()
# create an instance of FeedIndexLogsResultDTO from a dict
feed_index_logs_result_dto_from_dict = FeedIndexLogsResultDTO.from_dict(feed_index_logs_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


