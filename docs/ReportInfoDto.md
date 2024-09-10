# ReportInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [***models::ReportStatusType**](ReportStatusType.md) |  | 
**sub_status** | [***models::ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] [default to None]
**generation_requested_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время запроса на генерацию. | 
**generation_finished_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время завершения генерации. | [optional] [default to None]
**file** | **String** | Ссылка на готовый отчет. | [optional] [default to None]
**estimated_generation_time** | **i64** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


