# GenerateStocksOnWarehousesReportRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Int64** | Идентификатор магазина. | [default to nothing]
**warehouseIds** | **Vector{Int64}** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] [default to nothing]
**reportDate** | **Date** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] [default to nothing]
**categoryIds** | **Vector{Int64}** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] [default to nothing]
**hasStocks** | **Bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


