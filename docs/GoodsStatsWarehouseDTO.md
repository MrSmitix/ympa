# OpenapiClient::GoodsStatsWarehouseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор склада. | [optional] |
| **name** | **String** | Название склада. | [optional] |
| **stocks** | [**Array&lt;WarehouseStockDTO&gt;**](WarehouseStockDTO.md) | Информация об остатках товаров на складе. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsStatsWarehouseDTO.new(
  id: null,
  name: null,
  stocks: null
)
```

