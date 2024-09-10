# UpdatePromoOfferDiscountParamsDTO

Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **int** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  | [optional] 
**promo_price** | **int** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  | [optional] 

## Example

```python
from ympa_python_client.models.update_promo_offer_discount_params_dto import UpdatePromoOfferDiscountParamsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOfferDiscountParamsDTO from a JSON string
update_promo_offer_discount_params_dto_instance = UpdatePromoOfferDiscountParamsDTO.from_json(json)
# print the JSON string representation of the object
print(UpdatePromoOfferDiscountParamsDTO.to_json())

# convert the object into a dict
update_promo_offer_discount_params_dto_dict = update_promo_offer_discount_params_dto_instance.to_dict()
# create an instance of UpdatePromoOfferDiscountParamsDTO from a dict
update_promo_offer_discount_params_dto_from_dict = UpdatePromoOfferDiscountParamsDTO.from_dict(update_promo_offer_discount_params_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


