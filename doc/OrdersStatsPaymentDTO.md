# openapi.model.OrdersStatsPaymentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор денежного перевода. | [optional] 
**date** | [**DateTime**](DateTime.md) | Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] 
**type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**source_** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**total** | **num** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**paymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


