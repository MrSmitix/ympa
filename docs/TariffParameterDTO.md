# TariffParameterDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Название параметра. | 
**Value** | **String** | Значение параметра. | 

## Examples

- Prepare the resource
```powershell
$TariffParameterDTO = Initialize-ympa_powershell_clientTariffParameterDTO  -Name null `
 -Value null
```

- Convert the resource to JSON
```powershell
$TariffParameterDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

