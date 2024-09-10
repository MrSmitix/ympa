# AgeDTO

Возраст в заданных единицах измерения.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение.  | 
**age_unit** | [**AgeUnitType**](AgeUnitType.md) |  | 

## Example

```python
from ympa_python_client.models.age_dto import AgeDTO

# TODO update the JSON string below
json = "{}"
# create an instance of AgeDTO from a JSON string
age_dto_instance = AgeDTO.from_json(json)
# print the JSON string representation of the object
print(AgeDTO.to_json())

# convert the object into a dict
age_dto_dict = age_dto_instance.to_dict()
# create an instance of AgeDTO from a dict
age_dto_from_dict = AgeDTO.from_dict(age_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


