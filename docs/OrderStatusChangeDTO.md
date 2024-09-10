# OpenapiClient::OrderStatusChangeDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**OrderStatusType**](OrderStatusType.md) |  |  |
| **substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] |
| **delivery** | [**OrderStatusChangeDeliveryDTO**](OrderStatusChangeDeliveryDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderStatusChangeDTO.new(
  status: null,
  substatus: null,
  delivery: null
)
```

