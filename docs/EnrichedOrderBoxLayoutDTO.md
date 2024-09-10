# OpenapiClient::EnrichedOrderBoxLayoutDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;OrderBoxLayoutItemDTO&gt;**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  |  |
| **box_id** | **Integer** | Идентификатор коробки. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::EnrichedOrderBoxLayoutDTO.new(
  items: null,
  box_id: null
)
```

