
# Table `GenerateStocksOnWarehousesReportRequest`
(mapped from: GenerateStocksOnWarehousesReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaignId | long NOT NULL |  | **kotlin.Long** | Идентификатор магазина. | 
**warehouseIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). |  [optional]
**reportDate** | reportDate | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. |  [optional]
**categoryIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Фильтр по категориям на Маркете (кроме модели FBY). |  [optional]
**hasStocks** | hasStocks | boolean |  | **kotlin.Boolean** | Фильтр по наличию остатков (кроме модели FBY). |  [optional]



# **Table `GenerateStocksOnWarehousesReportRequestWarehouseIds`**
(mapped from: GenerateStocksOnWarehousesReportRequestWarehouseIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateStocksOnWarehousesReportRequest | generateStocksOnWarehousesReportRequest | long | | kotlin.Long | Primary Key | *one*
warehouseIds | warehouseIds | long | | kotlin.Long | Foreign Key | *many*




# **Table `GenerateStocksOnWarehousesReportRequestCategoryIds`**
(mapped from: GenerateStocksOnWarehousesReportRequestCategoryIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateStocksOnWarehousesReportRequest | generateStocksOnWarehousesReportRequest | long | | kotlin.Long | Primary Key | *one*
categoryIds | categoryIds | long | | kotlin.Long | Foreign Key | *many*




