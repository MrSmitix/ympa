# OAIGenerateUnitedNettingReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **NSNumber*** | Идентификатор бизнеса. | 
**dateTimeFrom** | **NSDate*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**dateTimeTo** | **NSDate*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**dateFrom** | **NSDate*** | Начало периода, включительно. | [optional] 
**dateTo** | **NSDate*** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bankOrderId** | **NSNumber*** | Номер платежного поручения. | [optional] 
**bankOrderDateTime** | **NSDate*** | Дата платежного поручения. | [optional] 
**placementPrograms** | [**NSArray&lt;OAIPlacementType&gt;***](OAIPlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **NSArray&lt;NSString*&gt;*** | Список ИНН, которые нужны в отчете. | [optional] 
**campaignIds** | **NSArray&lt;NSNumber*&gt;*** | Список магазинов, которые нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


