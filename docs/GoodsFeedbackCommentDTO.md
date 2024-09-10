# ympa_r_client::GoodsFeedbackCommentDTO

Комментарий к отзыву.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор комментария к отзыву.  | 
**text** | **character** | Текст комментария. | [Max. length: 4096] [Min. length: 1] 
**canModify** | **character** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**parentId** | **integer** | Идентификатор комментария к отзыву.  | [optional] 
**author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | [Enum: ] 


