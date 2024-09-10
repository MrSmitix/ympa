# PriceCompetitivenessThresholdsDTO

Максимальные значения цены, при которых она является привлекательной или умеренной.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optimal_price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**average_price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.price_competitiveness_thresholds_dto import PriceCompetitivenessThresholdsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PriceCompetitivenessThresholdsDTO from a JSON string
price_competitiveness_thresholds_dto_instance = PriceCompetitivenessThresholdsDTO.from_json(json)
# print the JSON string representation of the object
print(PriceCompetitivenessThresholdsDTO.to_json())

# convert the object into a dict
price_competitiveness_thresholds_dto_dict = price_competitiveness_thresholds_dto_instance.to_dict()
# create an instance of PriceCompetitivenessThresholdsDTO from a dict
price_competitiveness_thresholds_dto_from_dict = PriceCompetitivenessThresholdsDTO.from_dict(price_competitiveness_thresholds_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


