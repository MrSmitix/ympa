# WWW::OpenAPIClient::Object::GenerateUnitedNettingReportRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenerateUnitedNettingReportRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_time_from** | **DATE_TIME** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**date_time_to** | **DATE_TIME** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**date_from** | **DATE** | Начало периода, включительно. | [optional] 
**date_to** | **DATE** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bank_order_id** | **int** | Номер платежного поручения. | [optional] 
**bank_order_date_time** | **DATE_TIME** | Дата платежного поручения. | [optional] 
**placement_programs** | [**ARRAY[PlacementType]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **ARRAY[string]** | Список ИНН, которые нужны в отчете. | [optional] 
**campaign_ids** | **ARRAY[int]** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


