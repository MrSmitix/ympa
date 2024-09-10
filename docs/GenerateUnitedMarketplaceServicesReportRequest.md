# GenerateUnitedMarketplaceServicesReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса. | 
**DateTimeFrom** | **System.DateTime** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**DateTimeTo** | **System.DateTime** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | [optional] 
**DateTo** | **System.DateTime** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**YearFrom** | **Int32** | Начальный год формирования акта. | [optional] 
**MonthFrom** | **Int32** | Начальный номер месяца формирования акта. | [optional] 
**YearTo** | **Int32** | Конечный год формирования акта. | [optional] 
**MonthTo** | **Int32** | Конечный номер месяца формирования акта. | [optional] 
**PlacementPrograms** | [**PlacementType[]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**Inns** | **String[]** | Список ИНН, которые нужны в отчете. | [optional] 
**CampaignIds** | **Int64[]** | Список магазинов, которые нужны в отчете. | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateUnitedMarketplaceServicesReportRequest = Initialize-ympa_powershell_clientGenerateUnitedMarketplaceServicesReportRequest  -BusinessId null `
 -DateTimeFrom null `
 -DateTimeTo null `
 -DateFrom null `
 -DateTo null `
 -YearFrom null `
 -MonthFrom null `
 -YearTo null `
 -MonthTo null `
 -PlacementPrograms null `
 -Inns null `
 -CampaignIds null
```

- Convert the resource to JSON
```powershell
$GenerateUnitedMarketplaceServicesReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

