# OpenapiClient::GetOrdersResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] |
| **orders** | [**Array&lt;OrderDTO&gt;**](OrderDTO.md) | Модель заказа.  |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOrdersResponse.new(
  pager: null,
  orders: null,
  paging: null
)
```

