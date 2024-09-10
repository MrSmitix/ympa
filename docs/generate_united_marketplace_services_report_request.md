# generate_united_marketplace_services_report_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **long** | Идентификатор бизнеса. | 
**date_time_from** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**date_time_to** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**date_from** | **char \*** | Начало периода, включительно. | [optional] 
**date_to** | **char \*** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**year_from** | **int** | Начальный год формирования акта. | [optional] 
**month_from** | **int** | Начальный номер месяца формирования акта. | [optional] 
**year_to** | **int** | Конечный год формирования акта. | [optional] 
**month_to** | **int** | Конечный номер месяца формирования акта. | [optional] 
**placement_programs** | [**list_t**](placement_type.md) \* | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **list_t \*** | Список ИНН, которые нужны в отчете. | [optional] 
**campaign_ids** | **list_t \*** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


