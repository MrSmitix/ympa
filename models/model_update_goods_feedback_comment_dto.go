package models

// UpdateGoodsFeedbackCommentDto - Комментарий к отзыву или другому комментарию.
type UpdateGoodsFeedbackCommentDto struct {

	// Идентификатор комментария к отзыву. 
	Id int64 `json:"id,omitempty"`

	// Идентификатор комментария к отзыву. 
	ParentId int64 `json:"parentId,omitempty"`

	// Текст комментария.
	Text string `json:"text"`
}
