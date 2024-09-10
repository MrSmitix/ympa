# UnitDTO

Единица измерения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор единицы измерения. | 
**name** | **str** | Сокращенное название единицы измерения. | 
**full_name** | **str** | Полное название единицы измерения. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.unit_dto import UnitDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UnitDTO from a JSON string
unit_dto_instance = UnitDTO.from_json(json)
# print the JSON string representation of the object
print UnitDTO.to_json()

# convert the object into a dict
unit_dto_dict = unit_dto_instance.to_dict()
# create an instance of UnitDTO from a dict
unit_dto_from_dict = UnitDTO.from_dict(unit_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


