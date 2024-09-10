# openapi.model.OrderDeliveryDatesDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 
**toDate** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 
**fromTime** | **String** | Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`.  | [optional] 
**toTime** | **String** | Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`.  | [optional] 
**realDeliveryDate** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


