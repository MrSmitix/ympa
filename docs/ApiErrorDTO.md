# ApiErrorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **String** | Код ошибки. | 
**Message** | **String** | Описание ошибки. | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiErrorDTO = Initialize-ympa_powershell_clientApiErrorDTO  -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$ApiErrorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

