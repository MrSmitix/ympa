# GetPricesByOfferIdsResponse

Ответ на запрос списка цен.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferPriceByOfferIdsListResponseDTO**](OfferPriceByOfferIdsListResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPricesByOfferIdsResponse from a JSON string
get_prices_by_offer_ids_response_instance = GetPricesByOfferIdsResponse.from_json(json)
# print the JSON string representation of the object
print GetPricesByOfferIdsResponse.to_json()

# convert the object into a dict
get_prices_by_offer_ids_response_dict = get_prices_by_offer_ids_response_instance.to_dict()
# create an instance of GetPricesByOfferIdsResponse from a dict
get_prices_by_offer_ids_response_from_dict = GetPricesByOfferIdsResponse.from_dict(get_prices_by_offer_ids_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


