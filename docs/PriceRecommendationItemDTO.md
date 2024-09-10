# PriceRecommendationItemDTO

Рекомендованная цена.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. | 
**price** | **float** | Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.price_recommendation_item_dto import PriceRecommendationItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PriceRecommendationItemDTO from a JSON string
price_recommendation_item_dto_instance = PriceRecommendationItemDTO.from_json(json)
# print the JSON string representation of the object
print PriceRecommendationItemDTO.to_json()

# convert the object into a dict
price_recommendation_item_dto_dict = price_recommendation_item_dto_instance.to_dict()
# create an instance of PriceRecommendationItemDTO from a dict
price_recommendation_item_dto_from_dict = PriceRecommendationItemDTO.from_dict(price_recommendation_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


