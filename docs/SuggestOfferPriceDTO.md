# SuggestOfferPriceDTO

Товар, для которого требуется получить цены для продвижения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**market_sku** | **int** | SKU на Маркете. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.suggest_offer_price_dto import SuggestOfferPriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of SuggestOfferPriceDTO from a JSON string
suggest_offer_price_dto_instance = SuggestOfferPriceDTO.from_json(json)
# print the JSON string representation of the object
print SuggestOfferPriceDTO.to_json()

# convert the object into a dict
suggest_offer_price_dto_dict = suggest_offer_price_dto_instance.to_dict()
# create an instance of SuggestOfferPriceDTO from a dict
suggest_offer_price_dto_from_dict = SuggestOfferPriceDTO.from_dict(suggest_offer_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


