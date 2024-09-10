# ConfirmPricesRequest

Запрос на подтверждение цены. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, у которых подтверждается цена. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.confirm_prices_request import ConfirmPricesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConfirmPricesRequest from a JSON string
confirm_prices_request_instance = ConfirmPricesRequest.from_json(json)
# print the JSON string representation of the object
print ConfirmPricesRequest.to_json()

# convert the object into a dict
confirm_prices_request_dict = confirm_prices_request_instance.to_dict()
# create an instance of ConfirmPricesRequest from a dict
confirm_prices_request_from_dict = ConfirmPricesRequest.from_dict(confirm_prices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


