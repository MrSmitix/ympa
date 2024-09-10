# CategoryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор категории. | 
**Name** | **String** | Название категории. | 
**Children** | [**CategoryDTO[]**](CategoryDTO.md) | Дочерние категории. | [optional] 

## Examples

- Prepare the resource
```powershell
$CategoryDTO = Initialize-ympa_powershell_clientCategoryDTO  -Id null `
 -Name null `
 -Children null
```

- Convert the resource to JSON
```powershell
$CategoryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

