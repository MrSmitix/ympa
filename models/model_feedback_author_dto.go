package models

// FeedbackAuthorDto - Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
type FeedbackAuthorDto struct {

	// Имя автора отзыва.
	Name string `json:"name,omitempty"`

	Region RegionDto `json:"region,omitempty"`
}
