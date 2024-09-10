# BidRecommendationItemDTO

Рекомендованная ставка и возможная доля показов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **int** | Значение ставки. | 
**show_percent** | **int** | Доля показов.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.bid_recommendation_item_dto import BidRecommendationItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BidRecommendationItemDTO from a JSON string
bid_recommendation_item_dto_instance = BidRecommendationItemDTO.from_json(json)
# print the JSON string representation of the object
print BidRecommendationItemDTO.to_json()

# convert the object into a dict
bid_recommendation_item_dto_dict = bid_recommendation_item_dto_instance.to_dict()
# create an instance of BidRecommendationItemDTO from a dict
bid_recommendation_item_dto_from_dict = BidRecommendationItemDTO.from_dict(bid_recommendation_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


