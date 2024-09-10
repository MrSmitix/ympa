# EmptyApiResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$EmptyApiResponse = Initialize-ympa_powershell_clientEmptyApiResponse  -Status null
```

- Convert the resource to JSON
```powershell
$EmptyApiResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

