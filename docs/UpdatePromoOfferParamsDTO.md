# UpdatePromoOfferParamsDTO

Параметры товара, который участвует в акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount_params** | [**UpdatePromoOfferDiscountParamsDTO**](UpdatePromoOfferDiscountParamsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_promo_offer_params_dto import UpdatePromoOfferParamsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOfferParamsDTO from a JSON string
update_promo_offer_params_dto_instance = UpdatePromoOfferParamsDTO.from_json(json)
# print the JSON string representation of the object
print UpdatePromoOfferParamsDTO.to_json()

# convert the object into a dict
update_promo_offer_params_dto_dict = update_promo_offer_params_dto_instance.to_dict()
# create an instance of UpdatePromoOfferParamsDTO from a dict
update_promo_offer_params_dto_from_dict = UpdatePromoOfferParamsDTO.from_dict(update_promo_offer_params_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


