# GetBidsRecommendationsResponseDTO

Список товаров с рекомендованными ставками.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommendations** | [**List[SkuBidRecommendationItemDTO]**](SkuBidRecommendationItemDTO.md) | Список товаров с рекомендованными ставками. | 

## Example

```python
from ympa_python_client.models.get_bids_recommendations_response_dto import GetBidsRecommendationsResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetBidsRecommendationsResponseDTO from a JSON string
get_bids_recommendations_response_dto_instance = GetBidsRecommendationsResponseDTO.from_json(json)
# print the JSON string representation of the object
print(GetBidsRecommendationsResponseDTO.to_json())

# convert the object into a dict
get_bids_recommendations_response_dto_dict = get_bids_recommendations_response_dto_instance.to_dict()
# create an instance of GetBidsRecommendationsResponseDTO from a dict
get_bids_recommendations_response_dto_from_dict = GetBidsRecommendationsResponseDTO.from_dict(get_bids_recommendations_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


