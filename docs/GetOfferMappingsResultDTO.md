# GetOfferMappingsResultDTO

Информация о товарах.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**offer_mappings** | [**List[GetOfferMappingDTO]**](GetOfferMappingDTO.md) | Информация о товарах. | 

## Example

```python
from ympa_python_client.models.get_offer_mappings_result_dto import GetOfferMappingsResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferMappingsResultDTO from a JSON string
get_offer_mappings_result_dto_instance = GetOfferMappingsResultDTO.from_json(json)
# print the JSON string representation of the object
print(GetOfferMappingsResultDTO.to_json())

# convert the object into a dict
get_offer_mappings_result_dto_dict = get_offer_mappings_result_dto_instance.to_dict()
# create an instance of GetOfferMappingsResultDTO from a dict
get_offer_mappings_result_dto_from_dict = GetOfferMappingsResultDTO.from_dict(get_offer_mappings_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


