# OpenapiClient::GenerateShelfsStatisticsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса. |  |
| **date_from** | **Date** | Начало периода, включительно. |  |
| **date_to** | **Date** | Конец периода, включительно. |  |
| **attribution_type** | [**ShelfsStatisticsAttributionType**](ShelfsStatisticsAttributionType.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateShelfsStatisticsRequest.new(
  business_id: null,
  date_from: null,
  date_to: null,
  attribution_type: null
)
```

