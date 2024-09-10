# Api.GenerateUnitedNettingReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Number** | Идентификатор бизнеса. | 
**dateTimeFrom** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**dateTimeTo** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**dateFrom** | **Date** | Начало периода, включительно. | [optional] 
**dateTo** | **Date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bankOrderId** | **Number** | Номер платежного поручения. | [optional] 
**bankOrderDateTime** | **Date** | Дата платежного поручения. | [optional] 
**placementPrograms** | [**[PlacementType]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **[String]** | Список ИНН, которые нужны в отчете. | [optional] 
**campaignIds** | **[Number]** | Список магазинов, которые нужны в отчете. | [optional] 


