package models
// FeedbackStateType : Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
type FeedbackStateType string

// List of FeedbackStateType
const (
	LAST FeedbackStateType = "LAST"
	PREVIOUS FeedbackStateType = "PREVIOUS"
	DELETED FeedbackStateType = "DELETED"
)
