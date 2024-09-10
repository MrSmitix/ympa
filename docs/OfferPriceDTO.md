# OfferPriceDTO

Товар с информацией о новой цене на него.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**price** | [**PriceDTO**](PriceDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_price_dto import OfferPriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPriceDTO from a JSON string
offer_price_dto_instance = OfferPriceDTO.from_json(json)
# print the JSON string representation of the object
print OfferPriceDTO.to_json()

# convert the object into a dict
offer_price_dto_dict = offer_price_dto_instance.to_dict()
# create an instance of OfferPriceDTO from a dict
offer_price_dto_from_dict = OfferPriceDTO.from_dict(offer_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


