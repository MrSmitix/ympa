# AgeDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Значение.  | 
**AgeUnit** | [**AgeUnitType**](AgeUnitType.md) |  | 

## Examples

- Prepare the resource
```powershell
$AgeDTO = Initialize-ympa_powershell_clientAgeDTO  -Value null `
 -AgeUnit null
```

- Convert the resource to JSON
```powershell
$AgeDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

