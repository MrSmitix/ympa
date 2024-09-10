# openapi.model.GenerateUnitedNettingReportRequest

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **int** | Идентификатор бизнеса. | 
**dateTimeFrom** | [**DateTime**](DateTime.md) | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  | [optional] 
**dateTimeTo** | [**DateTime**](DateTime.md) | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  | [optional] 
**dateFrom** | [**DateTime**](DateTime.md) | Начало периода, включительно. | [optional] 
**dateTo** | [**DateTime**](DateTime.md) | Конец периода, включительно. Максимальный период — 1 год. | [optional] 
**bankOrderId** | **int** | Номер платежного поручения. | [optional] 
**bankOrderDateTime** | [**DateTime**](DateTime.md) | Дата платежного поручения. | [optional] 
**placementPrograms** | [**List<PlacementType>**](PlacementType.md) | Список моделей, которые нужны в отчете.  | [optional] [default to const []]
**inns** | **List<String>** | Список ИНН, которые нужны в отчете. | [optional] [default to const []]
**campaignIds** | **List<int>** | Список магазинов, которые нужны в отчете. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


