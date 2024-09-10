package models

// CategoryErrorDto - Текст ошибки.
type CategoryErrorDto struct {

	// Идентификатор категории.
	CategoryId int64 `json:"categoryId,omitempty"`

	Type CategoryErrorType `json:"type,omitempty"`
}
