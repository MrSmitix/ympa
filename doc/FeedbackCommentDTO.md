# openapi.model.FeedbackCommentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор ответа. | [optional] 
**parentId** | **int** | Идентификатор родительского ответа. | [optional] 
**body** | **String** | Текст ответа. | [optional] 
**createdAt** | [**DateTime**](DateTime.md) | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] 
**updatedAt** | [**DateTime**](DateTime.md) | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | [optional] 
**author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**List<FeedbackCommentDTO>**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


