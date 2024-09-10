# CategoryParameterUnitDTO

Единицы измерения характеристики товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_unit_id** | **int** | Единица измерения по умолчанию. | 
**units** | [**List[UnitDTO]**](UnitDTO.md) | Допустимые единицы измерения. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.category_parameter_unit_dto import CategoryParameterUnitDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryParameterUnitDTO from a JSON string
category_parameter_unit_dto_instance = CategoryParameterUnitDTO.from_json(json)
# print the JSON string representation of the object
print CategoryParameterUnitDTO.to_json()

# convert the object into a dict
category_parameter_unit_dto_dict = category_parameter_unit_dto_instance.to_dict()
# create an instance of CategoryParameterUnitDTO from a dict
category_parameter_unit_dto_from_dict = CategoryParameterUnitDTO.from_dict(category_parameter_unit_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


