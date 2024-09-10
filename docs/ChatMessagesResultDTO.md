# OpenapiClient::ChatMessagesResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **messages** | [**Array&lt;ChatMessageDTO&gt;**](ChatMessageDTO.md) | Информация о сообщениях. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ChatMessagesResultDTO.new(
  order_id: null,
  messages: null,
  paging: null
)
```

