# OpenapiClient::GenerateCompetitorsPositionReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса. |  |
| **category_id** | **Integer** | Идентификатор категории. |  |
| **date_from** | **Date** | Начало периода, включительно. |  |
| **date_to** | **Date** | Конец периода, включительно. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateCompetitorsPositionReportRequest.new(
  business_id: null,
  category_id: null,
  date_from: null,
  date_to: null
)
```

