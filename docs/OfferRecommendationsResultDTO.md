# OfferRecommendationsResultDTO

Список товаров с рекомендациями.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**offer_recommendations** | [**List[OfferRecommendationDTO]**](OfferRecommendationDTO.md) | Страница списка товаров. | 

## Example

```python
from ympa_python_client.models.offer_recommendations_result_dto import OfferRecommendationsResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferRecommendationsResultDTO from a JSON string
offer_recommendations_result_dto_instance = OfferRecommendationsResultDTO.from_json(json)
# print the JSON string representation of the object
print(OfferRecommendationsResultDTO.to_json())

# convert the object into a dict
offer_recommendations_result_dto_dict = offer_recommendations_result_dto_instance.to_dict()
# create an instance of OfferRecommendationsResultDTO from a dict
offer_recommendations_result_dto_from_dict = OfferRecommendationsResultDTO.from_dict(offer_recommendations_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


