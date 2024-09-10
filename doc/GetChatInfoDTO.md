# openapi.model.GetChatInfoDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatId** | **int** | Идентификатор чата. | 
**orderId** | **int** | Идентификатор заказа. | 
**type** | [**ChatType**](ChatType.md) |  | 
**status** | [**ChatStatusType**](ChatStatusType.md) |  | 
**createdAt** | [**DateTime**](DateTime.md) | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | 
**updatedAt** | [**DateTime**](DateTime.md) | Дата и время последнего сообщения в чате. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


