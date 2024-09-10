# UpdateBusinessPricesRequest

Запрос на установку базовых цен на товары.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[UpdateBusinessOfferPriceDTO]**](UpdateBusinessOfferPriceDTO.md) | Список товаров с ценами. | 

## Example

```python
from ympa_python_client.models.update_business_prices_request import UpdateBusinessPricesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateBusinessPricesRequest from a JSON string
update_business_prices_request_instance = UpdateBusinessPricesRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateBusinessPricesRequest.to_json())

# convert the object into a dict
update_business_prices_request_dict = update_business_prices_request_instance.to_dict()
# create an instance of UpdateBusinessPricesRequest from a dict
update_business_prices_request_from_dict = UpdateBusinessPricesRequest.from_dict(update_business_prices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


