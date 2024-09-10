# REPORT_INFO_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**REPORT_STATUS_TYPE**](ReportStatusType.md) |  | [default to null]
**sub_status** | [**REPORT_SUB_STATUS_TYPE**](ReportSubStatusType.md) |  | [optional] [default to null]
**generation_requested_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время запроса на генерацию. | [default to null]
**generation_finished_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время завершения генерации. | [optional] [default to null]
**file** | [**STRING_32**](STRING_32.md) | Ссылка на готовый отчет. | [optional] [default to null]
**estimated_generation_time** | **INTEGER_64** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


