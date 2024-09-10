# PriceQuarantineVerdictDTO

Причина попадания товара в карантин.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**PriceQuarantineVerdictType**](PriceQuarantineVerdictType.md) |  | [optional] 
**params** | [**List[PriceQuarantineVerdictParameterDTO]**](PriceQuarantineVerdictParameterDTO.md) | Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.price_quarantine_verdict_dto import PriceQuarantineVerdictDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PriceQuarantineVerdictDTO from a JSON string
price_quarantine_verdict_dto_instance = PriceQuarantineVerdictDTO.from_json(json)
# print the JSON string representation of the object
print PriceQuarantineVerdictDTO.to_json()

# convert the object into a dict
price_quarantine_verdict_dto_dict = price_quarantine_verdict_dto_instance.to_dict()
# create an instance of PriceQuarantineVerdictDTO from a dict
price_quarantine_verdict_dto_from_dict = PriceQuarantineVerdictDTO.from_dict(price_quarantine_verdict_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


