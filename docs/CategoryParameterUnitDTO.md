# CategoryParameterUnitDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultUnitId** | **Int64** | Единица измерения по умолчанию. | 
**Units** | [**UnitDTO[]**](UnitDTO.md) | Допустимые единицы измерения. | 

## Examples

- Prepare the resource
```powershell
$CategoryParameterUnitDTO = Initialize-ympa_powershell_clientCategoryParameterUnitDTO  -DefaultUnitId null `
 -Units null
```

- Convert the resource to JSON
```powershell
$CategoryParameterUnitDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

