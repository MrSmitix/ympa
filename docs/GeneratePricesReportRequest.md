
# GeneratePricesReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  |  [optional] |
| **campaignId** | **kotlin.Long** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  |  [optional] |
| **categoryIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Фильтр по категориям на Маркете. |  [optional] |
| **creationDateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional] |
| **creationDateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional] |



