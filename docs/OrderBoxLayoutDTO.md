# OpenapiClient::OrderBoxLayoutDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;OrderBoxLayoutItemDTO&gt;**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderBoxLayoutDTO.new(
  items: null
)
```

