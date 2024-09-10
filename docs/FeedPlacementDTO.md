# FeedPlacementDTO

Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**total_offers_count** | **int** | Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. | [optional] 

## Example

```python
from ympa_python_client.models.feed_placement_dto import FeedPlacementDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedPlacementDTO from a JSON string
feed_placement_dto_instance = FeedPlacementDTO.from_json(json)
# print the JSON string representation of the object
print(FeedPlacementDTO.to_json())

# convert the object into a dict
feed_placement_dto_dict = feed_placement_dto_instance.to_dict()
# create an instance of FeedPlacementDTO from a dict
feed_placement_dto_from_dict = FeedPlacementDTO.from_dict(feed_placement_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


