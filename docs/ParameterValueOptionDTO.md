# ParameterValueOptionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор значения. | 
**Value** | **String** | Значение. | 
**Description** | **String** | Описание значения. | [optional] 

## Examples

- Prepare the resource
```powershell
$ParameterValueOptionDTO = Initialize-ympa_powershell_clientParameterValueOptionDTO  -Id null `
 -Value null `
 -Description null
```

- Convert the resource to JSON
```powershell
$ParameterValueOptionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

