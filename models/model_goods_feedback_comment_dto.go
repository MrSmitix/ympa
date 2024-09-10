package models

// GoodsFeedbackCommentDto - Комментарий к отзыву.
type GoodsFeedbackCommentDto struct {

	// Идентификатор комментария к отзыву. 
	Id int64 `json:"id"`

	// Текст комментария.
	Text string `json:"text"`

	// Может ли продавец изменять комментарий или удалять его.
	CanModify bool `json:"canModify,omitempty"`

	// Идентификатор комментария к отзыву. 
	ParentId int64 `json:"parentId,omitempty"`

	Author GoodsFeedbackCommentAuthorDto `json:"author"`

	Status GoodsFeedbackCommentStatusType `json:"status"`
}
