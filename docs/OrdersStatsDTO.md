# OpenapiClient::OrdersStatsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **orders** | [**Array&lt;OrdersStatsOrderDTO&gt;**](OrdersStatsOrderDTO.md) | Список заказов. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsDTO.new(
  orders: null,
  paging: null
)
```

