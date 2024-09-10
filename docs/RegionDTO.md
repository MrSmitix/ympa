# RegionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор региона. | [optional] 
**Name** | **String** | Название региона. | 
**Type** | [**RegionType**](RegionType.md) |  | 
**Parent** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**Children** | [**RegionDTO[]**](RegionDTO.md) | Дочерние регионы. | [optional] 

## Examples

- Prepare the resource
```powershell
$RegionDTO = Initialize-ympa_powershell_clientRegionDTO  -Id null `
 -Name null `
 -Type null `
 -Parent null `
 -Children null
```

- Convert the resource to JSON
```powershell
$RegionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

