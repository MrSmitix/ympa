# GetOfferMappingDTO

Информация о товаре.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer** | [**GetOfferDTO**](GetOfferDTO.md) |  | [optional] 
**mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_offer_mapping_dto import GetOfferMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferMappingDTO from a JSON string
get_offer_mapping_dto_instance = GetOfferMappingDTO.from_json(json)
# print the JSON string representation of the object
print GetOfferMappingDTO.to_json()

# convert the object into a dict
get_offer_mapping_dto_dict = get_offer_mapping_dto_instance.to_dict()
# create an instance of GetOfferMappingDTO from a dict
get_offer_mapping_dto_from_dict = GetOfferMappingDTO.from_dict(get_offer_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


