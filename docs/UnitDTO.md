# UnitDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор единицы измерения. | 
**Name** | **String** | Сокращенное название единицы измерения. | 
**FullName** | **String** | Полное название единицы измерения. | 

## Examples

- Prepare the resource
```powershell
$UnitDTO = Initialize-ympa_powershell_clientUnitDTO  -Id null `
 -Name кг `
 -FullName килограмм
```

- Convert the resource to JSON
```powershell
$UnitDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

