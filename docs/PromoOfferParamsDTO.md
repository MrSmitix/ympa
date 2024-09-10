# PromoOfferParamsDTO

Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_params** | [**PromoOfferDiscountParamsDTO**](PromoOfferDiscountParamsDTO.md) |  | [optional] 
**promocode_params** | [**PromoOfferPromocodeParamsDTO**](PromoOfferPromocodeParamsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.promo_offer_params_dto import PromoOfferParamsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoOfferParamsDTO from a JSON string
promo_offer_params_dto_instance = PromoOfferParamsDTO.from_json(json)
# print the JSON string representation of the object
print(PromoOfferParamsDTO.to_json())

# convert the object into a dict
promo_offer_params_dto_dict = promo_offer_params_dto_instance.to_dict()
# create an instance of PromoOfferParamsDTO from a dict
promo_offer_params_dto_from_dict = PromoOfferParamsDTO.from_dict(promo_offer_params_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


