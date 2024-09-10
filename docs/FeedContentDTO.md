# FeedContentDTO

Информация о проверке содержимого прайс-листа, загруженного на Маркет.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers_count** | **int** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**total_offers_count** | **int** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  | [optional] 
**error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.feed_content_dto import FeedContentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedContentDTO from a JSON string
feed_content_dto_instance = FeedContentDTO.from_json(json)
# print the JSON string representation of the object
print FeedContentDTO.to_json()

# convert the object into a dict
feed_content_dto_dict = feed_content_dto_instance.to_dict()
# create an instance of FeedContentDTO from a dict
feed_content_dto_from_dict = FeedContentDTO.from_dict(feed_content_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


