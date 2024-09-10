# openapi.model.FeedContentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffersCount** | **int** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  | [optional] 
**status** | [**FeedStatusType**](FeedStatusType.md) |  | [optional] 
**totalOffersCount** | **int** | Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  | [optional] 
**error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


