# OpenapiClient::GetChatsRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_ids** | **Array&lt;Integer&gt;** | Фильтр по идентификаторам заказов на Маркете. | [optional] |
| **types** | [**Array&lt;ChatType&gt;**](ChatType.md) | Фильтр по типам чатов. | [optional] |
| **statuses** | [**Array&lt;ChatStatusType&gt;**](ChatStatusType.md) | Фильтр по статусам чатов. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetChatsRequest.new(
  order_ids: null,
  types: null,
  statuses: null
)
```

