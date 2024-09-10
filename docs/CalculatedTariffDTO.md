# CalculatedTariffDTO

Информация об услугах Маркета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**CalculatedTariffType**](CalculatedTariffType.md) |  | 
**amount** | **float** | Стоимость услуги в рублях. | [optional] 
**parameters** | [**List[TariffParameterDTO]**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.calculated_tariff_dto import CalculatedTariffDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CalculatedTariffDTO from a JSON string
calculated_tariff_dto_instance = CalculatedTariffDTO.from_json(json)
# print the JSON string representation of the object
print CalculatedTariffDTO.to_json()

# convert the object into a dict
calculated_tariff_dto_dict = calculated_tariff_dto_instance.to_dict()
# create an instance of CalculatedTariffDTO from a dict
calculated_tariff_dto_from_dict = CalculatedTariffDTO.from_dict(calculated_tariff_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


