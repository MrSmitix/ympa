# DeletePromoOffersResultDTO

Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_offers** | [**List[RejectedPromoOfferDeleteDTO]**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_promo_offers_result_dto import DeletePromoOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePromoOffersResultDTO from a JSON string
delete_promo_offers_result_dto_instance = DeletePromoOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print DeletePromoOffersResultDTO.to_json()

# convert the object into a dict
delete_promo_offers_result_dto_dict = delete_promo_offers_result_dto_instance.to_dict()
# create an instance of DeletePromoOffersResultDTO from a dict
delete_promo_offers_result_dto_from_dict = DeletePromoOffersResultDTO.from_dict(delete_promo_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


