

# ReportInfoDTO

Статус генерации и ссылка на готовый отчет.

The class is defined in **[ReportInfoDTO.java](../../src/main/java/org/openapitools/model/ReportInfoDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | `ReportStatusType` |  | 
**subStatus** | `ReportSubStatusType` |  |  [optional property]
**generationRequestedAt** | `OffsetDateTime` | Дата и время запроса на генерацию. | 
**generationFinishedAt** | `OffsetDateTime` | Дата и время завершения генерации. |  [optional property]
**_file** | `String` | Ссылка на готовый отчет. |  [optional property]
**estimatedGenerationTime** | `Long` | Ожидаемая продолжительность генерации в миллисекундах. |  [optional property]








