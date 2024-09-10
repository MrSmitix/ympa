package models

// FeedbackCommentAuthorDto - Информация об авторе комментария.
type FeedbackCommentAuthorDto struct {

	Type FeedbackCommentAuthorType `json:"type,omitempty"`

	// Имя автора отзыва или название магазина.
	Name string `json:"name,omitempty"`
}
