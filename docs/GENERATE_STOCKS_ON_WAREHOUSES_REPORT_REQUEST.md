# GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **INTEGER_64** | Идентификатор магазина. | [default to null]
**warehouse_ids** | **LIST [INTEGER_64]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] [default to null]
**report_date** | [**DATE**](DATE.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] [default to null]
**category_ids** | **LIST [INTEGER_64]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] [default to null]
**has_stocks** | **BOOLEAN** | Фильтр по наличию остатков (кроме модели FBY). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


