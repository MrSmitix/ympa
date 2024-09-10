# ympa_csharp_client.Model.ReportInfoDTO
Статус генерации и ссылка на готовый отчет.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **ReportStatusType** |  | 
**SubStatus** | **ReportSubStatusType** |  | [optional] 
**GenerationRequestedAt** | **DateTime** | Дата и время запроса на генерацию. | 
**GenerationFinishedAt** | **DateTime** | Дата и время завершения генерации. | [optional] 
**File** | **string** | Ссылка на готовый отчет. | [optional] 
**EstimatedGenerationTime** | **long** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

