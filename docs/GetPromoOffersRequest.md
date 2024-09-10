# GetPromoOffersRequest

Получение списка товаров, которые участвуют или могут участвовать в акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | **str** | Идентификатор акции. | 
**status_type** | [**PromoOfferParticipationStatusFilterType**](PromoOfferParticipationStatusFilterType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promo_offers_request import GetPromoOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoOffersRequest from a JSON string
get_promo_offers_request_instance = GetPromoOffersRequest.from_json(json)
# print the JSON string representation of the object
print GetPromoOffersRequest.to_json()

# convert the object into a dict
get_promo_offers_request_dict = get_promo_offers_request_instance.to_dict()
# create an instance of GetPromoOffersRequest from a dict
get_promo_offers_request_from_dict = GetPromoOffersRequest.from_dict(get_promo_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


