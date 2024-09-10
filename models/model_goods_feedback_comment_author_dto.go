package models

// GoodsFeedbackCommentAuthorDto - Информация об авторе комментария.
type GoodsFeedbackCommentAuthorDto struct {

	Type GoodsFeedbackCommentAuthorType `json:"type,omitempty"`

	// Имя автора или название кабинета.
	Name string `json:"name,omitempty"`
}
