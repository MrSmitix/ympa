# GetCategoryContentParametersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**CategoryContentParametersDTO**](CategoryContentParametersDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetCategoryContentParametersResponse = Initialize-ympa_powershell_clientGetCategoryContentParametersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetCategoryContentParametersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

