
# Table `GeneratePricesReportRequest`
(mapped from: GeneratePricesReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long |  | **kotlin.Long** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  |  [optional]
**campaignId** | campaignId | long |  | **kotlin.Long** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Фильтр по категориям на Маркете. |  [optional]
**creationDateFrom** | creationDateFrom | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional]
**creationDateTo** | creationDateTo | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional]




# **Table `GeneratePricesReportRequestCategoryIds`**
(mapped from: GeneratePricesReportRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generatePricesReportRequest | generatePricesReportRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | long | | kotlin.Long | Foreign Key | *many*





