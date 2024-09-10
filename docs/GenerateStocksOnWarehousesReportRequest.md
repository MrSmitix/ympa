# GenerateStocksOnWarehousesReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор магазина. | 
**WarehouseIds** | **Int64[]** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] 
**ReportDate** | **System.DateTime** | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**CategoryIds** | **Int64[]** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] 
**HasStocks** | **Boolean** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateStocksOnWarehousesReportRequest = Initialize-ympa_powershell_clientGenerateStocksOnWarehousesReportRequest  -CampaignId null `
 -WarehouseIds null `
 -ReportDate null `
 -CategoryIds null `
 -HasStocks null
```

- Convert the resource to JSON
```powershell
$GenerateStocksOnWarehousesReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

