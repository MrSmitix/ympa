package models

// ApiErrorResponse - Стандартная обертка для ошибок сервера.
type ApiErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
