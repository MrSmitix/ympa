# TariffParameterDTO

Детали расчета конкретной услуги Маркета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Название параметра. | 
**value** | **str** | Значение параметра. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.tariff_parameter_dto import TariffParameterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of TariffParameterDTO from a JSON string
tariff_parameter_dto_instance = TariffParameterDTO.from_json(json)
# print the JSON string representation of the object
print TariffParameterDTO.to_json()

# convert the object into a dict
tariff_parameter_dto_dict = tariff_parameter_dto_instance.to_dict()
# create an instance of TariffParameterDTO from a dict
tariff_parameter_dto_from_dict = TariffParameterDTO.from_dict(tariff_parameter_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


