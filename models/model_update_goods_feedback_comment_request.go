package models

// UpdateGoodsFeedbackCommentRequest - Комментарий к отзыву.
type UpdateGoodsFeedbackCommentRequest struct {

	// Идентификатор отзыва. 
	FeedbackId int64 `json:"feedbackId"`

	Comment UpdateGoodsFeedbackCommentDto `json:"comment"`
}
