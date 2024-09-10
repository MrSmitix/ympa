# QualityRatingComponentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Double** | Значение составляющей в процентах. | 
**ComponentType** | [**QualityRatingComponentType**](QualityRatingComponentType.md) |  | 

## Examples

- Prepare the resource
```powershell
$QualityRatingComponentDTO = Initialize-ympa_powershell_clientQualityRatingComponentDTO  -Value null `
 -ComponentType null
```

- Convert the resource to JSON
```powershell
$QualityRatingComponentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

