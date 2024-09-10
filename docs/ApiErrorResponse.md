# ApiErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Errors** | [**ApiErrorDTO[]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiErrorResponse = Initialize-ympa_powershell_clientApiErrorResponse  -Status null `
 -Errors null
```

- Convert the resource to JSON
```powershell
$ApiErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

