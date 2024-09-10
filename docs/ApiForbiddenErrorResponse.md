# ApiForbiddenErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Errors** | [**ApiErrorDTO[]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiForbiddenErrorResponse = Initialize-ympa_powershell_clientApiForbiddenErrorResponse  -Status null `
 -Errors null
```

- Convert the resource to JSON
```powershell
$ApiForbiddenErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

