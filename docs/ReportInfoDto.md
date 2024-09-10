# ReportInfoDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**models::ReportStatusType**](ReportStatusType.md) |  | 
**sub_status** | Option<[**models::ReportSubStatusType**](ReportSubStatusType.md)> |  | [optional]
**generation_requested_at** | **String** | Дата и время запроса на генерацию. | 
**generation_finished_at** | Option<**String**> | Дата и время завершения генерации. | [optional]
**file** | Option<**String**> | Ссылка на готовый отчет. | [optional]
**estimated_generation_time** | Option<**i64**> | Ожидаемая продолжительность генерации в миллисекундах. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


