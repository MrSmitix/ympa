# ReportInfoDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [***ReportStatusType**](ReportStatusType.md) |  | [default to nothing]
**subStatus** | [***ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] [default to nothing]
**generationRequestedAt** | **ZonedDateTime** | Дата и время запроса на генерацию. | [default to nothing]
**generationFinishedAt** | **ZonedDateTime** | Дата и время завершения генерации. | [optional] [default to nothing]
**file** | **String** | Ссылка на готовый отчет. | [optional] [default to nothing]
**estimatedGenerationTime** | **Int64** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


