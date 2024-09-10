# ReportInfoDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**OpenAPI\Server\Model\ReportStatusType**](ReportStatusType.md) |  | 
**subStatus** | [**OpenAPI\Server\Model\ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**generationRequestedAt** | **\DateTime** | Дата и время запроса на генерацию. | 
**generationFinishedAt** | **\DateTime** | Дата и время завершения генерации. | [optional] 
**file** | **string** | Ссылка на готовый отчет. | [optional] 
**estimatedGenerationTime** | **int** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


