

# ReportInfoDTO

Статус генерации и ссылка на готовый отчет.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **ReportStatusType** |  |  |
|**subStatus** | **ReportSubStatusType** |  |  [optional] |
|**generationRequestedAt** | **Date** | Дата и время запроса на генерацию. |  |
|**generationFinishedAt** | **Date** | Дата и время завершения генерации. |  [optional] |
|**_file** | **String** | Ссылка на готовый отчет. |  [optional] |
|**estimatedGenerationTime** | **Long** | Ожидаемая продолжительность генерации в миллисекундах. |  [optional] |



