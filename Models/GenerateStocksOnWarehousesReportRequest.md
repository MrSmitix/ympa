# GenerateStocksOnWarehousesReportRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **campaignId** | **Long** | Идентификатор магазина. | [default to null] |
| **warehouseIds** | **List** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] [default to null] |
| **reportDate** | **date** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] [default to null] |
| **categoryIds** | **List** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] [default to null] |
| **hasStocks** | **Boolean** | Фильтр по наличию остатков (кроме модели FBY). | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

