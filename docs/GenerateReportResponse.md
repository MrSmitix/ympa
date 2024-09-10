# GenerateReportResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GenerateReportDTO**](GenerateReportDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateReportResponse = Initialize-ympa_powershell_clientGenerateReportResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GenerateReportResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

