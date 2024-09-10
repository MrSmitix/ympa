# OpenapiClient::GeneratePricesReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.  | [optional] |
| **campaign_id** | **Integer** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.  | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете. | [optional] |
| **creation_date_from** | **Date** | Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |
| **creation_date_to** | **Date** | Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GeneratePricesReportRequest.new(
  business_id: null,
  campaign_id: null,
  category_ids: null,
  creation_date_from: null,
  creation_date_to: null
)
```

