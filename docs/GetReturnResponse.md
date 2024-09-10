# GetReturnResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**ReturnDTO**](ReturnDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetReturnResponse = Initialize-ympa_powershell_clientGetReturnResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetReturnResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

