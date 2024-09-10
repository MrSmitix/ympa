# generate_stocks_on_warehouses_report_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **long** | Идентификатор магазина. | 
**warehouse_ids** | **list_t \*** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**report_date** | **char \*** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**category_ids** | **list_t \*** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**has_stocks** | **int** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


