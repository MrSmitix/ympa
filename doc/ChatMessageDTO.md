# openapi.model.ChatMessageDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **int** | Идентификатор сообщения. | 
**createdAt** | [**DateTime**](DateTime.md) | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | 
**sender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  | [optional] 
**payload** | [**List<ChatMessagePayloadDTO>**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


