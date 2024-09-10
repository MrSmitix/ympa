# BasePriceDTO

Цена на товар.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение. | 
**currency_id** | [**CurrencyType**](CurrencyType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.base_price_dto import BasePriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BasePriceDTO from a JSON string
base_price_dto_instance = BasePriceDTO.from_json(json)
# print the JSON string representation of the object
print BasePriceDTO.to_json()

# convert the object into a dict
base_price_dto_dict = base_price_dto_instance.to_dict()
# create an instance of BasePriceDTO from a dict
base_price_dto_from_dict = BasePriceDTO.from_dict(base_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


