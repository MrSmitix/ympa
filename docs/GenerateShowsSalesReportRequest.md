# OpenapiClient::GenerateShowsSalesReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] |
| **campaign_id** | **Integer** | Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.  | [optional] |
| **date_from** | **Date** | Начало периода, включительно. |  |
| **date_to** | **Date** | Конец периода, включительно. |  |
| **grouping** | [**ShowsSalesGroupingType**](ShowsSalesGroupingType.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateShowsSalesReportRequest.new(
  business_id: null,
  campaign_id: null,
  date_from: null,
  date_to: null,
  grouping: null
)
```

