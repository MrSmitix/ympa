# AddHiddenOffersRequest

Запрос на скрытие оферов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hidden_offers** | [**List[HiddenOfferDTO]**](HiddenOfferDTO.md) | Список скрытых товаров.  | 

## Example

```python
from ympa_python_client.models.add_hidden_offers_request import AddHiddenOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddHiddenOffersRequest from a JSON string
add_hidden_offers_request_instance = AddHiddenOffersRequest.from_json(json)
# print the JSON string representation of the object
print(AddHiddenOffersRequest.to_json())

# convert the object into a dict
add_hidden_offers_request_dict = add_hidden_offers_request_instance.to_dict()
# create an instance of AddHiddenOffersRequest from a dict
add_hidden_offers_request_from_dict = AddHiddenOffersRequest.from_dict(add_hidden_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


