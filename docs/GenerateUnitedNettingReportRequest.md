

# GenerateUnitedNettingReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessId** | **Long** | Идентификатор бизнеса. |  |
|**dateTimeFrom** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional] |
|**dateTimeTo** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional] |
|**dateFrom** | **Date** | Начало периода, включительно. |  [optional] |
|**dateTo** | **Date** | Конец периода, включительно. Максимальный период — 1 год. |  [optional] |
|**bankOrderId** | **Long** | Номер платежного поручения. |  [optional] |
|**bankOrderDateTime** | **Date** | Дата платежного поручения. |  [optional] |
|**placementPrograms** | **List&lt;PlacementType&gt;** | Список моделей, которые нужны в отчете.  |  [optional] |
|**inns** | **List&lt;String&gt;** | Список ИНН, которые нужны в отчете. |  [optional] |
|**campaignIds** | **List&lt;Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional] |



