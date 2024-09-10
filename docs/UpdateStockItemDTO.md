# OpenapiClient::UpdateStockItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **count** | **Integer** | Количество доступного товара.  |  |
| **updated_at** | **Time** | Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateStockItemDTO.new(
  count: null,
  updated_at: null
)
```

