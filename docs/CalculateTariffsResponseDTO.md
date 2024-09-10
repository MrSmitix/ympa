# CalculateTariffsResponseDTO

Расчет стоимости услуг.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[CalculateTariffsOfferInfoDTO]**](CalculateTariffsOfferInfoDTO.md) | Стоимость услуг. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.calculate_tariffs_response_dto import CalculateTariffsResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsResponseDTO from a JSON string
calculate_tariffs_response_dto_instance = CalculateTariffsResponseDTO.from_json(json)
# print the JSON string representation of the object
print CalculateTariffsResponseDTO.to_json()

# convert the object into a dict
calculate_tariffs_response_dto_dict = calculate_tariffs_response_dto_instance.to_dict()
# create an instance of CalculateTariffsResponseDTO from a dict
calculate_tariffs_response_dto_from_dict = CalculateTariffsResponseDTO.from_dict(calculate_tariffs_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


