# UpdateOfferMappingsResponse

Описывает проблемы, возникшие при сохранении товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**results** | [**List[UpdateOfferMappingResultDTO]**](UpdateOfferMappingResultDTO.md) | Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_mappings_response import UpdateOfferMappingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingsResponse from a JSON string
update_offer_mappings_response_instance = UpdateOfferMappingsResponse.from_json(json)
# print the JSON string representation of the object
print UpdateOfferMappingsResponse.to_json()

# convert the object into a dict
update_offer_mappings_response_dict = update_offer_mappings_response_instance.to_dict()
# create an instance of UpdateOfferMappingsResponse from a dict
update_offer_mappings_response_from_dict = UpdateOfferMappingsResponse.from_dict(update_offer_mappings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


