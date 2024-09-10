# UpdateOfferMappingsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_mappings** | [**List[UpdateOfferMappingDTO]**](UpdateOfferMappingDTO.md) | Перечень товаров, которые нужно добавить или обновить. | 
**only_partner_media_content** | **bool** | Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_mappings_request import UpdateOfferMappingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferMappingsRequest from a JSON string
update_offer_mappings_request_instance = UpdateOfferMappingsRequest.from_json(json)
# print the JSON string representation of the object
print UpdateOfferMappingsRequest.to_json()

# convert the object into a dict
update_offer_mappings_request_dict = update_offer_mappings_request_instance.to_dict()
# create an instance of UpdateOfferMappingsRequest from a dict
update_offer_mappings_request_from_dict = UpdateOfferMappingsRequest.from_dict(update_offer_mappings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


