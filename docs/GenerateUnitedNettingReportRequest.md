# GenerateUnitedNettingReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Int64** | Идентификатор бизнеса. | 
**dateTimeFrom** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**dateTimeTo** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**dateFrom** | **Date** | Начало периода, включительно. | [optional] 
**dateTo** | **Date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bankOrderId** | **Int64** | Номер платежного поручения. | [optional] 
**bankOrderDateTime** | **Date** | Дата платежного поручения. | [optional] 
**placementPrograms** | [PlacementType] | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **[String]** | Список ИНН, которые нужны в отчете. | [optional] 
**campaignIds** | **[Int64]** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


