# UpdatePromoOfferDTO

Описание товаров, которые участвуют в акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**params** | [**UpdatePromoOfferParamsDTO**](UpdatePromoOfferParamsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_promo_offer_dto import UpdatePromoOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOfferDTO from a JSON string
update_promo_offer_dto_instance = UpdatePromoOfferDTO.from_json(json)
# print the JSON string representation of the object
print UpdatePromoOfferDTO.to_json()

# convert the object into a dict
update_promo_offer_dto_dict = update_promo_offer_dto_instance.to_dict()
# create an instance of UpdatePromoOfferDTO from a dict
update_promo_offer_dto_from_dict = UpdatePromoOfferDTO.from_dict(update_promo_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


