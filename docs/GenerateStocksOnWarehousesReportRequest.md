# Api.GenerateStocksOnWarehousesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Number** | Идентификатор магазина. | 
**warehouseIds** | **[Number]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**reportDate** | **Date** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**categoryIds** | **[Number]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**hasStocks** | **Boolean** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 


