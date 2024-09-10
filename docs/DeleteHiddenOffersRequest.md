# DeleteHiddenOffersRequest

Запрос на возобновление показа оферов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hidden_offers** | [**List[HiddenOfferDTO]**](HiddenOfferDTO.md) | Список скрытых товаров.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_hidden_offers_request import DeleteHiddenOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteHiddenOffersRequest from a JSON string
delete_hidden_offers_request_instance = DeleteHiddenOffersRequest.from_json(json)
# print the JSON string representation of the object
print DeleteHiddenOffersRequest.to_json()

# convert the object into a dict
delete_hidden_offers_request_dict = delete_hidden_offers_request_instance.to_dict()
# create an instance of DeleteHiddenOffersRequest from a dict
delete_hidden_offers_request_from_dict = DeleteHiddenOffersRequest.from_dict(delete_hidden_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


