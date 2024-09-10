# RejectedPromoOfferDeleteDTO

Информация о товаре и ошибки, которые появились при его удалении.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**reason** | [**RejectedPromoOfferDeleteReasonType**](RejectedPromoOfferDeleteReasonType.md) |  | 

## Example

```python
from ympa_python_client.models.rejected_promo_offer_delete_dto import RejectedPromoOfferDeleteDTO

# TODO update the JSON string below
json = "{}"
# create an instance of RejectedPromoOfferDeleteDTO from a JSON string
rejected_promo_offer_delete_dto_instance = RejectedPromoOfferDeleteDTO.from_json(json)
# print the JSON string representation of the object
print(RejectedPromoOfferDeleteDTO.to_json())

# convert the object into a dict
rejected_promo_offer_delete_dto_dict = rejected_promo_offer_delete_dto_instance.to_dict()
# create an instance of RejectedPromoOfferDeleteDTO from a dict
rejected_promo_offer_delete_dto_from_dict = RejectedPromoOfferDeleteDTO.from_dict(rejected_promo_offer_delete_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


