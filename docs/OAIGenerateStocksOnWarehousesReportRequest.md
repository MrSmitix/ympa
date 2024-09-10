# OAIGenerateStocksOnWarehousesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **NSNumber*** | Идентификатор магазина. | 
**warehouseIds** | **NSArray&lt;NSNumber*&gt;*** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**reportDate** | **NSDate*** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**categoryIds** | **NSArray&lt;NSNumber*&gt;*** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**hasStocks** | **NSNumber*** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


