# FeedContentErrorDTO

Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**FeedContentErrorType**](FeedContentErrorType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feed_content_error_dto import FeedContentErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedContentErrorDTO from a JSON string
feed_content_error_dto_instance = FeedContentErrorDTO.from_json(json)
# print the JSON string representation of the object
print(FeedContentErrorDTO.to_json())

# convert the object into a dict
feed_content_error_dto_dict = feed_content_error_dto_instance.to_dict()
# create an instance of FeedContentErrorDTO from a dict
feed_content_error_dto_from_dict = FeedContentErrorDTO.from_dict(feed_content_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


