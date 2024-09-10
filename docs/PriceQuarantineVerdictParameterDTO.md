# PriceQuarantineVerdictParameterDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | [**PriceQuarantineVerdictParamNameType**](PriceQuarantineVerdictParamNameType.md) |  | 
**Value** | **String** | Значение параметра. | 

## Examples

- Prepare the resource
```powershell
$PriceQuarantineVerdictParameterDTO = Initialize-ympa_powershell_clientPriceQuarantineVerdictParameterDTO  -Name null `
 -Value null
```

- Convert the resource to JSON
```powershell
$PriceQuarantineVerdictParameterDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

