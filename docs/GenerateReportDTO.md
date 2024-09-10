# GenerateReportDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportId** | **String** | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. | 
**EstimatedGenerationTime** | **Int64** | Ожидаемая продолжительность генерации в миллисекундах. | 

## Examples

- Prepare the resource
```powershell
$GenerateReportDTO = Initialize-ympa_powershell_clientGenerateReportDTO  -ReportId null `
 -EstimatedGenerationTime null
```

- Convert the resource to JSON
```powershell
$GenerateReportDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

