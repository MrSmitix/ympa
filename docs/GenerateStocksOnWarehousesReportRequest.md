# OpenapiClient::GenerateStocksOnWarehousesReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор магазина. |  |
| **warehouse_ids** | **Array&lt;Integer&gt;** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] |
| **report_date** | **Date** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] |
| **category_ids** | **Array&lt;Integer&gt;** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] |
| **has_stocks** | **Boolean** | Фильтр по наличию остатков (кроме модели FBY). | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateStocksOnWarehousesReportRequest.new(
  campaign_id: null,
  warehouse_ids: null,
  report_date: null,
  category_ids: null,
  has_stocks: null
)
```

