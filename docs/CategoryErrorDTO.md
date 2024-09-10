# CategoryErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **Int64** | Идентификатор категории. | [optional] 
**Type** | [**CategoryErrorType**](CategoryErrorType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CategoryErrorDTO = Initialize-ympa_powershell_clientCategoryErrorDTO  -CategoryId null `
 -Type null
```

- Convert the resource to JSON
```powershell
$CategoryErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

