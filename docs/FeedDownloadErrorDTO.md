# FeedDownloadErrorDTO

Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_status_code** | **int** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**type** | [**FeedDownloadErrorType**](FeedDownloadErrorType.md) |  | [optional] 
**description** | **str** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.feed_download_error_dto import FeedDownloadErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedDownloadErrorDTO from a JSON string
feed_download_error_dto_instance = FeedDownloadErrorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedDownloadErrorDTO.to_json())

# convert the object into a dict
feed_download_error_dto_dict = feed_download_error_dto_instance.to_dict()
# create an instance of FeedDownloadErrorDTO from a dict
feed_download_error_dto_from_dict = FeedDownloadErrorDTO.from_dict(feed_download_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


