# GenerateStocksOnWarehousesReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **i64** | Идентификатор магазина. | 
**warehouse_ids** | **Vec<i64>** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] [default to None]
**report_date** | [***chrono::naive::NaiveDate**](date.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] [default to None]
**category_ids** | **Vec<i64>** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] [default to None]
**has_stocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


