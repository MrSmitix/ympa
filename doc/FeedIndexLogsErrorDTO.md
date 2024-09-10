# openapi.model.FeedIndexLogsErrorDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**httpStatusCode** | **int** | HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  | [optional] 
**type** | [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] 
**description** | **String** | Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


