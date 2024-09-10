# PromoOfferDiscountParamsDTO

Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **int** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**promo_price** | **int** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**max_promo_price** | **int** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 

## Example

```python
from ympa_python_client.models.promo_offer_discount_params_dto import PromoOfferDiscountParamsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoOfferDiscountParamsDTO from a JSON string
promo_offer_discount_params_dto_instance = PromoOfferDiscountParamsDTO.from_json(json)
# print the JSON string representation of the object
print(PromoOfferDiscountParamsDTO.to_json())

# convert the object into a dict
promo_offer_discount_params_dto_dict = promo_offer_discount_params_dto_instance.to_dict()
# create an instance of PromoOfferDiscountParamsDTO from a dict
promo_offer_discount_params_dto_from_dict = PromoOfferDiscountParamsDTO.from_dict(promo_offer_discount_params_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


