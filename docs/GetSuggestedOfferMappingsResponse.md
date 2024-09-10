# GetSuggestedOfferMappingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetSuggestedOfferMappingsResultDTO**](GetSuggestedOfferMappingsResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSuggestedOfferMappingsResponse from a JSON string
get_suggested_offer_mappings_response_instance = GetSuggestedOfferMappingsResponse.from_json(json)
# print the JSON string representation of the object
print(GetSuggestedOfferMappingsResponse.to_json())

# convert the object into a dict
get_suggested_offer_mappings_response_dict = get_suggested_offer_mappings_response_instance.to_dict()
# create an instance of GetSuggestedOfferMappingsResponse from a dict
get_suggested_offer_mappings_response_from_dict = GetSuggestedOfferMappingsResponse.from_dict(get_suggested_offer_mappings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


