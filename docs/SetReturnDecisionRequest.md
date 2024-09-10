# OpenapiClient::SetReturnDecisionRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **return_item_id** | **Integer** | Идентификатор товара в возврате. |  |
| **decision_type** | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  |  |
| **comment** | **String** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SetReturnDecisionRequest.new(
  return_item_id: null,
  decision_type: null,
  comment: null
)
```

