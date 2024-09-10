# SuggestedOfferMappingDTO

Товар с соответствующей карточкой на Маркете.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer** | [**SuggestedOfferDTO**](SuggestedOfferDTO.md) |  | [optional] 
**mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.suggested_offer_mapping_dto import SuggestedOfferMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of SuggestedOfferMappingDTO from a JSON string
suggested_offer_mapping_dto_instance = SuggestedOfferMappingDTO.from_json(json)
# print the JSON string representation of the object
print SuggestedOfferMappingDTO.to_json()

# convert the object into a dict
suggested_offer_mapping_dto_dict = suggested_offer_mapping_dto_instance.to_dict()
# create an instance of SuggestedOfferMappingDTO from a dict
suggested_offer_mapping_dto_from_dict = SuggestedOfferMappingDTO.from_dict(suggested_offer_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


