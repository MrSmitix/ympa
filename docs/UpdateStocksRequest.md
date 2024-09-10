# UpdateStocksRequest

Запрос на изменение информации по остаткам товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skus** | [**List[UpdateStockDTO]**](UpdateStockDTO.md) | Данные об остатках товаров.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_stocks_request import UpdateStocksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateStocksRequest from a JSON string
update_stocks_request_instance = UpdateStocksRequest.from_json(json)
# print the JSON string representation of the object
print UpdateStocksRequest.to_json()

# convert the object into a dict
update_stocks_request_dict = update_stocks_request_instance.to_dict()
# create an instance of UpdateStocksRequest from a dict
update_stocks_request_from_dict = UpdateStocksRequest.from_dict(update_stocks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


