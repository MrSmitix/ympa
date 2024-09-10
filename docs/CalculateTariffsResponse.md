# CalculateTariffsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**CalculateTariffsResponseDTO**](CalculateTariffsResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.calculate_tariffs_response import CalculateTariffsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsResponse from a JSON string
calculate_tariffs_response_instance = CalculateTariffsResponse.from_json(json)
# print the JSON string representation of the object
print(CalculateTariffsResponse.to_json())

# convert the object into a dict
calculate_tariffs_response_dict = calculate_tariffs_response_instance.to_dict()
# create an instance of CalculateTariffsResponse from a dict
calculate_tariffs_response_from_dict = CalculateTariffsResponse.from_dict(calculate_tariffs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


