# WWW::OpenAPIClient::Object::ReportInfoDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ReportInfoDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ReportStatusType**](ReportStatusType.md) |  | 
**sub_status** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**generation_requested_at** | **DATE_TIME** | Дата и время запроса на генерацию. | 
**generation_finished_at** | **DATE_TIME** | Дата и время завершения генерации. | [optional] 
**file** | **string** | Ссылка на готовый отчет. | [optional] 
**estimated_generation_time** | **int** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


