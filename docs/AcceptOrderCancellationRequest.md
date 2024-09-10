# OpenapiClient::AcceptOrderCancellationRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accepted** | **Boolean** | Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  |  |
| **reason** | [**OrderCancellationReasonType**](OrderCancellationReasonType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::AcceptOrderCancellationRequest.new(
  accepted: null,
  reason: null
)
```

