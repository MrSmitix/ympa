# openapi.model.ReportInfoDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ReportStatusType**](ReportStatusType.md) |  | 
**subStatus** | [**ReportSubStatusType**](ReportSubStatusType.md) |  | [optional] 
**generationRequestedAt** | [**DateTime**](DateTime.md) | Дата и время запроса на генерацию. | 
**generationFinishedAt** | [**DateTime**](DateTime.md) | Дата и время завершения генерации. | [optional] 
**file** | **String** | Ссылка на готовый отчет. | [optional] 
**estimatedGenerationTime** | **int** | Ожидаемая продолжительность генерации в миллисекундах. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


