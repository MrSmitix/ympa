

# GeneratePricesReportRequest

Данные, необходимые для генерации отчета.

The class is defined in **[GeneratePricesReportRequest.java](../../src/main/java/org/openapitools/model/GeneratePricesReportRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  |  [optional property]
**campaignId** | `Long` | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  |  [optional property]
**categoryIds** | `List&lt;Long&gt;` | Фильтр по категориям на Маркете. |  [optional property]
**creationDateFrom** | `LocalDate` | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]
**creationDateTo** | `LocalDate` | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]







