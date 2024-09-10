# OpenapiClient::GenerateUnitedMarketplaceServicesReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса. |  |
| **date_time_from** | **Time** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] |
| **date_time_to** | **Time** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] |
| **date_from** | **Date** | Начало периода, включительно. | [optional] |
| **date_to** | **Date** | Конец периода, включительно. Максимальный период — 1 год. | [optional] |
| **year_from** | **Integer** | Начальный год формирования акта. | [optional] |
| **month_from** | **Integer** | Начальный номер месяца формирования акта. | [optional] |
| **year_to** | **Integer** | Конечный год формирования акта. | [optional] |
| **month_to** | **Integer** | Конечный номер месяца формирования акта. | [optional] |
| **placement_programs** | [**Array&lt;PlacementType&gt;**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] |
| **inns** | **Array&lt;String&gt;** | Список ИНН, которые нужны в отчете. | [optional] |
| **campaign_ids** | **Array&lt;Integer&gt;** | Список магазинов, которые нужны в отчете. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateUnitedMarketplaceServicesReportRequest.new(
  business_id: null,
  date_time_from: null,
  date_time_to: null,
  date_from: null,
  date_to: null,
  year_from: null,
  month_from: null,
  year_to: null,
  month_to: null,
  placement_programs: null,
  inns: null,
  campaign_ids: null
)
```

