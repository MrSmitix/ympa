# OpenapiClient::OrderStateDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор заказа. |  |
| **status** | [**OrderStatusType**](OrderStatusType.md) |  |  |
| **substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderStateDTO.new(
  id: null,
  status: null,
  substatus: null
)
```

