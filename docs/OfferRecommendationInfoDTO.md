# OfferRecommendationInfoDTO

Рекомендации, касающиеся цены на товар.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**recommended_cofinance_price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**competitiveness_thresholds** | [**PriceCompetitivenessThresholdsDTO**](PriceCompetitivenessThresholdsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_recommendation_info_dto import OfferRecommendationInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferRecommendationInfoDTO from a JSON string
offer_recommendation_info_dto_instance = OfferRecommendationInfoDTO.from_json(json)
# print the JSON string representation of the object
print OfferRecommendationInfoDTO.to_json()

# convert the object into a dict
offer_recommendation_info_dto_dict = offer_recommendation_info_dto_instance.to_dict()
# create an instance of OfferRecommendationInfoDTO from a dict
offer_recommendation_info_dto_from_dict = OfferRecommendationInfoDTO.from_dict(offer_recommendation_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


