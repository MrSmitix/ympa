

# GenerateUnitedNettingReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Long** | Идентификатор бизнеса. | 
**dateTimeFrom** | **OffsetDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional]
**dateTimeTo** | **OffsetDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional]
**dateFrom** | **LocalDate** | Начало периода, включительно. |  [optional]
**dateTo** | **LocalDate** | Конец периода, включительно. Максимальный период — 1 год. |  [optional]
**bankOrderId** | **Long** | Номер платежного поручения. |  [optional]
**bankOrderDateTime** | **OffsetDateTime** | Дата платежного поручения. |  [optional]
**placementPrograms** | **Seq&lt;PlacementType&gt;** | Список моделей, которые нужны в отчете.  |  [optional]
**inns** | **Seq&lt;String&gt;** | Список ИНН, которые нужны в отчете. |  [optional]
**campaignIds** | **Seq&lt;Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional]



