# WWW::OpenAPIClient::Object::GenerateStocksOnWarehousesReportRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenerateStocksOnWarehousesReportRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор магазина. | 
**warehouse_ids** | **ARRAY[int]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**report_date** | **DATE** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**category_ids** | **ARRAY[int]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**has_stocks** | **boolean** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


