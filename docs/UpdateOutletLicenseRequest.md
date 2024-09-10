# UpdateOutletLicenseRequest

Запрос на создание или изменение лицензий для точек продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenses** | [**List[OutletLicenseDTO]**](OutletLicenseDTO.md) | Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_outlet_license_request import UpdateOutletLicenseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOutletLicenseRequest from a JSON string
update_outlet_license_request_instance = UpdateOutletLicenseRequest.from_json(json)
# print the JSON string representation of the object
print UpdateOutletLicenseRequest.to_json()

# convert the object into a dict
update_outlet_license_request_dict = update_outlet_license_request_instance.to_dict()
# create an instance of UpdateOutletLicenseRequest from a dict
update_outlet_license_request_from_dict = UpdateOutletLicenseRequest.from_dict(update_outlet_license_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


