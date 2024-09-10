

# GenerateUnitedNettingReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

The class is defined in **[GenerateUnitedNettingReportRequest.java](../../src/main/java/org/openapitools/model/GenerateUnitedNettingReportRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор бизнеса. | 
**dateTimeFrom** | `OffsetDateTime` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional property]
**dateTimeTo** | `OffsetDateTime` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional property]
**dateFrom** | `LocalDate` | Начало периода, включительно. |  [optional property]
**dateTo** | `LocalDate` | Конец периода, включительно. Максимальный период — 1 год. |  [optional property]
**bankOrderId** | `Long` | Номер платежного поручения. |  [optional property]
**bankOrderDateTime** | `OffsetDateTime` | Дата платежного поручения. |  [optional property]
**placementPrograms** | `List&lt;PlacementType&gt;` | Список моделей, которые нужны в отчете.  |  [optional property]
**inns** | `List&lt;String&gt;` | Список ИНН, которые нужны в отчете. |  [optional property]
**campaignIds** | `List&lt;Long&gt;` | Список магазинов, которые нужны в отчете. |  [optional property]












