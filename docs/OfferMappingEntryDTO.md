# OfferMappingEntryDTO

Список товаров. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**offer** | [**MappingsOfferDTO**](MappingsOfferDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_mapping_entry_dto import OfferMappingEntryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingEntryDTO from a JSON string
offer_mapping_entry_dto_instance = OfferMappingEntryDTO.from_json(json)
# print the JSON string representation of the object
print OfferMappingEntryDTO.to_json()

# convert the object into a dict
offer_mapping_entry_dto_dict = offer_mapping_entry_dto_instance.to_dict()
# create an instance of OfferMappingEntryDTO from a dict
offer_mapping_entry_dto_from_dict = OfferMappingEntryDTO.from_dict(offer_mapping_entry_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


