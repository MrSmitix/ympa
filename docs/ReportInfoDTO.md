# ympa_r_client::ReportInfoDTO

Статус генерации и ссылка на готовый отчет.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ReportStatusType**](ReportStatusType.md) |  | [Enum: ] 
**subStatus** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] [Enum: ] 
**generationRequestedAt** | **character** | Дата и время запроса на генерацию. | 
**generationFinishedAt** | **character** | Дата и время завершения генерации. | [optional] 
**file** | **character** | Ссылка на готовый отчет. | [optional] 
**estimatedGenerationTime** | **integer** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 


