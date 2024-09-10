# QualityRatingAffectedOrderDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **Int64** | Идентификатор заказа. | 
**Description** | **String** | Описание проблемы. | 
**ComponentType** | [**AffectedOrderQualityRatingComponentType**](AffectedOrderQualityRatingComponentType.md) |  | 

## Examples

- Prepare the resource
```powershell
$QualityRatingAffectedOrderDTO = Initialize-ympa_powershell_clientQualityRatingAffectedOrderDTO  -OrderId null `
 -Description null `
 -ComponentType null
```

- Convert the resource to JSON
```powershell
$QualityRatingAffectedOrderDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

