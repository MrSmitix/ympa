# DeletePromoOffersResponse

Результат удаления товаров из акции.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**DeletePromoOffersResultDTO**](DeletePromoOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.delete_promo_offers_response import DeletePromoOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePromoOffersResponse from a JSON string
delete_promo_offers_response_instance = DeletePromoOffersResponse.from_json(json)
# print the JSON string representation of the object
print(DeletePromoOffersResponse.to_json())

# convert the object into a dict
delete_promo_offers_response_dict = delete_promo_offers_response_instance.to_dict()
# create an instance of DeletePromoOffersResponse from a dict
delete_promo_offers_response_from_dict = DeletePromoOffersResponse.from_dict(delete_promo_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


