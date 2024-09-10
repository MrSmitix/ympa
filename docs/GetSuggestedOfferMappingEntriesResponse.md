# GetSuggestedOfferMappingEntriesResponse

Ответ со списком рекомендованных карточек товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferMappingSuggestionsListDTO**](OfferMappingSuggestionsListDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSuggestedOfferMappingEntriesResponse from a JSON string
get_suggested_offer_mapping_entries_response_instance = GetSuggestedOfferMappingEntriesResponse.from_json(json)
# print the JSON string representation of the object
print(GetSuggestedOfferMappingEntriesResponse.to_json())

# convert the object into a dict
get_suggested_offer_mapping_entries_response_dict = get_suggested_offer_mapping_entries_response_instance.to_dict()
# create an instance of GetSuggestedOfferMappingEntriesResponse from a dict
get_suggested_offer_mapping_entries_response_from_dict = GetSuggestedOfferMappingEntriesResponse.from_dict(get_suggested_offer_mapping_entries_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


