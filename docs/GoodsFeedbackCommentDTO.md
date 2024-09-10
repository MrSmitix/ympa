# WWW::OpenAPIClient::Object::GoodsFeedbackCommentDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GoodsFeedbackCommentDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор комментария к отзыву.  | 
**text** | **string** | Текст комментария. | 
**can_modify** | **boolean** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**parent_id** | **int** | Идентификатор комментария к отзыву.  | [optional] 
**author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


