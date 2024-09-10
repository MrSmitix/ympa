
# Table `ReportInfoDTO`
(mapped from: ReportInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long NOT NULL |  | [**ReportStatusType**](ReportStatusType.md) |  |  [foreignkey]
**generationRequestedAt** | generationRequestedAt | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время запроса на генерацию. | 
**subStatus** | subStatus | long |  | [**ReportSubStatusType**](ReportSubStatusType.md) |  |  [optional] [foreignkey]
**generationFinishedAt** | generationFinishedAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время завершения генерации. |  [optional]
**file** | file | text |  | **kotlin.String** | Ссылка на готовый отчет. |  [optional]
**estimatedGenerationTime** | estimatedGenerationTime | long |  | **kotlin.Long** | Ожидаемая продолжительность генерации в миллисекундах. |  [optional]








