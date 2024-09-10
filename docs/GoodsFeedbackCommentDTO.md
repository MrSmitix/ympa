
# Table `GoodsFeedbackCommentDTO`
(mapped from: GoodsFeedbackCommentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор комментария к отзыву.  | 
**text** | text | text NOT NULL |  | **kotlin.String** | Текст комментария. | 
**author** | author | long NOT NULL |  | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  |  [foreignkey]
**canModify** | canModify | boolean |  | **kotlin.Boolean** | Может ли продавец изменять комментарий или удалять его. |  [optional]
**parentId** | parentId | long |  | **kotlin.Long** | Идентификатор комментария к отзыву.  |  [optional]








