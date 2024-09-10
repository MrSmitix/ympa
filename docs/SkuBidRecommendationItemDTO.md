# SkuBidRecommendationItemDTO

Список товаров с рекомендованными ставками.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**bid** | **int** | Значение ставки. | 
**bid_recommendations** | [**List[BidRecommendationItemDTO]**](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  | [optional] 
**price_recommendations** | [**List[PriceRecommendationItemDTO]**](PriceRecommendationItemDTO.md) | Рекомендованные цены. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.sku_bid_recommendation_item_dto import SkuBidRecommendationItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of SkuBidRecommendationItemDTO from a JSON string
sku_bid_recommendation_item_dto_instance = SkuBidRecommendationItemDTO.from_json(json)
# print the JSON string representation of the object
print SkuBidRecommendationItemDTO.to_json()

# convert the object into a dict
sku_bid_recommendation_item_dto_dict = sku_bid_recommendation_item_dto_instance.to_dict()
# create an instance of SkuBidRecommendationItemDTO from a dict
sku_bid_recommendation_item_dto_from_dict = SkuBidRecommendationItemDTO.from_dict(sku_bid_recommendation_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


