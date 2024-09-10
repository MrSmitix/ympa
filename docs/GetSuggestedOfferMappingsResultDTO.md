# GetSuggestedOfferMappingsResultDTO

Подобранные карточки на Маркете.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[SuggestedOfferMappingDTO]**](SuggestedOfferMappingDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_suggested_offer_mappings_result_dto import GetSuggestedOfferMappingsResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetSuggestedOfferMappingsResultDTO from a JSON string
get_suggested_offer_mappings_result_dto_instance = GetSuggestedOfferMappingsResultDTO.from_json(json)
# print the JSON string representation of the object
print GetSuggestedOfferMappingsResultDTO.to_json()

# convert the object into a dict
get_suggested_offer_mappings_result_dto_dict = get_suggested_offer_mappings_result_dto_instance.to_dict()
# create an instance of GetSuggestedOfferMappingsResultDTO from a dict
get_suggested_offer_mappings_result_dto_from_dict = GetSuggestedOfferMappingsResultDTO.from_dict(get_suggested_offer_mappings_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


