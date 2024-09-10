# openapi.model.GeneratePricesReportRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **int** | Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  | [optional] 
**campaignId** | **int** | Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  | [optional] 
**categoryIds** | **List<int>** | Фильтр по категориям на Маркете. | [optional] [default to const []]
**creationDateFrom** | [**DateTime**](DateTime.md) | Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 
**creationDateTo** | [**DateTime**](DateTime.md) | Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


