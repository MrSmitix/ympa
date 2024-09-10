
# GenerateUnitedNettingReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long** | Идентификатор бизнеса. |  |
| **dateTimeFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional] |
| **dateTimeTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional] |
| **dateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. |  [optional] |
| **dateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. Максимальный период — 1 год. |  [optional] |
| **bankOrderId** | **kotlin.Long** | Номер платежного поручения. |  [optional] |
| **bankOrderDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата платежного поручения. |  [optional] |
| **placementPrograms** | [**kotlin.collections.List&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  |  [optional] |
| **inns** | **kotlin.collections.List&lt;kotlin.String&gt;** | Список ИНН, которые нужны в отчете. |  [optional] |
| **campaignIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional] |



