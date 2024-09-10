# UpdatePromoOffersResultDTO

Ошибки и предупреждения, которые появились при добавлении товаров в акцию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers** | [**List[RejectedPromoOfferUpdateDTO]**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] 
**warning_offers** | [**List[WarningPromoOfferUpdateDTO]**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] 

## Example

```python
from ympa_python_client.models.update_promo_offers_result_dto import UpdatePromoOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOffersResultDTO from a JSON string
update_promo_offers_result_dto_instance = UpdatePromoOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print(UpdatePromoOffersResultDTO.to_json())

# convert the object into a dict
update_promo_offers_result_dto_dict = update_promo_offers_result_dto_instance.to_dict()
# create an instance of UpdatePromoOffersResultDTO from a dict
update_promo_offers_result_dto_from_dict = UpdatePromoOffersResultDTO.from_dict(update_promo_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


