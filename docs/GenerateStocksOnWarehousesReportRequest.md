# ympa_r_client::GenerateStocksOnWarehousesReportRequest

Данные, необходимые для генерации отчета. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **integer** | Идентификатор магазина. | 
**warehouseIds** | **array[integer]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**reportDate** | **character** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**categoryIds** | **array[integer]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**hasStocks** | **character** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 


