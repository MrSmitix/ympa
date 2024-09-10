

# GenerateStocksOnWarehousesReportRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Long** | Идентификатор магазина. | 
**warehouseIds** | **Seq&lt;Long&gt;** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). |  [optional]
**reportDate** | **LocalDate** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. |  [optional]
**categoryIds** | **Seq&lt;Long&gt;** | Фильтр по категориям на Маркете (кроме модели FBY). |  [optional]
**hasStocks** | **Boolean** | Фильтр по наличию остатков (кроме модели FBY). |  [optional]


