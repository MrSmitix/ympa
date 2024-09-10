# GetOfferMappingEntriesResponse

Ответ на запрос списка товаров в каталоге.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferMappingEntriesDTO**](OfferMappingEntriesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferMappingEntriesResponse from a JSON string
get_offer_mapping_entries_response_instance = GetOfferMappingEntriesResponse.from_json(json)
# print the JSON string representation of the object
print(GetOfferMappingEntriesResponse.to_json())

# convert the object into a dict
get_offer_mapping_entries_response_dict = get_offer_mapping_entries_response_instance.to_dict()
# create an instance of GetOfferMappingEntriesResponse from a dict
get_offer_mapping_entries_response_from_dict = GetOfferMappingEntriesResponse.from_dict(get_offer_mapping_entries_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


