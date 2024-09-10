# GetReturnsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**PagedReturnsDTO**](PagedReturnsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetReturnsResponse = Initialize-ympa_powershell_clientGetReturnsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetReturnsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

