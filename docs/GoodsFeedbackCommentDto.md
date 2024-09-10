# GoodsFeedbackCommentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор комментария к отзыву.  | [default to null]
**text** | **String!** | Текст комментария. | [default to null]
**canModify** | **Boolean!** | Может ли продавец изменять комментарий или удалять его. | [optional] [default to null]
**parentId** | **Int!** | Идентификатор комментария к отзыву.  | [optional] [default to null]
**author** | [***GoodsFeedbackCommentAuthorDto**](GoodsFeedbackCommentAuthorDTO.md) |  | [default to null]
**status** | [***GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


