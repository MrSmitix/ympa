# OptionValuesLimitedDTO

Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limiting_option_value_id** | **int** | Идентификатор значения ограничивающей характеристики. | 
**option_value_ids** | **List[int]** | Идентификаторы допустимых значений ограничиваемой характеристики.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.option_values_limited_dto import OptionValuesLimitedDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OptionValuesLimitedDTO from a JSON string
option_values_limited_dto_instance = OptionValuesLimitedDTO.from_json(json)
# print the JSON string representation of the object
print OptionValuesLimitedDTO.to_json()

# convert the object into a dict
option_values_limited_dto_dict = option_values_limited_dto_instance.to_dict()
# create an instance of OptionValuesLimitedDTO from a dict
option_values_limited_dto_from_dict = OptionValuesLimitedDTO.from_dict(option_values_limited_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


