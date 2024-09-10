

# GenerateUnitedNettingReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Long** | Идентификатор бизнеса. | 
**dateTimeFrom** | [**Date**](Date.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional]
**dateTimeTo** | [**Date**](Date.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional]
**dateFrom** | [**Date**](Date.md) | Начало периода, включительно. |  [optional]
**dateTo** | [**Date**](Date.md) | Конец периода, включительно. Максимальный период — 1 год. |  [optional]
**bankOrderId** | **Long** | Номер платежного поручения. |  [optional]
**bankOrderDateTime** | [**Date**](Date.md) | Дата платежного поручения. |  [optional]
**placementPrograms** | [**List&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  |  [optional]
**inns** | **List&lt;String&gt;** | Список ИНН, которые нужны в отчете. |  [optional]
**campaignIds** | **List&lt;Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]




