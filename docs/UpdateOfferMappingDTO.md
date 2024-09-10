# UpdateOfferMappingDTO

Информация о товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer** | [**UpdateOfferDTO**](UpdateOfferDTO.md) |  | 
**mapping** | [**UpdateMappingDTO**](UpdateMappingDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_mapping_dto import UpdateOfferMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingDTO from a JSON string
update_offer_mapping_dto_instance = UpdateOfferMappingDTO.from_json(json)
# print the JSON string representation of the object
print UpdateOfferMappingDTO.to_json()

# convert the object into a dict
update_offer_mapping_dto_dict = update_offer_mapping_dto_instance.to_dict()
# create an instance of UpdateOfferMappingDTO from a dict
update_offer_mapping_dto_from_dict = UpdateOfferMappingDTO.from_dict(update_offer_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


