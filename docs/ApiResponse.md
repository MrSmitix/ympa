# ApiResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiResponse = Initialize-ympa_powershell_clientApiResponse  -Status null
```

- Convert the resource to JSON
```powershell
$ApiResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

