# ympa_r_client::GenerateUnitedNettingReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **integer** | Идентификатор бизнеса. | 
**dateTimeFrom** | **character** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**dateTimeTo** | **character** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**dateFrom** | **character** | Начало периода, включительно. | [optional] 
**dateTo** | **character** | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bankOrderId** | **integer** | Номер платежного поручения. | [optional] 
**bankOrderDateTime** | **character** | Дата платежного поручения. | [optional] 
**placementPrograms** | [**array[PlacementType]**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] 
**inns** | **array[character]** | Список ИНН, которые нужны в отчете. | [optional] 
**campaignIds** | **array[integer]** | Список магазинов, которые нужны в отчете. | [optional] 


