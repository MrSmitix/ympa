# GetSuggestedOfferMappingEntriesRequest

Запрос рекомендованных карточек товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[MappingsOfferDTO]**](MappingsOfferDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetSuggestedOfferMappingEntriesRequest from a JSON string
get_suggested_offer_mapping_entries_request_instance = GetSuggestedOfferMappingEntriesRequest.from_json(json)
# print the JSON string representation of the object
print GetSuggestedOfferMappingEntriesRequest.to_json()

# convert the object into a dict
get_suggested_offer_mapping_entries_request_dict = get_suggested_offer_mapping_entries_request_instance.to_dict()
# create an instance of GetSuggestedOfferMappingEntriesRequest from a dict
get_suggested_offer_mapping_entries_request_from_dict = GetSuggestedOfferMappingEntriesRequest.from_dict(get_suggested_offer_mapping_entries_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


