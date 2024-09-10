

# GenerateUnitedMarketplaceServicesReportRequest

Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessId** | **Long** | Идентификатор бизнеса. |  |
|**dateTimeFrom** | **OffsetDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  |  [optional] |
|**dateTimeTo** | **OffsetDateTime** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  |  [optional] |
|**dateFrom** | **LocalDate** | Начало периода, включительно. |  [optional] |
|**dateTo** | **LocalDate** | Конец периода, включительно. Максимальный период — 1 год. |  [optional] |
|**yearFrom** | **Integer** | Начальный год формирования акта. |  [optional] |
|**monthFrom** | **Integer** | Начальный номер месяца формирования акта. |  [optional] |
|**yearTo** | **Integer** | Конечный год формирования акта. |  [optional] |
|**monthTo** | **Integer** | Конечный номер месяца формирования акта. |  [optional] |
|**placementPrograms** | **List&lt;PlacementType&gt;** | Список моделей, которые нужны в отчете.  |  [optional] |
|**inns** | **List&lt;String&gt;** | Список ИНН, которые нужны в отчете. |  [optional] |
|**campaignIds** | **List&lt;Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional] |



