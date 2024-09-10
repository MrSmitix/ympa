# UpdateOfferMappingEntryDTO

Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**offer** | [**UpdateMappingsOfferDTO**](UpdateMappingsOfferDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_mapping_entry_dto import UpdateOfferMappingEntryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingEntryDTO from a JSON string
update_offer_mapping_entry_dto_instance = UpdateOfferMappingEntryDTO.from_json(json)
# print the JSON string representation of the object
print UpdateOfferMappingEntryDTO.to_json()

# convert the object into a dict
update_offer_mapping_entry_dto_dict = update_offer_mapping_entry_dto_instance.to_dict()
# create an instance of UpdateOfferMappingEntryDTO from a dict
update_offer_mapping_entry_dto_from_dict = UpdateOfferMappingEntryDTO.from_dict(update_offer_mapping_entry_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


