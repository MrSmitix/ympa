# ParameterValueOptionDTO

Значение характеристики.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор значения. | 
**value** | **str** | Значение. | 
**description** | **str** | Описание значения. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.parameter_value_option_dto import ParameterValueOptionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParameterValueOptionDTO from a JSON string
parameter_value_option_dto_instance = ParameterValueOptionDTO.from_json(json)
# print the JSON string representation of the object
print ParameterValueOptionDTO.to_json()

# convert the object into a dict
parameter_value_option_dto_dict = parameter_value_option_dto_instance.to_dict()
# create an instance of ParameterValueOptionDTO from a dict
parameter_value_option_dto_from_dict = ParameterValueOptionDTO.from_dict(parameter_value_option_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


