# ParameterValueConstraintsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinValue** | **Double** | Минимальное число. | [optional] 
**MaxValue** | **Double** | Максимальное число. | [optional] 
**MaxLength** | **Int32** | Максимальная длина текста. | [optional] 

## Examples

- Prepare the resource
```powershell
$ParameterValueConstraintsDTO = Initialize-ympa_powershell_clientParameterValueConstraintsDTO  -MinValue null `
 -MaxValue null `
 -MaxLength null
```

- Convert the resource to JSON
```powershell
$ParameterValueConstraintsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

