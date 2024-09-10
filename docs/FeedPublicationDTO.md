# FeedPublicationDTO

Информация о последней публикации предложений из прайс-листа на Маркете.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**full** | [**FeedPublicationFullDTO**](FeedPublicationFullDTO.md) |  | [optional] 
**price_and_stock_update** | [**FeedPublicationPriceAndStockUpdateDTO**](FeedPublicationPriceAndStockUpdateDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feed_publication_dto import FeedPublicationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedPublicationDTO from a JSON string
feed_publication_dto_instance = FeedPublicationDTO.from_json(json)
# print the JSON string representation of the object
print(FeedPublicationDTO.to_json())

# convert the object into a dict
feed_publication_dto_dict = feed_publication_dto_instance.to_dict()
# create an instance of FeedPublicationDTO from a dict
feed_publication_dto_from_dict = FeedPublicationDTO.from_dict(feed_publication_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


