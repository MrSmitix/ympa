# generate_united_netting_report_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **long** | Идентификатор бизнеса. | 
**date_time_from** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**date_time_to** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**date_from** | **char \*** | Начало периода, включительно. | [optional] 
**date_to** | **char \*** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bank_order_id** | **long** | Номер платежного поручения. | [optional] 
**bank_order_date_time** | **char \*** | Дата платежного поручения. | [optional] 
**placement_programs** | [**list_t**](placement_type.md) \* | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **list_t \*** | Список ИНН, которые нужны в отчете. | [optional] 
**campaign_ids** | **list_t \*** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


