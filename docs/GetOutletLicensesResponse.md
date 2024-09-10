# GetOutletLicensesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OutletLicensesResponseDTO**](OutletLicensesResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_outlet_licenses_response import GetOutletLicensesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOutletLicensesResponse from a JSON string
get_outlet_licenses_response_instance = GetOutletLicensesResponse.from_json(json)
# print the JSON string representation of the object
print(GetOutletLicensesResponse.to_json())

# convert the object into a dict
get_outlet_licenses_response_dict = get_outlet_licenses_response_instance.to_dict()
# create an instance of GetOutletLicensesResponse from a dict
get_outlet_licenses_response_from_dict = GetOutletLicensesResponse.from_dict(get_outlet_licenses_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


