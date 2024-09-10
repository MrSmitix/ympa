package models

// GetGoodsFeedbackCommentsRequest - Фильтр запроса комментариев отзыва. 
type GetGoodsFeedbackCommentsRequest struct {

	// Идентификатор отзыва. 
	FeedbackId int64 `json:"feedbackId"`
}
