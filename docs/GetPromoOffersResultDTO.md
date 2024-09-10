# GetPromoOffersResultDTO

Список товаров, которые участвуют или могут участвовать в акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[GetPromoOfferDTO]**](GetPromoOfferDTO.md) | Товары, которые участвуют или могут участвовать в акции. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promo_offers_result_dto import GetPromoOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoOffersResultDTO from a JSON string
get_promo_offers_result_dto_instance = GetPromoOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print GetPromoOffersResultDTO.to_json()

# convert the object into a dict
get_promo_offers_result_dto_dict = get_promo_offers_result_dto_instance.to_dict()
# create an instance of GetPromoOffersResultDTO from a dict
get_promo_offers_result_dto_from_dict = GetPromoOffersResultDTO.from_dict(get_promo_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


