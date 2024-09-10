package models

// ApiErrorDto - Общий формат ошибки.
type ApiErrorDto struct {

	// Код ошибки.
	Code string `json:"code"`

	// Описание ошибки.
	Message string `json:"message,omitempty"`
}
