# UpdatePricesRequest

Запрос на установку цен на товары.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[OfferPriceDTO]**](OfferPriceDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_prices_request import UpdatePricesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePricesRequest from a JSON string
update_prices_request_instance = UpdatePricesRequest.from_json(json)
# print the JSON string representation of the object
print UpdatePricesRequest.to_json()

# convert the object into a dict
update_prices_request_dict = update_prices_request_instance.to_dict()
# create an instance of UpdatePricesRequest from a dict
update_prices_request_from_dict = UpdatePricesRequest.from_dict(update_prices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


