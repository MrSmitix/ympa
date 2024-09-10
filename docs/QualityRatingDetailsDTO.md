# OpenapiClient::QualityRatingDetailsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **affected_orders** | [**Array&lt;QualityRatingAffectedOrderDTO&gt;**](QualityRatingAffectedOrderDTO.md) | Список заказов, которые повлияли на индекс качества. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::QualityRatingDetailsDTO.new(
  affected_orders: null
)
```

