# OfferMappingSuggestionsListDTO

Список рекомендованных карточек товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[EnrichedMappingsOfferDTO]**](EnrichedMappingsOfferDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_mapping_suggestions_list_dto import OfferMappingSuggestionsListDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingSuggestionsListDTO from a JSON string
offer_mapping_suggestions_list_dto_instance = OfferMappingSuggestionsListDTO.from_json(json)
# print the JSON string representation of the object
print OfferMappingSuggestionsListDTO.to_json()

# convert the object into a dict
offer_mapping_suggestions_list_dto_dict = offer_mapping_suggestions_list_dto_instance.to_dict()
# create an instance of OfferMappingSuggestionsListDTO from a dict
offer_mapping_suggestions_list_dto_from_dict = OfferMappingSuggestionsListDTO.from_dict(offer_mapping_suggestions_list_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


