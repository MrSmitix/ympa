# UpdatePromoOffersResponse

Результат добавления товаров в акцию.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**UpdatePromoOffersResultDTO**](UpdatePromoOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.update_promo_offers_response import UpdatePromoOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOffersResponse from a JSON string
update_promo_offers_response_instance = UpdatePromoOffersResponse.from_json(json)
# print the JSON string representation of the object
print(UpdatePromoOffersResponse.to_json())

# convert the object into a dict
update_promo_offers_response_dict = update_promo_offers_response_instance.to_dict()
# create an instance of UpdatePromoOffersResponse from a dict
update_promo_offers_response_from_dict = UpdatePromoOffersResponse.from_dict(update_promo_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


