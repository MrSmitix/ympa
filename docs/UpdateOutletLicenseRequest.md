# UpdateOutletLicenseRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Licenses** | [**OutletLicenseDTO[]**](OutletLicenseDTO.md) | Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  | 

## Examples

- Prepare the resource
```powershell
$UpdateOutletLicenseRequest = Initialize-ympa_powershell_clientUpdateOutletLicenseRequest  -Licenses null
```

- Convert the resource to JSON
```powershell
$UpdateOutletLicenseRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

