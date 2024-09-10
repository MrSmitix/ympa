# GetPromoOfferDTO

Товар, который участвует или может участвовать в акции.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**status** | [**PromoOfferParticipationStatusType**](PromoOfferParticipationStatusType.md) |  | 
**params** | [**PromoOfferParamsDTO**](PromoOfferParamsDTO.md) |  | 
**auto_participating_details** | [**PromoOfferAutoParticipatingDetailsDTO**](PromoOfferAutoParticipatingDetailsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_promo_offer_dto import GetPromoOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoOfferDTO from a JSON string
get_promo_offer_dto_instance = GetPromoOfferDTO.from_json(json)
# print the JSON string representation of the object
print(GetPromoOfferDTO.to_json())

# convert the object into a dict
get_promo_offer_dto_dict = get_promo_offer_dto_instance.to_dict()
# create an instance of GetPromoOfferDTO from a dict
get_promo_offer_dto_from_dict = GetPromoOfferDTO.from_dict(get_promo_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


