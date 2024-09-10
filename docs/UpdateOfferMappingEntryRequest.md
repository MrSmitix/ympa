# UpdateOfferMappingEntryRequest

Запрос на обновление товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_mapping_entries** | [**List[UpdateOfferMappingEntryDTO]**](UpdateOfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingEntryRequest from a JSON string
update_offer_mapping_entry_request_instance = UpdateOfferMappingEntryRequest.from_json(json)
# print the JSON string representation of the object
print UpdateOfferMappingEntryRequest.to_json()

# convert the object into a dict
update_offer_mapping_entry_request_dict = update_offer_mapping_entry_request_instance.to_dict()
# create an instance of UpdateOfferMappingEntryRequest from a dict
update_offer_mapping_entry_request_from_dict = UpdateOfferMappingEntryRequest.from_dict(update_offer_mapping_entry_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


