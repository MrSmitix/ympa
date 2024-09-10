# GenerateStocksOnWarehousesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **int** | Идентификатор магазина. | 
**warehouseIds** | **int** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**reportDate** | [**\DateTime**](Date.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**categoryIds** | **int** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**hasStocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


