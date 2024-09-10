# ympa_csharp_client.Model.GenerateStocksOnWarehousesReportRequest
Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **long** | Идентификатор магазина. | 
**WarehouseIds** | **List&lt;long&gt;** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**ReportDate** | **DateOnly** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**CategoryIds** | **List&lt;long&gt;** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**HasStocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

