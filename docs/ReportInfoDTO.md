

# ReportInfoDTO

Статус генерации и ссылка на готовый отчет.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **ReportStatusType** |  | 
**subStatus** | **ReportSubStatusType** |  |  [optional]
**generationRequestedAt** | **OffsetDateTime** | Дата и время запроса на генерацию. | 
**generationFinishedAt** | **OffsetDateTime** | Дата и время завершения генерации. |  [optional]
**file** | **String** | Ссылка на готовый отчет. |  [optional]
**estimatedGenerationTime** | **Long** | Ожидаемая продолжительность генерации в миллисекундах. |  [optional]



