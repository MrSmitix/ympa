# PromoOfferPromocodeParamsDTO

Параметры товара в акции с типом `MARKET_PROMOCODE`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_price** | **int** | Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.promo_offer_promocode_params_dto import PromoOfferPromocodeParamsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoOfferPromocodeParamsDTO from a JSON string
promo_offer_promocode_params_dto_instance = PromoOfferPromocodeParamsDTO.from_json(json)
# print the JSON string representation of the object
print PromoOfferPromocodeParamsDTO.to_json()

# convert the object into a dict
promo_offer_promocode_params_dto_dict = promo_offer_promocode_params_dto_instance.to_dict()
# create an instance of PromoOfferPromocodeParamsDTO from a dict
promo_offer_promocode_params_dto_from_dict = PromoOfferPromocodeParamsDTO.from_dict(promo_offer_promocode_params_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


