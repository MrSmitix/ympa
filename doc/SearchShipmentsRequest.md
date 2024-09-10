# openapi.model.SearchShipmentsRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | [**DateTime**](DateTime.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**dateTo** | [**DateTime**](DateTime.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**statuses** | [**Set<ShipmentStatusType>**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [default to const {}]
**orderIds** | **Set<int>** | Список идентификаторов заказов из отгрузок. | [optional] [default to const {}]
**cancelledOrders** | **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


