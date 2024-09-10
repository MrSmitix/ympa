package models

// GoodsFeedbackDescriptionDto - Текстовая часть отзыва.
type GoodsFeedbackDescriptionDto struct {

	// Описание плюсов товара в отзыве.
	Advantages string `json:"advantages,omitempty"`

	// Описание минусов товара в отзыве.
	Disadvantages string `json:"disadvantages,omitempty"`

	// Комментарий в отзыве.
	Comment string `json:"comment,omitempty"`
}
