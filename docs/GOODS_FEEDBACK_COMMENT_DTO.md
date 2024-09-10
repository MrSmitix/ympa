# GOODS_FEEDBACK_COMMENT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор комментария к отзыву.  | [default to null]
**text** | [**STRING_32**](STRING_32.md) | Текст комментария. | [default to null]
**can_modify** | **BOOLEAN** | Может ли продавец изменять комментарий или удалять его. | [optional] [default to null]
**parent_id** | **INTEGER_64** | Идентификатор комментария к отзыву.  | [optional] [default to null]
**author** | [**GOODS_FEEDBACK_COMMENT_AUTHOR_DTO**](GoodsFeedbackCommentAuthorDTO.md) |  | [default to null]
**status** | [**GOODS_FEEDBACK_COMMENT_STATUS_TYPE**](GoodsFeedbackCommentStatusType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


