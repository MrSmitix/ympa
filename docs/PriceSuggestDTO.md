# PriceSuggestDTO

Тип цены.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**PriceSuggestType**](PriceSuggestType.md) |  | [optional] 
**price** | **float** | Цена в рублях. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.price_suggest_dto import PriceSuggestDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PriceSuggestDTO from a JSON string
price_suggest_dto_instance = PriceSuggestDTO.from_json(json)
# print the JSON string representation of the object
print PriceSuggestDTO.to_json()

# convert the object into a dict
price_suggest_dto_dict = price_suggest_dto_instance.to_dict()
# create an instance of PriceSuggestDTO from a dict
price_suggest_dto_from_dict = PriceSuggestDTO.from_dict(price_suggest_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


