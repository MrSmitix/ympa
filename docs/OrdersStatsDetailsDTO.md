# OpenapiClient::OrdersStatsDetailsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_status** | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] |
| **item_count** | **Integer** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. | [optional] |
| **update_date** | **Date** | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **stock_type** | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsDetailsDTO.new(
  item_status: null,
  item_count: null,
  update_date: null,
  stock_type: null
)
```

