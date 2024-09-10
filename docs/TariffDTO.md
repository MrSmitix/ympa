# TariffDTO

Информация о тарифах, по которым нужно заплатить за услуги Маркета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TariffType**](TariffType.md) |  | 
**percent** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**amount** | **float** | Значение тарифа в рублях. | 
**parameters** | [**List[TariffParameterDTO]**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.tariff_dto import TariffDTO

# TODO update the JSON string below
json = "{}"
# create an instance of TariffDTO from a JSON string
tariff_dto_instance = TariffDTO.from_json(json)
# print the JSON string representation of the object
print TariffDTO.to_json()

# convert the object into a dict
tariff_dto_dict = tariff_dto_instance.to_dict()
# create an instance of TariffDTO from a dict
tariff_dto_from_dict = TariffDTO.from_dict(tariff_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


