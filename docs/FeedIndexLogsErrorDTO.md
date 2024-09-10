# FeedIndexLogsErrorDTO

Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_status_code** | **int** | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**type** | [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] 
**description** | **str** | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.feed_index_logs_error_dto import FeedIndexLogsErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedIndexLogsErrorDTO from a JSON string
feed_index_logs_error_dto_instance = FeedIndexLogsErrorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedIndexLogsErrorDTO.to_json())

# convert the object into a dict
feed_index_logs_error_dto_dict = feed_index_logs_error_dto_instance.to_dict()
# create an instance of FeedIndexLogsErrorDTO from a dict
feed_index_logs_error_dto_from_dict = FeedIndexLogsErrorDTO.from_dict(feed_index_logs_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


