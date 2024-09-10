# PriceQuarantineVerdictParameterDTO

Параметр карантина.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**PriceQuarantineVerdictParamNameType**](PriceQuarantineVerdictParamNameType.md) |  | 
**value** | **str** | Значение параметра. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.price_quarantine_verdict_parameter_dto import PriceQuarantineVerdictParameterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PriceQuarantineVerdictParameterDTO from a JSON string
price_quarantine_verdict_parameter_dto_instance = PriceQuarantineVerdictParameterDTO.from_json(json)
# print the JSON string representation of the object
print PriceQuarantineVerdictParameterDTO.to_json()

# convert the object into a dict
price_quarantine_verdict_parameter_dto_dict = price_quarantine_verdict_parameter_dto_instance.to_dict()
# create an instance of PriceQuarantineVerdictParameterDTO from a dict
price_quarantine_verdict_parameter_dto_from_dict = PriceQuarantineVerdictParameterDTO.from_dict(price_quarantine_verdict_parameter_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


