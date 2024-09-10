# openapi.model.FeedIndexLogsRecordDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadTime** | [**DateTime**](DateTime.md) | Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] 
**fileTime** | [**DateTime**](DateTime.md) | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] 
**generationId** | **int** | Идентификатор индексации. | [optional] 
**indexType** | [**FeedIndexLogsIndexType**](FeedIndexLogsIndexType.md) |  | [optional] 
**publishedTime** | [**DateTime**](DateTime.md) | Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  | [optional] 
**status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) |  | [optional] 
**error** | [**FeedIndexLogsErrorDTO**](FeedIndexLogsErrorDTO.md) |  | [optional] 
**offers** | [**FeedIndexLogsOffersDTO**](FeedIndexLogsOffersDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


