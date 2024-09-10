# OfferPriceByOfferIdsResponseDTO

Информация об установленной цене.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**price** | [**PriceDTO**](PriceDTO.md) |  | [optional] 
**updated_at** | **datetime** | Дата и время последнего обновления цены. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_price_by_offer_ids_response_dto import OfferPriceByOfferIdsResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPriceByOfferIdsResponseDTO from a JSON string
offer_price_by_offer_ids_response_dto_instance = OfferPriceByOfferIdsResponseDTO.from_json(json)
# print the JSON string representation of the object
print OfferPriceByOfferIdsResponseDTO.to_json()

# convert the object into a dict
offer_price_by_offer_ids_response_dto_dict = offer_price_by_offer_ids_response_dto_instance.to_dict()
# create an instance of OfferPriceByOfferIdsResponseDTO from a dict
offer_price_by_offer_ids_response_dto_from_dict = OfferPriceByOfferIdsResponseDTO.from_dict(offer_price_by_offer_ids_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


