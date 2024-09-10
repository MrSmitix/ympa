# OutletLicensesResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Licenses** | [**FullOutletLicenseDTO[]**](FullOutletLicenseDTO.md) | Список лицензий. | 

## Examples

- Prepare the resource
```powershell
$OutletLicensesResponseDTO = Initialize-ympa_powershell_clientOutletLicensesResponseDTO  -Licenses null
```

- Convert the resource to JSON
```powershell
$OutletLicensesResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

