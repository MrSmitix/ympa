# openapi.model.GenerateStocksOnWarehousesReportRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **int** | Идентификатор магазина. | 
**warehouseIds** | **List<int>** | Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). | [optional] [default to const []]
**reportDate** | [**DateTime**](DateTime.md) | Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. | [optional] 
**categoryIds** | **List<int>** | Фильтр по категориям на Маркете (кроме модели FBY). | [optional] [default to const []]
**hasStocks** | **bool** | Фильтр по наличию остатков (кроме модели FBY). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


