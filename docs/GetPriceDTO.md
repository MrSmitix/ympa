# GetPriceDTO

Цена с указанием времени последнего обновления.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение. | 
**currency_id** | [**CurrencyType**](CurrencyType.md) |  | 
**updated_at** | **datetime** | Время последнего обновления. | 

## Example

```python
from ympa_python_client.models.get_price_dto import GetPriceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPriceDTO from a JSON string
get_price_dto_instance = GetPriceDTO.from_json(json)
# print the JSON string representation of the object
print(GetPriceDTO.to_json())

# convert the object into a dict
get_price_dto_dict = get_price_dto_instance.to_dict()
# create an instance of GetPriceDTO from a dict
get_price_dto_from_dict = GetPriceDTO.from_dict(get_price_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


