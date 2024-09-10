# # GenerateStocksOnWarehousesReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор магазина. |
**warehouse_ids** | **int[]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional]
**report_date** | **\DateTime** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional]
**category_ids** | **int[]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional]
**has_stocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
