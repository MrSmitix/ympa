# OpenapiClient::SetOrderBoxLayoutRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **boxes** | [**Array&lt;OrderBoxLayoutDTO&gt;**](OrderBoxLayoutDTO.md) | Список коробок. |  |
| **allow_remove** | **Boolean** | Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа. | [optional][default to false] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SetOrderBoxLayoutRequest.new(
  boxes: null,
  allow_remove: null
)
```

