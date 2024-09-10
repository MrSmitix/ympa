# OfferRecommendationDTO

Информация о состоянии цен и рекомендации. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer** | [**OfferForRecommendationDTO**](OfferForRecommendationDTO.md) |  | [optional] 
**recommendation** | [**OfferRecommendationInfoDTO**](OfferRecommendationInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.offer_recommendation_dto import OfferRecommendationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferRecommendationDTO from a JSON string
offer_recommendation_dto_instance = OfferRecommendationDTO.from_json(json)
# print the JSON string representation of the object
print(OfferRecommendationDTO.to_json())

# convert the object into a dict
offer_recommendation_dto_dict = offer_recommendation_dto_instance.to_dict()
# create an instance of OfferRecommendationDTO from a dict
offer_recommendation_dto_from_dict = OfferRecommendationDTO.from_dict(offer_recommendation_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


