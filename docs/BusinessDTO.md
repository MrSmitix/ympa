# BusinessDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор кабинета. | [optional] 
**Name** | **String** | Название бизнеса. | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessDTO = Initialize-ympa_powershell_clientBusinessDTO  -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$BusinessDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

