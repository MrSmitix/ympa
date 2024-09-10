# ReportInfoDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | [**ReportStatusType**](ReportStatusType.md) |  | [default to null] |
| **subStatus** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] [default to null] |
| **generationRequestedAt** | **Date** | Дата и время запроса на генерацию. | [default to null] |
| **generationFinishedAt** | **Date** | Дата и время завершения генерации. | [optional] [default to null] |
| **file** | **String** | Ссылка на готовый отчет. | [optional] [default to null] |
| **estimatedGenerationTime** | **Long** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

