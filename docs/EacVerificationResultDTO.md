# EacVerificationResultDTO

Результат выполнения запроса.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_result** | [**EacVerificationStatusType**](EacVerificationStatusType.md) |  | [optional] 
**attempts_left** | **int** | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  | [optional] 

## Example

```python
from ympa_python_client.models.eac_verification_result_dto import EacVerificationResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of EacVerificationResultDTO from a JSON string
eac_verification_result_dto_instance = EacVerificationResultDTO.from_json(json)
# print the JSON string representation of the object
print(EacVerificationResultDTO.to_json())

# convert the object into a dict
eac_verification_result_dto_dict = eac_verification_result_dto_instance.to_dict()
# create an instance of EacVerificationResultDTO from a dict
eac_verification_result_dto_from_dict = EacVerificationResultDTO.from_dict(eac_verification_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


