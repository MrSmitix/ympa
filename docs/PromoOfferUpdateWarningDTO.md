# PromoOfferUpdateWarningDTO

Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**PromoOfferUpdateWarningCodeType**](PromoOfferUpdateWarningCodeType.md) |  | 
**campaign_ids** | **List[int]** | Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.promo_offer_update_warning_dto import PromoOfferUpdateWarningDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoOfferUpdateWarningDTO from a JSON string
promo_offer_update_warning_dto_instance = PromoOfferUpdateWarningDTO.from_json(json)
# print the JSON string representation of the object
print PromoOfferUpdateWarningDTO.to_json()

# convert the object into a dict
promo_offer_update_warning_dto_dict = promo_offer_update_warning_dto_instance.to_dict()
# create an instance of PromoOfferUpdateWarningDTO from a dict
promo_offer_update_warning_dto_from_dict = PromoOfferUpdateWarningDTO.from_dict(promo_offer_update_warning_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


