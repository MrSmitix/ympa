package models
// FeedbackReactionStatusType : Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
type FeedbackReactionStatusType string

// List of FeedbackReactionStatusType
const (
	ALL FeedbackReactionStatusType = "ALL"
	NEED_REACTION FeedbackReactionStatusType = "NEED_REACTION"
)
