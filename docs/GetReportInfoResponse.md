# GetReportInfoResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**ReportInfoDTO**](ReportInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetReportInfoResponse = Initialize-ympa_powershell_clientGetReportInfoResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetReportInfoResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

