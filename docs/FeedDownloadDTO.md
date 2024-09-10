# FeedDownloadDTO

Информация о последней загрузке прайс-листа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**error** | [**FeedDownloadErrorDTO**](FeedDownloadErrorDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feed_download_dto import FeedDownloadDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedDownloadDTO from a JSON string
feed_download_dto_instance = FeedDownloadDTO.from_json(json)
# print the JSON string representation of the object
print(FeedDownloadDTO.to_json())

# convert the object into a dict
feed_download_dto_dict = feed_download_dto_instance.to_dict()
# create an instance of FeedDownloadDTO from a dict
feed_download_dto_from_dict = FeedDownloadDTO.from_dict(feed_download_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


