# OpenapiClient::OrderItemDetailDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_count** | **Integer** | Количество единиц товара. | [optional] |
| **item_status** | [**OrderItemStatusType**](OrderItemStatusType.md) |  | [optional] |
| **update_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderItemDetailDTO.new(
  item_count: null,
  item_status: null,
  update_date: 23-09-2022
)
```

