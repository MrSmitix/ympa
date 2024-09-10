# OpenapiClient::GetChatInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **type** | [**ChatType**](ChatType.md) |  |  |
| **status** | [**ChatStatusType**](ChatStatusType.md) |  |  |
| **created_at** | **Time** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  |
| **updated_at** | **Time** | Дата и время последнего сообщения в чате. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetChatInfoDTO.new(
  chat_id: null,
  order_id: null,
  type: null,
  status: null,
  created_at: null,
  updated_at: null
)
```

