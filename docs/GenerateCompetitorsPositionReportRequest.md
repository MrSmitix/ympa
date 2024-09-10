# GenerateCompetitorsPositionReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса. | 
**CategoryId** | **Int64** | Идентификатор категории. | 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | 
**DateTo** | **System.DateTime** | Конец периода, включительно. | 

## Examples

- Prepare the resource
```powershell
$GenerateCompetitorsPositionReportRequest = Initialize-ympa_powershell_clientGenerateCompetitorsPositionReportRequest  -BusinessId null `
 -CategoryId null `
 -DateFrom null `
 -DateTo null
```

- Convert the resource to JSON
```powershell
$GenerateCompetitorsPositionReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

