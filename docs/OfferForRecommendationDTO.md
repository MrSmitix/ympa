# OfferForRecommendationDTO

Информация о состоянии цены на товар.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**cofinance_price** | [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**competitiveness** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 
**shows** | **int** | Количество показов карточки товара за последние 7 дней. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_for_recommendation_dto import OfferForRecommendationDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferForRecommendationDTO from a JSON string
offer_for_recommendation_dto_instance = OfferForRecommendationDTO.from_json(json)
# print the JSON string representation of the object
print OfferForRecommendationDTO.to_json()

# convert the object into a dict
offer_for_recommendation_dto_dict = offer_for_recommendation_dto_instance.to_dict()
# create an instance of OfferForRecommendationDTO from a dict
offer_for_recommendation_dto_from_dict = OfferForRecommendationDTO.from_dict(offer_for_recommendation_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


