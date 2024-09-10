# openapi.model.OrdersStatsDetailsDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemStatus** | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] 
**itemCount** | **int** | Количество товара со статусом, указанном в параметре `itemStatus`. | [optional] 
**updateDate** | [**DateTime**](DateTime.md) | Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] 
**stockType** | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


