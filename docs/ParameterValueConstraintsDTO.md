# ParameterValueConstraintsDTO

Ограничения на значения характеристик.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_value** | **float** | Минимальное число. | [optional] 
**max_value** | **float** | Максимальное число. | [optional] 
**max_length** | **int** | Максимальная длина текста. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.parameter_value_constraints_dto import ParameterValueConstraintsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParameterValueConstraintsDTO from a JSON string
parameter_value_constraints_dto_instance = ParameterValueConstraintsDTO.from_json(json)
# print the JSON string representation of the object
print ParameterValueConstraintsDTO.to_json()

# convert the object into a dict
parameter_value_constraints_dto_dict = parameter_value_constraints_dto_instance.to_dict()
# create an instance of ParameterValueConstraintsDTO from a dict
parameter_value_constraints_dto_from_dict = ParameterValueConstraintsDTO.from_dict(parameter_value_constraints_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


