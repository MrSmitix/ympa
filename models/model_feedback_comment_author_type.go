package models
// FeedbackCommentAuthorType : Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
type FeedbackCommentAuthorType string

// List of FeedbackCommentAuthorType
const (
	USER FeedbackCommentAuthorType = "USER"
	SHOP FeedbackCommentAuthorType = "SHOP"
)
