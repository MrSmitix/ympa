# GetAllOffersResponse

Список предложений.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[OfferDTO]**](OfferDTO.md) | Список предложений магазина. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_all_offers_response import GetAllOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetAllOffersResponse from a JSON string
get_all_offers_response_instance = GetAllOffersResponse.from_json(json)
# print the JSON string representation of the object
print GetAllOffersResponse.to_json()

# convert the object into a dict
get_all_offers_response_dict = get_all_offers_response_instance.to_dict()
# create an instance of GetAllOffersResponse from a dict
get_all_offers_response_from_dict = GetAllOffersResponse.from_dict(get_all_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


