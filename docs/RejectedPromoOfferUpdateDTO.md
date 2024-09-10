# RejectedPromoOfferUpdateDTO

Описание отклоненного изменения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**reason** | [**RejectedPromoOfferUpdateReasonType**](RejectedPromoOfferUpdateReasonType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.rejected_promo_offer_update_dto import RejectedPromoOfferUpdateDTO

# TODO update the JSON string below
json = "{}"
# create an instance of RejectedPromoOfferUpdateDTO from a JSON string
rejected_promo_offer_update_dto_instance = RejectedPromoOfferUpdateDTO.from_json(json)
# print the JSON string representation of the object
print RejectedPromoOfferUpdateDTO.to_json()

# convert the object into a dict
rejected_promo_offer_update_dto_dict = rejected_promo_offer_update_dto_instance.to_dict()
# create an instance of RejectedPromoOfferUpdateDTO from a dict
rejected_promo_offer_update_dto_from_dict = RejectedPromoOfferUpdateDTO.from_dict(rejected_promo_offer_update_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


