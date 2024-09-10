# FeedPublicationFullDTO

Информация о последней публикации предложений из прайс-листа на Маркете. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_time** | **datetime** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 
**published_time** | **datetime** | Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.feed_publication_full_dto import FeedPublicationFullDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedPublicationFullDTO from a JSON string
feed_publication_full_dto_instance = FeedPublicationFullDTO.from_json(json)
# print the JSON string representation of the object
print(FeedPublicationFullDTO.to_json())

# convert the object into a dict
feed_publication_full_dto_dict = feed_publication_full_dto_instance.to_dict()
# create an instance of FeedPublicationFullDTO from a dict
feed_publication_full_dto_from_dict = FeedPublicationFullDTO.from_dict(feed_publication_full_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


