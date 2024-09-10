# UpdateOfferContentRequest

Запрос на установку новых значений для параметров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers_content** | [**List[OfferContentDTO]**](OfferContentDTO.md) | Список товаров с указанными характеристиками. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_offer_content_request import UpdateOfferContentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOfferContentRequest from a JSON string
update_offer_content_request_instance = UpdateOfferContentRequest.from_json(json)
# print the JSON string representation of the object
print UpdateOfferContentRequest.to_json()

# convert the object into a dict
update_offer_content_request_dict = update_offer_content_request_instance.to_dict()
# create an instance of UpdateOfferContentRequest from a dict
update_offer_content_request_from_dict = UpdateOfferContentRequest.from_dict(update_offer_content_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


