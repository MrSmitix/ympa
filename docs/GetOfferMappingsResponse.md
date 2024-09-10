# GetOfferMappingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetOfferMappingsResultDTO**](GetOfferMappingsResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_offer_mappings_response import GetOfferMappingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferMappingsResponse from a JSON string
get_offer_mappings_response_instance = GetOfferMappingsResponse.from_json(json)
# print the JSON string representation of the object
print(GetOfferMappingsResponse.to_json())

# convert the object into a dict
get_offer_mappings_response_dict = get_offer_mappings_response_instance.to_dict()
# create an instance of GetOfferMappingsResponse from a dict
get_offer_mappings_response_from_dict = GetOfferMappingsResponse.from_dict(get_offer_mappings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


