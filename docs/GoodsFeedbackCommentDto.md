# GoodsFeedbackCommentDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор комментария к отзыву.  | 
**text** | **String** | Текст комментария. | 
**can_modify** | Option<**bool**> | Может ли продавец изменять комментарий или удалять его. | [optional]
**parent_id** | Option<**i64**> | Идентификатор комментария к отзыву.  | [optional]
**author** | [**models::GoodsFeedbackCommentAuthorDto**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [**models::GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


