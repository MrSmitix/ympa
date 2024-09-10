# CalculateTariffsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | [**CalculateTariffsParametersDTO**](CalculateTariffsParametersDTO.md) |  | 
**offers** | [**List[CalculateTariffsOfferDTO]**](CalculateTariffsOfferDTO.md) | Товары, для которых нужно рассчитать стоимость услуг. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.calculate_tariffs_request import CalculateTariffsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsRequest from a JSON string
calculate_tariffs_request_instance = CalculateTariffsRequest.from_json(json)
# print the JSON string representation of the object
print CalculateTariffsRequest.to_json()

# convert the object into a dict
calculate_tariffs_request_dict = calculate_tariffs_request_instance.to_dict()
# create an instance of CalculateTariffsRequest from a dict
calculate_tariffs_request_from_dict = CalculateTariffsRequest.from_dict(calculate_tariffs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


