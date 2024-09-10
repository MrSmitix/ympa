# OfferCardRecommendationDTO

Рекомендация по заполнению карточки товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OfferCardRecommendationType**](OfferCardRecommendationType.md) |  | 
**percent** | **int** | Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. | [optional] 

## Example

```python
from ympa_python_client.models.offer_card_recommendation_dto import OfferCardRecommendationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferCardRecommendationDTO from a JSON string
offer_card_recommendation_dto_instance = OfferCardRecommendationDTO.from_json(json)
# print the JSON string representation of the object
print(OfferCardRecommendationDTO.to_json())

# convert the object into a dict
offer_card_recommendation_dto_dict = offer_card_recommendation_dto_instance.to_dict()
# create an instance of OfferCardRecommendationDTO from a dict
offer_card_recommendation_dto_from_dict = OfferCardRecommendationDTO.from_dict(offer_card_recommendation_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


