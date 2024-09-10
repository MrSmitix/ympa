# ApiLockedErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Errors** | [**ApiErrorDTO[]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiLockedErrorResponse = Initialize-ympa_powershell_clientApiLockedErrorResponse  -Status null `
 -Errors null
```

- Convert the resource to JSON
```powershell
$ApiLockedErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

