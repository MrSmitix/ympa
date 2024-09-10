# GetPromoOffersResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetPromoOffersResultDTO**](GetPromoOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_promo_offers_response import GetPromoOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoOffersResponse from a JSON string
get_promo_offers_response_instance = GetPromoOffersResponse.from_json(json)
# print the JSON string representation of the object
print(GetPromoOffersResponse.to_json())

# convert the object into a dict
get_promo_offers_response_dict = get_promo_offers_response_instance.to_dict()
# create an instance of GetPromoOffersResponse from a dict
get_promo_offers_response_from_dict = GetPromoOffersResponse.from_dict(get_promo_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


