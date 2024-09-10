# OfferMappingInfoDTO

Информация о карточке товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.offer_mapping_info_dto import OfferMappingInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingInfoDTO from a JSON string
offer_mapping_info_dto_instance = OfferMappingInfoDTO.from_json(json)
# print the JSON string representation of the object
print(OfferMappingInfoDTO.to_json())

# convert the object into a dict
offer_mapping_info_dto_dict = offer_mapping_info_dto_instance.to_dict()
# create an instance of OfferMappingInfoDTO from a dict
offer_mapping_info_dto_from_dict = OfferMappingInfoDTO.from_dict(offer_mapping_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


