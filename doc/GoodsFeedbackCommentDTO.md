# openapi.model.GoodsFeedbackCommentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор комментария к отзыву.  | 
**text** | **String** | Текст комментария. | 
**canModify** | **bool** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**parentId** | **int** | Идентификатор комментария к отзыву.  | [optional] 
**author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


