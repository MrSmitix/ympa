# ReportInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ReportStatusType**](ReportStatusType.md) |  | 
**SubStatus** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**GenerationRequestedAt** | **System.DateTime** | Дата и время запроса на генерацию. | 
**GenerationFinishedAt** | **System.DateTime** | Дата и время завершения генерации. | [optional] 
**File** | **String** | Ссылка на готовый отчет. | [optional] 
**EstimatedGenerationTime** | **Int64** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

## Examples

- Prepare the resource
```powershell
$ReportInfoDTO = Initialize-ympa_powershell_clientReportInfoDTO  -Status null `
 -SubStatus null `
 -GenerationRequestedAt null `
 -GenerationFinishedAt null `
 -File null `
 -EstimatedGenerationTime null
```

- Convert the resource to JSON
```powershell
$ReportInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

