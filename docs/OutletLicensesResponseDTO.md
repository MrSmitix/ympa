# OutletLicensesResponseDTO

Ответ на запрос информации о лицензиях для точек продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenses** | [**List[FullOutletLicenseDTO]**](FullOutletLicenseDTO.md) | Список лицензий. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.outlet_licenses_response_dto import OutletLicensesResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OutletLicensesResponseDTO from a JSON string
outlet_licenses_response_dto_instance = OutletLicensesResponseDTO.from_json(json)
# print the JSON string representation of the object
print OutletLicensesResponseDTO.to_json()

# convert the object into a dict
outlet_licenses_response_dto_dict = outlet_licenses_response_dto_instance.to_dict()
# create an instance of OutletLicensesResponseDTO from a dict
outlet_licenses_response_dto_from_dict = OutletLicensesResponseDTO.from_dict(outlet_licenses_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


