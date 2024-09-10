# OfferMappingEntriesDTO

Информация о товарах в каталоге.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**offer_mapping_entries** | [**List[OfferMappingEntryDTO]**](OfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 

## Example

```python
from ympa_python_client.models.offer_mapping_entries_dto import OfferMappingEntriesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingEntriesDTO from a JSON string
offer_mapping_entries_dto_instance = OfferMappingEntriesDTO.from_json(json)
# print the JSON string representation of the object
print(OfferMappingEntriesDTO.to_json())

# convert the object into a dict
offer_mapping_entries_dto_dict = offer_mapping_entries_dto_instance.to_dict()
# create an instance of OfferMappingEntriesDTO from a dict
offer_mapping_entries_dto_from_dict = OfferMappingEntriesDTO.from_dict(offer_mapping_entries_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


