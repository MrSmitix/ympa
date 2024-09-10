# CalculateTariffsParametersDTO

Параметры для расчета стоимости услуг.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] 
**selling_program** | [**SellingProgramType**](SellingProgramType.md) |  | [optional] 
**frequency** | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.calculate_tariffs_parameters_dto import CalculateTariffsParametersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsParametersDTO from a JSON string
calculate_tariffs_parameters_dto_instance = CalculateTariffsParametersDTO.from_json(json)
# print the JSON string representation of the object
print(CalculateTariffsParametersDTO.to_json())

# convert the object into a dict
calculate_tariffs_parameters_dto_dict = calculate_tariffs_parameters_dto_instance.to_dict()
# create an instance of CalculateTariffsParametersDTO from a dict
calculate_tariffs_parameters_dto_from_dict = CalculateTariffsParametersDTO.from_dict(calculate_tariffs_parameters_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


