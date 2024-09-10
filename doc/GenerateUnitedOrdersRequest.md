# openapi.model.GenerateUnitedOrdersRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **int** | Идентификатор бизнеса. | 
**dateFrom** | [**DateTime**](DateTime.md) | Начало периода, включительно. | 
**dateTo** | [**DateTime**](DateTime.md) | Конец периода, включительно. Максимальный период — 1 год. | 
**campaignIds** | **List<int>** | Список магазинов, которые нужны в отчете. | [optional] [default to const []]
**promoId** | **String** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


