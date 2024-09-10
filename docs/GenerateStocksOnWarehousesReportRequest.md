# GenerateStocksOnWarehousesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **i64** | Идентификатор магазина. | 
**warehouse_ids** | Option<**Vec<i64>**> | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional]
**report_date** | Option<[**String**](string.md)> | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional]
**category_ids** | Option<**Vec<i64>**> | Фильтр по категориям на Маркете (кроме модели FBY). | [optional]
**has_stocks** | Option<**bool**> | Фильтр по наличию остатков (кроме модели FBY). | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


