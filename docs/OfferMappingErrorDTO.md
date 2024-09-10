# OfferMappingErrorDTO

Текст ошибки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OfferMappingErrorType**](OfferMappingErrorType.md) |  | 
**parameter_id** | **int** | Идентификатор характеристики, с которой связана ошибка. | [optional] 
**message** | **str** | Текст ошибки. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_mapping_error_dto import OfferMappingErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingErrorDTO from a JSON string
offer_mapping_error_dto_instance = OfferMappingErrorDTO.from_json(json)
# print the JSON string representation of the object
print OfferMappingErrorDTO.to_json()

# convert the object into a dict
offer_mapping_error_dto_dict = offer_mapping_error_dto_instance.to_dict()
# create an instance of OfferMappingErrorDTO from a dict
offer_mapping_error_dto_from_dict = OfferMappingErrorDTO.from_dict(offer_mapping_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


