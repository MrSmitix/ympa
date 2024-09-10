# QuarantineOfferDTO

Товар в карантине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**current_price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**last_valid_price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**verdicts** | [**List[PriceQuarantineVerdictDTO]**](PriceQuarantineVerdictDTO.md) | Причины попадания товара в карантин. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.quarantine_offer_dto import QuarantineOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QuarantineOfferDTO from a JSON string
quarantine_offer_dto_instance = QuarantineOfferDTO.from_json(json)
# print the JSON string representation of the object
print QuarantineOfferDTO.to_json()

# convert the object into a dict
quarantine_offer_dto_dict = quarantine_offer_dto_instance.to_dict()
# create an instance of QuarantineOfferDTO from a dict
quarantine_offer_dto_from_dict = QuarantineOfferDTO.from_dict(quarantine_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


