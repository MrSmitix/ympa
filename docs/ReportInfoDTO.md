
# ReportInfoDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**ReportStatusType**](ReportStatusType.md) |  |  |
| **generationRequestedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время запроса на генерацию. |  |
| **subStatus** | [**ReportSubStatusType**](ReportSubStatusType.md) |  |  [optional] |
| **generationFinishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время завершения генерации. |  [optional] |
| **file** | **kotlin.String** | Ссылка на готовый отчет. |  [optional] |
| **estimatedGenerationTime** | **kotlin.Long** | Ожидаемая продолжительность генерации в миллисекундах. |  [optional] |



