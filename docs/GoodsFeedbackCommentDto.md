# GoodsFeedbackCommentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор комментария к отзыву.  | 
**text** | **String** | Текст комментария. | 
**can_modify** | **bool** | Может ли продавец изменять комментарий или удалять его. | [optional] [default to None]
**parent_id** | **i64** | Идентификатор комментария к отзыву.  | [optional] [default to None]
**author** | [***models::GoodsFeedbackCommentAuthorDto**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [***models::GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


