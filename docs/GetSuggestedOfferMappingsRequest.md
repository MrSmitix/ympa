# GetSuggestedOfferMappingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[SuggestedOfferDTO]**](SuggestedOfferDTO.md) | Список товаров. | [optional] 

## Example

```python
from ympa_python_client.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetSuggestedOfferMappingsRequest from a JSON string
get_suggested_offer_mappings_request_instance = GetSuggestedOfferMappingsRequest.from_json(json)
# print the JSON string representation of the object
print(GetSuggestedOfferMappingsRequest.to_json())

# convert the object into a dict
get_suggested_offer_mappings_request_dict = get_suggested_offer_mappings_request_instance.to_dict()
# create an instance of GetSuggestedOfferMappingsRequest from a dict
get_suggested_offer_mappings_request_from_dict = GetSuggestedOfferMappingsRequest.from_dict(get_suggested_offer_mappings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


