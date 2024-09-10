
# GenerateStocksOnWarehousesReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long** | Идентификатор магазина. |  |
| **warehouseIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). |  [optional] |
| **reportDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. |  [optional] |
| **categoryIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Фильтр по категориям на Маркете (кроме модели FBY). |  [optional] |
| **hasStocks** | **kotlin.Boolean** | Фильтр по наличию остатков (кроме модели FBY). |  [optional] |



